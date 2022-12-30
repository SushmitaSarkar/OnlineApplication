package com.onlineShoppingApp.OnlineShopping.repository;

import com.onlineShoppingApp.OnlineShopping.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User findByUserName(String username);
	@Query("{'UserId':{'$regex':'?0','$options':'i'}}")
	List<User> searchByUsername(String username);
}
