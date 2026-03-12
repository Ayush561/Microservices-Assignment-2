
package com.bookstore.orderservice.model;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;

	private Long productId;
	private String productDescription;
	private Double productPrice;
	private Integer quantity;

	public Order(){}

	public Long getOrderId(){ return orderId; }
	public void setOrderId(Long orderId){ this.orderId=orderId; }

	public Long getProductId(){ return productId; }
	public void setProductId(Long productId){ this.productId=productId; }

	public String getProductDescription(){ return productDescription; }
	public void setProductDescription(String productDescription){ this.productDescription=productDescription; }

	public Double getProductPrice(){ return productPrice; }
	public void setProductPrice(Double productPrice){ this.productPrice=productPrice; }

	public Integer getQuantity(){ return quantity; }
	public void setQuantity(Integer quantity){ this.quantity=quantity; }
}