package com.onlineShoppingApp.OnlineShopping.Producer;



import org.springframework.kafka.core.KafkaTemplate;

import com.onlineShoppingApp.OnlineShopping.model.AddProduct;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteProducer {

	private final KafkaTemplate<String, AddProduct> kafkaTemplate;
	
	public void sendDeleteProductToKafkaTopic(AddProduct deleteProduct) {
		kafkaTemplate.send("Product-delete-topic", deleteProduct);
	}

	
}
