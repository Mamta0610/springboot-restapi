package com.techfire.gg.service;

import java.util.List;

public interface CartService {
	
	//get the list of products in a user's cart
	public  List<Object[]> getUserCartItems(int uId);
	
	//remove product from cart
	public void removeProductFromCart(int uId,int pId);
}
