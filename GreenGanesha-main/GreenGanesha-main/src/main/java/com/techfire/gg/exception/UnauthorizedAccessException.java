package com.techfire.gg.exception;

public class UnauthorizedAccessException extends RuntimeException{
	private static final long serialVersionUID = 2197931752142422868L;

	public UnauthorizedAccessException(String messsage) {
		super(messsage);
	}
}
