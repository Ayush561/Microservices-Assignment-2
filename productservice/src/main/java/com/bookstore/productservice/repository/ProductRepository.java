
package com.bookstore.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookstore.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}