package com.bookstore.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookstore.productservice.model.Product;
import com.bookstore.productservice.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping
	public Product createProduct(@RequestBody Product product){
		return service.createProduct(product);
	}

	@GetMapping
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}

	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id){
		return service.getProduct(id);
	}
}