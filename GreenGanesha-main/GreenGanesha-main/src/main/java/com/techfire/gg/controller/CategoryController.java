package com.techfire.gg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techfire.gg.entity.Category;
import com.techfire.gg.service.CategoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CategoryController {
	@Autowired
	CategoryService cs;
	
	@GetMapping("/allcategory")
	List<Category> getAllCategory(){
		return cs.getAllCategory();
	}
	
    }

