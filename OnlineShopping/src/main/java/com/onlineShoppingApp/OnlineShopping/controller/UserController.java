package com.onlineShoppingApp.OnlineShopping.controller;

import com.onlineShoppingApp.OnlineShopping.dto.AuthenticationResponse;
import com.onlineShoppingApp.OnlineShopping.dto.Password;
import com.onlineShoppingApp.OnlineShopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PutMapping(value="/shopping/{customername}/forgot")
	public ResponseEntity<?> changePassowrd(@PathVariable("customername") String username,
			@RequestBody Password newPassword){
		try {
			return new ResponseEntity<>(userService.changePassword(username, newPassword.getNewPassword() , newPassword.getContact()), HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(new AuthenticationResponse("Unable to change password"),
					HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
	// Method to retrieve all users list
		@GetMapping(value = "/shopping/users/all")
		public ResponseEntity<?> getAllUsers() {
			return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);

		}
		
		//method to search for like users by username
		@GetMapping(value = "/shopping/user/search/{username}")
		public ResponseEntity<?> searchForUsers(@PathVariable String username){
			return new ResponseEntity<>(userService.getUsersByUsername(username), HttpStatus.OK);
		}

}
