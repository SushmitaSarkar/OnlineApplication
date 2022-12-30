package com.onlineShoppingApp.OnlineShopping.service;

import com.onlineShoppingApp.OnlineShopping.model.User;
import com.onlineShoppingApp.OnlineShopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserConfigService  implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		User foundedUser = userRepository.findByUserName(username);
		if(foundedUser == null) return null;
		String name = foundedUser.getUserName();
		String pwd = foundedUser.getPassword();
		return new org.springframework.security.core.userdetails.User(name, pwd, new ArrayList<>());
	}

}
