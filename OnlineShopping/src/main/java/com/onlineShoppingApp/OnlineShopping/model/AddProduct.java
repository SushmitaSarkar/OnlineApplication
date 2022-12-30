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
@Document(collection="AddProduct")
public class AddProduct implements Serializable{
	
	
	@Id
	private String productId;
	
	@Field("Product_Name")
	//@NonNull(message = "Campaign Name is compulsory")
	private String productName;
	
	@Field("Product_Description")
	private String productDescription;
	
	
	private float price;
	
	@Field("Product_Features")
	private String features;
	
	@Field("Status")
	private String productStatus;
	
	@Field("ProductQuantity")
	private int productQuantity;
	

	@Override
	public String toString() {
		return "AddProduct [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", price=" + price + ", features=" + features + ", productStatus="
				+ productStatus + ", productQuantity=" + productQuantity + "]";
	}



	

}
