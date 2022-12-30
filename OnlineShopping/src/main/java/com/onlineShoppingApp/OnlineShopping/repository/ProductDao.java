package com.onlineShoppingApp.OnlineShopping.repository;


import com.onlineShoppingApp.OnlineShopping.model.AddProduct;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends MongoRepository<AddProduct, String>{
	
	//List<AddProduct> findByProductName(String name);
	@Query("{Product_Name: ?0}")
	List<AddProduct> findByProductName(String name);
   


}
