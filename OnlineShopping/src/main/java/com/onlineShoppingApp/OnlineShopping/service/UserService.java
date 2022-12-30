package com.onlineShoppingApp.OnlineShopping.service;

import com.onlineShoppingApp.OnlineShopping.Exception.UsernameAlreadyExists;
import com.onlineShoppingApp.OnlineShopping.model.User;
import com.onlineShoppingApp.OnlineShopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	// create new user
		public User createUser(User user) throws UsernameAlreadyExists {
			User foundedUser = userRepository.findByUserName(user.getUserName());
			if (foundedUser != null) {
				throw new UsernameAlreadyExists("username already exists");
			}
		//	user.setId(UUID.randomUUID().toString());
			return userRepository.save(user);
		}
	
		
		// find user by username
		public User findByUsername(String username) {
			User user = userRepository.findByUserName(username);
			return new User(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),"null",
					"null", user.getContactNumber(),user.getUserName(),user.getRole());
		}
		
		
		// Method to return a list of all users
		@Transactional
		public List<User> getAllUsers() {
			List<User> users = userRepository.findAll();
			System.out.println(users);
			return users.stream().map(user -> 
				new User(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),"null",
						"null", user.getContactNumber(),user.getUserName(),user.getRole())).collect(Collectors.toList());
		}
		
	//change password 
	public User changePassword(String username,String newPassword, String contact) throws Exception{
		User userDetails=userRepository.findByUserName(username);
		if(userDetails.getContactNumber().equalsIgnoreCase(contact)
				&& userDetails.getUserName().equalsIgnoreCase(username)) {
			return userRepository.save(userDetails);
			
		}else {
			
			throw new Exception("Unable to chnage password");
			
		}
	}
	// Method to search for like users by username
		public List<User> getUsersByUsername(String username) {
			return userRepository.searchByUsername(username);
		}
	
}
