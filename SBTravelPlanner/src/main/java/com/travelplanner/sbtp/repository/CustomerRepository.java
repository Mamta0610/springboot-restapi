package com.travelplanner.sbtp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.travelplanner.sbtp.entity.Customer;

//Repository to get predefined method of JpaRepository for Customer Entity
public interface CustomerRepository  extends JpaRepository<Customer, Integer>{
	
	//custom query
}
