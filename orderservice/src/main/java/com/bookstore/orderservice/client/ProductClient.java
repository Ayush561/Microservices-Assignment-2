package com.bookstore.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.bookstore.orderservice.dto.ProductDTO;

@FeignClient(name="product-service",url="http://localhost:8081")  //If the feign is not searched by service name then url can help.
public interface ProductClient {

	@GetMapping("/api/products/{id}")
	ProductDTO getProduct(@PathVariable Long id);

}