
package com.bookstore.productservice.model;

import jakarta.persistence.*;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	private String productName;
	private String productDescription;
	private Double productPrice;

	public Product(){}

	public Long getProductId(){ return productId; }
	public void setProductId(Long productId){ this.productId=productId; }

	public String getProductName(){ return productName; }
	public void setProductName(String productName){ this.productName=productName; }

	public String getProductDescription(){ return productDescription; }
	public void setProductDescription(String productDescription){ this.productDescription=productDescription; }

	public Double getProductPrice(){ return productPrice; }
	public void setProductPrice(Double productPrice){ this.productPrice=productPrice; }
}