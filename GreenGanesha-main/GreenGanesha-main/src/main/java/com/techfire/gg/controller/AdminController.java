package com.techfire.gg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techfire.gg.entity.Product;
import com.techfire.gg.entity.User;
import com.techfire.gg.service.AdminService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AdminController {
	
	@Autowired
	AdminService as;
	
	//update product
	@PutMapping("/updateProduct/{pId}")
	 public Product updateProduct(@PathVariable("pId") int pId, @RequestBody Product product) {
		 return as.updateProduct(product, pId);
	 }
	 
	
	//getAllUser
	@GetMapping("/getUsers")
	public List<User> getAllUsers(){
		return as.getAllUser();	
	}
	 
}
