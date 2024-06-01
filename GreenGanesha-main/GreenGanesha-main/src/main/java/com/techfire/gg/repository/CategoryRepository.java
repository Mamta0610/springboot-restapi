package com.techfire.gg.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.techfire.gg.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
}
