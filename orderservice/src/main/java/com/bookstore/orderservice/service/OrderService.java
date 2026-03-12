package com.bookstore.orderservice.service;

import org.springframework.stereotype.Service;

import com.bookstore.orderservice.client.ProductClient;
import com.bookstore.orderservice.dto.ProductDTO;
import com.bookstore.orderservice.model.Order;
import com.bookstore.orderservice.repository.OrderRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

	//@Autowired
	private final OrderRepository repo;  
	//Now the dependency injection is done by @RequiredArgsConstructor but we need to make it final then only it will work.

	//@Autowired
	private final ProductClient productClient; 
	//Now the dependency injection is done by @RequiredArgsConstructor but we need to make it final then only it will work.

	@CircuitBreaker(name="productService" , fallbackMethod = "createOrderFallBack")  
	//If the product service turns down then it won't show internal error, it will show the message present in createOrderFallBack method.
	public Order createOrder(Order order){

		ProductDTO product = productClient.getProduct(order.getProductId());

		if(product==null){
			throw new RuntimeException("Product not found");
		}

		order.setProductDescription(product.getProductDescription());
		order.setProductPrice(product.getProductPrice());

		return repo.save(order);
	}
	
	
	//Fallback method must have the same return type as the original method (Order)
	public Order createOrderFallBack(Order order, Throwable ex) {
		
		Order fallbackOrder = new Order();
		
		fallbackOrder.setProductId(order.getProductId());
		fallbackOrder.setQuantity(order.getQuantity());
		fallbackOrder.setProductDescription("Product service not active");
		fallbackOrder.setProductPrice(0.0);
		
		return fallbackOrder;
	}
}