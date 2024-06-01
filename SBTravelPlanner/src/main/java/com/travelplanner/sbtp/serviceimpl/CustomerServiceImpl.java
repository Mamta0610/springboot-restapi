package com.travelplanner.sbtp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.travelplanner.sbtp.entity.Customer;
import com.travelplanner.sbtp.exception.CustomerIDNotFoundException;
import com.travelplanner.sbtp.repository.CustomerRepository;
import com.travelplanner.sbtp.service.CustomerService;

//business logic for entity customer 
@Service
public class CustomerServiceImpl  implements CustomerService{
	//using spring dependency injection which marks constructor, getter-setter
	@Autowired
	CustomerRepository custRepo;

	//Registering customer into db table using save of jpaRepository
	@Override
	public Customer registerCustomer(Customer customer) {	
		return custRepo.save(customer);
	}
//editing customer details using findById() & save() of JpaRepository 
	@Override
	public Customer editCustomer(Customer customer, int cId) {
		//fetch customer data based on id, if not found throw exception 
	Customer updatedCustomerdetails = custRepo.findById(cId).orElseThrow(() -> new CustomerIDNotFoundException("Entered Customer id is not proper / Invalid"));
	
	//set new values to customer entity
	updatedCustomerdetails.setCPhone(customer.getCPhone());
	updatedCustomerdetails.setAddr(customer.getAddr());
	
	custRepo.save(updatedCustomerdetails); //saving updated info in Customer Entity
	return updatedCustomerdetails;
	}

	//removing an customer record from db table using deleteById() of JpaRepository
	@Override
	public void removeCustomer(int cId) {
		//fetch customer data based on id, if not found throw exception 
		custRepo.findById(cId).orElseThrow(() -> new CustomerIDNotFoundException("Entered Customer id is not proper / Invalid"));
		
		//if id found then delete data of customer 
		custRepo.deleteById(cId);
		
	}
//fetch an customer record from db table using findById() of JpaRepository
	@Override
	public Customer fetchCustomerDetail(int cId) {
		//fetch customer data based on id, if not found throw exception 
	return custRepo.findById(cId).orElseThrow(() -> new CustomerIDNotFoundException("Entered Customer id is not proper / Invalid"));
	}
	
	
	
}
