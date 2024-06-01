package com.travelplanner.sbtp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.travelplanner.sbtp.entity.Customer;
import com.travelplanner.sbtp.service.CustomerService;
import jakarta.validation.Valid;

//handle all incoming request for entity customer
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	//using post mapping to add customer details with httpstatus created & code 201
	@PostMapping("/regsiterCustomer")
	//valid - will check all validation of customer entity during runtime
	//requestbody - indicates method parameter should be bound to the body of the web request
	public ResponseEntity<Customer> saveCustomer(@Valid @RequestBody Customer customer){
		return new ResponseEntity<Customer>(cs.registerCustomer(customer),HttpStatus.CREATED);
	}
	
	//using get mapping to fetch customer based in id with httpstatus OK & code 200
	@GetMapping("/fetchCustomer/{cId}")
	//pathVariable - indicates that a method parameter should be bound to a URI template variable
	public ResponseEntity<Customer> fetchCustomer(@PathVariable("cId") int cId){
		return new ResponseEntity<Customer>(cs.fetchCustomerDetail(cId), HttpStatus.OK);	
	}
	
	//using delete mapping to remove customer based on id with 
	@DeleteMapping("/deleteCustomer/{cId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("cId") int cId){
		cs.removeCustomer(cId);
		return new ResponseEntity<String>("Deleted Customer Record", HttpStatus.OK);
	}
	
	@PutMapping("/editCustomer/{cId}")
	public ResponseEntity<Customer> editCustomer(@Valid @PathVariable("cId") int cId,
			@RequestBody Customer customer){
		return new ResponseEntity<Customer>(cs.editCustomer(customer, cId), HttpStatus.OK);
	}
	
}
