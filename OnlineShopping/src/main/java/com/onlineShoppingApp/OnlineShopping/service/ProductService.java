package com.onlineShoppingApp.OnlineShopping.service;

import com.onlineShoppingApp.OnlineShopping.Exception.InvalidUsernameException;
import com.onlineShoppingApp.OnlineShopping.Exception.ProductDoesNotExistException;
import com.onlineShoppingApp.OnlineShopping.Producer.DeleteProducer;
import com.onlineShoppingApp.OnlineShopping.dto.ProductResponse;
import com.onlineShoppingApp.OnlineShopping.model.AddProduct;
import com.onlineShoppingApp.OnlineShopping.model.User;
import com.onlineShoppingApp.OnlineShopping.repository.ProductDao;
import com.onlineShoppingApp.OnlineShopping.repository.UserRepository;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;


@Slf4j
@Service
public class ProductService {

	
	private final Logger logger = LoggerFactory.getLogger(ProductService.class);
	@Autowired
	private ProductDao productDao;
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DeleteProducer deleteProducer;
	
	private static final String productDoesNotExistMessage = "This Product does not exist anymore.";
	
	
	
	public AddProduct addNewProduct(String userName,AddProduct newProduct)  throws InvalidUsernameException{
		
		User users= userRepository.findByUserName(userName);
		if(users.getRole().equalsIgnoreCase("Admin")) {
		
		newProduct.setProductId(UUID.randomUUID().toString());
		logger.info("new product added by user {}" ,userName);
		
		return productDao.save(newProduct);
		}
		else {
			throw new InvalidUsernameException("Username is unauthorized to perform this action");
		}
	}
	
	public List<AddProduct> getAllProduct() {
		 return productDao.findAll();
	}
	
	public List<ProductResponse> getProductByName(String productname,String loggedInUser) throws InvalidUsernameException{
		
		
				if (!StringUtils.isBlank(productname)) {
					List<AddProduct> products=productDao.findByProductName(productname);
					logger.info("list of products are {}",productname,products);
					return products.stream().map(product ->{
						return new ProductResponse(product.getProductId(),product.getProductName(),product.getProductDescription(),
								product.getFeatures(),product.getProductStatus(),product.getPrice());
					}).collect(Collectors.toList());
				}
				else {
					throw new InvalidUsernameException("Username/loginId provided is invalid");
				}
	}
	
	public AddProduct updateProduct(String productname, String id,AddProduct addproduct,String loggedInUser) throws InvalidUsernameException, ProductDoesNotExistException {
		
		User users= userRepository.findByUserName(loggedInUser);
		if(users.getRole().equalsIgnoreCase("Admin")) {
		System.out.println("product name "+ productname);
//		List<AddProduct> product=productDao.findByProductName(productname);
		
		//System.out.println(product);
		//List<AddProduct> updateProduct = product.stream().filter(x-> compareId(x.getProductId(), id)).collect(Collectors.toList());
		Optional<AddProduct> updateProduct=productDao.findById(id);
		updateProduct.get().setFeatures(addproduct.getFeatures());
		updateProduct.get().setPrice(addproduct.getPrice());
		updateProduct.get().setProductDescription(addproduct.getProductDescription());
		
		if (updateProduct.get().getProductQuantity()>0) {
			
			System.out.println("Welcome to service");
			System.out.println("id:"+id);
			
			updateProduct.get().setProductStatus("HURRY UP TO PURCHASE");
			log.info("Product updated  {}",id,productname);
			return productDao.save(updateProduct.get());
			
		}else {
			updateProduct.get().setProductStatus("Out of Stock");
			log.info("Product updated  {}",id,productname);
			return productDao.save(updateProduct.get());
		}
		
		}else {
			throw new InvalidUsernameException("Username is unauthorized to perform this action");
		}
		
	
	}
	
	
//	private boolean compareId(String productId, String id) {
//		// TODO Auto-generated method stub
//		System.out.println(productId);
//		System.out.println(id);
//		return productId.equalsIgnoreCase(id);
//		//return null;
//	}

	public boolean deleteProduct(String productId) throws ProductDoesNotExistException {
		Optional<AddProduct> deleteProduct=productDao.findById(productId);
		if (productDao.existsById(productId) && !StringUtils.isBlank(productId)) {
			deleteProducer.sendDeleteProductToKafkaTopic(deleteProduct.get());
			productDao.deleteById(productId);
			return true;
		} else {

			throw new ProductDoesNotExistException(productDoesNotExistMessage);
		}
	}
	
}
