package com.onlineShoppingApp.OnlineShopping.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.onlineShoppingApp.OnlineShopping.model.AddProduct;
import com.onlineShoppingApp.OnlineShopping.repository.ProductDao;

@Service
public class consumer {
	@Autowired
	ProductDao productDao;

	@KafkaListener(topics = "${kafka.delete-topic}", groupId = "${kafka.group-id}")
	public void consumeLikesFromKafkaTopic(AddProduct addProduct) {
		productDao.save(addProduct);
	}
}
