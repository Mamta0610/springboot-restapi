package com.techfire.gg.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techfire.gg.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	//fetching category as per category name
	 @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId")
	    List<Product> findByCategoryId(@Param("categoryId") int categoryId);
	 
	 //fetching products on basis product ranges
	 @Query("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice")
	    List<Product> findByPriceBetween(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);
	
}
