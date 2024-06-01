package com.techfire.gg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techfire.gg.service.CartService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CartController {
	
	@Autowired
	CartService cs;
	
	//get cartitem of particular user cart
	@GetMapping("/getCartItems")
	public List<Object[]> getProductsByCart(@RequestParam int id){
		return cs.getUserCartItems(id);
	}
	
	//remove product froom the cart
	@DeleteMapping("/removeProductFromCart")
	public ResponseEntity<String> removeProduct(@RequestParam int uId,@RequestParam int pId) {
		cs.removeProductFromCart(uId, pId);
		return new ResponseEntity<>("product removed from cart successfully", HttpStatus.OK);
	}
}
