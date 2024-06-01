package com.techfire.gg.exception;

public class CartItemNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 2197931752142422868L;

	public CartItemNotFoundException(String messsage) {
		super(messsage);
	}
}
