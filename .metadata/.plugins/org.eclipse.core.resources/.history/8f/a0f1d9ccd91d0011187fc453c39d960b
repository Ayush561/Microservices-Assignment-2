package com.bookstore.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.bookstore.orderservice.dto.ProductDTO;

@FeignClient(name="product-service")
public interface ProductClient {

	@GetMapping("/api/products/{id}")
	ProductDTO getProduct(@PathVariable Long id);

}