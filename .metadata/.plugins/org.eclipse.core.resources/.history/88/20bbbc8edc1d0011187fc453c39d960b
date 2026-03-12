package com.bookstore.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookstore.orderservice.model.Order;
import com.bookstore.orderservice.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@PostMapping
	public Order createOrder(@RequestBody Order order){
		return service.createOrder(order);
	}
}