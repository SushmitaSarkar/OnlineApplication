package com.onlineShoppingApp.OnlineShopping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="User")
public class User implements Serializable{
	
	
	@Id
	private String id;
	
	@Field("First_Name")
	private String firstName;
	
	@Field("Last_Name")
	private String LastName;
	
	@Field("Email")
	private String Email;
	
	@Field("Passowrd")
	private String password;
	
	@Field("ConfPassword")
	private String confPassword;
	
	@Field("ContactNumber")
	private String contactNumber;
	
	@Field("UserId")
	private String userName;
	
	@Field("Role")
	private String role;
	
	

}
