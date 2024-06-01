package com.techfire.gg.service;

import java.util.List;

public interface OrderService {
	
	//method to place the order
	public void placeOrder(int uId);
	
	//get order details
	public List<Object[]> getOrderDetails(int uId);
	
	public List<Object[]>  findOrderDetailsByUserId(int uId);

}
