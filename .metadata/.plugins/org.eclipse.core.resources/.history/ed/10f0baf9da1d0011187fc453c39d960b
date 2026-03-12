package com.bookstore.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.orderservice.client.ProductClient;
import com.bookstore.orderservice.dto.ProductDTO;
import com.bookstore.orderservice.model.Order;
import com.bookstore.orderservice.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	@Autowired
	private ProductClient productClient;

	public Order createOrder(Order order){

		ProductDTO product = productClient.getProduct(order.getProductId());

		if(product==null){
			throw new RuntimeException("Product not found");
		}

		order.setProductDescription(product.getProductDescription());
		order.setProductPrice(product.getProductPrice());

		return repo.save(order);
	}
}