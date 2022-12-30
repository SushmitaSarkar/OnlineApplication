package com.onlineShoppingApp.OnlineShopping.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse implements  Serializable{

	private String productId;

	private String productName;
	private String productDesc;
	
	private String features;
	
	private String productStatus;
	private float price;

}
