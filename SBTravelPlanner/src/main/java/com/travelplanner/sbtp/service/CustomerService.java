package com.travelplanner.sbtp.service;

import com.travelplanner.sbtp.entity.Customer;

//abstract method for performing CRUD on entity Customer
public interface CustomerService {
	
	//register an new customer in db table
	Customer registerCustomer(Customer customer);
	
	//edit existing customer detail based on id from db table
	Customer editCustomer(Customer customer, int cId);
	
	//remove existing customer record based on id from db table
	void removeCustomer(int cId);
	
	//fetch customer details based on from db table
	Customer fetchCustomerDetail(int cId);
}
