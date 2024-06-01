package com.techfire.gg.service;

public interface CartItemsService {
		
	 // updates the cart item quantity
	 public void updateCartItemQuantity(int userId,int productId, int quantity);
}
