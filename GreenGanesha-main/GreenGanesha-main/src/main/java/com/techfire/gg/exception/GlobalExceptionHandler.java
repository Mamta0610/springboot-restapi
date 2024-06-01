package com.techfire.gg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	//User Id Not Found
	@ExceptionHandler(UserIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleCustomerException(
			UserIdNotFoundException ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	//product ID not found
	@ExceptionHandler(ProductIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleProductException(
			ProductIdNotFoundException ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	//CartItem ID Not Found
	@ExceptionHandler(CartItemNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleCartItemsException(
			ProductIdNotFoundException ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	
	@ExceptionHandler(UnauthorizedAccessException.class)
	public ResponseEntity<ErrorMessage> handleUnauthorizedAccessException(
			ProductIdNotFoundException ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
}
