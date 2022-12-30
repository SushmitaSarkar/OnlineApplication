package com.onlineShoppingApp.OnlineShopping.controller;

import com.onlineShoppingApp.OnlineShopping.Exception.InvalidUsernameException;
import com.onlineShoppingApp.OnlineShopping.Exception.ProductDoesNotExistException;
import com.onlineShoppingApp.OnlineShopping.dto.ErrorResponse;
import com.onlineShoppingApp.OnlineShopping.model.AddProduct;
import com.onlineShoppingApp.OnlineShopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	
	private static final String errorMessage="Application has faced an issue";
	
//	private GridFsOperations gridFsOperations;
	

	
	///add new product
	@PostMapping(value="/shopping/{username}/add")
	public ResponseEntity<?> createProductRequest(@PathVariable("username") String userName, @RequestBody AddProduct addProduct) {
		try {
		return new ResponseEntity<>(productService.addNewProduct(userName,addProduct),HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(new ErrorResponse(e.getMessage()),
					HttpStatus.FORBIDDEN);
		}
	}
	
	//view all product 
	@GetMapping(value="/shopping/all")
	public ResponseEntity<?> getAllProduct(){
		try {
			return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(new ErrorResponse(errorMessage),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Method get product by name
	@GetMapping(value="/shopping/products/search/{productname}")
	public ResponseEntity<?> getProductByName(@PathVariable("productname") String productname,
			@RequestHeader(value="loggedInUser")String loggedInUser){
		try {
			return new ResponseEntity<>(productService.getProductByName(productname,loggedInUser),HttpStatus.OK);
		}catch(InvalidUsernameException e) {
			return new ResponseEntity<>(new ErrorResponse("Invalid User"),HttpStatus.UNPROCESSABLE_ENTITY);
		}catch(Exception e) {
			return new ResponseEntity<>(new ErrorResponse(errorMessage),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//method to update product
	@PutMapping(value="/shopping/{productname}/update/{productId}")
	public ResponseEntity<?> updateProduct(@PathVariable("productname") String productname ,@PathVariable("productId")String productId,
			@RequestHeader(value="loggedInUser")String loggedInUser,  @RequestBody AddProduct productUpdate) throws ProductDoesNotExistException{
		
	       try{
	    	   System.out.println(productId);
	    	   return new ResponseEntity<>(
	    			   productService.updateProduct(productname,productId,productUpdate,loggedInUser),HttpStatus.OK);
	       }catch (Exception e) {
	    	   e.printStackTrace();
				return new ResponseEntity<>(new ErrorResponse(errorMessage),
						HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
	
	// Method to delete a product by id
		@DeleteMapping(value = "/shopping/{productname}/delete/{productId}")
		public ResponseEntity<?> deleteProduct(@PathVariable("productname") String productname ,@PathVariable("productId")String productId,
				@RequestHeader(value = "loggedInUser") String userID) {
			
			try {
				
				return new ResponseEntity<>(productService.deleteProduct(productId), HttpStatus.OK);
			} catch (ProductDoesNotExistException e) {
				return new ResponseEntity<>(new ErrorResponse("Given Product cannot be found"), HttpStatus.NOT_FOUND);
			} catch (Exception e) {
				return new ResponseEntity<>(new ErrorResponse(errorMessage),
						HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	

}
