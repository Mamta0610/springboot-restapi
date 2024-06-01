package com.techfire.gg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techfire.gg.exception.CartItemNotFoundException;
import com.techfire.gg.exception.UnauthorizedAccessException;
import com.techfire.gg.exception.UserIdNotFoundException;
import com.techfire.gg.service.CartItemsService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CartItemsController {
	
	@Autowired
	CartItemsService cis;
	 @PutMapping("/updateCartItemQuantity")
	 public ResponseEntity<String> updateCartItemQuantity(@RequestParam int userId,
	            @RequestParam int productId,
	            @RequestParam int quantity) {
		 try {
	            cis.updateCartItemQuantity(userId, productId, quantity);
	            return new ResponseEntity<>("product quantity updated successfully", HttpStatus.OK);
	        } catch (UserIdNotFoundException | CartItemNotFoundException | UnauthorizedAccessException e) {
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	        }
		 
		 
	 }
}

