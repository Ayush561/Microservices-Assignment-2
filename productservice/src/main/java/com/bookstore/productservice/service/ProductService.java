package com.bookstore.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.productservice.model.Product;
import com.bookstore.productservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public Product createProduct(Product product){
		return repo.save(product);
	}

	public List<Product> getAllProducts(){
		return repo.findAll();
	}

	public Product getProduct(Long id){
		return repo.findById(id).orElse(null);
	}
}