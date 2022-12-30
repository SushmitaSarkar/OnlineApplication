package com.onlineShoppingApp.OnlineShopping.controller;

import com.onlineShoppingApp.OnlineShopping.Exception.UsernameAlreadyExists;
import com.onlineShoppingApp.OnlineShopping.dto.AuthenticationRequest;
import com.onlineShoppingApp.OnlineShopping.dto.AuthenticationResponse;
import com.onlineShoppingApp.OnlineShopping.model.User;
import com.onlineShoppingApp.OnlineShopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

	@Autowired
	private UserService userService;


	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/shopping/register")
	public ResponseEntity<?> registerUser(@RequestBody User user){
		try {
			User oldUser=userService.createUser(user);
			return new ResponseEntity<>(oldUser,HttpStatus.CREATED);
		}catch(UsernameAlreadyExists e) {
			return new ResponseEntity<>(new AuthenticationResponse("Given userId/email already exists"),
					HttpStatus.CONFLICT);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new AuthenticationResponse("Issue occur"), 
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/shopping/login")
	public ResponseEntity<?> authenticateUser(@RequestBody AuthenticationRequest authenticationRequest) {
		String username = authenticationRequest.getUserName();
		String password = authenticationRequest.getPassword();
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (Exception e) {
			return new ResponseEntity<>(new AuthenticationResponse("Bad Credentials " + username),
					HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<>(userService.findByUsername(username), HttpStatus.OK);
	}
}
