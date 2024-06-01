package com.travelplanner.sbtp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelplanner.sbtp.entity.PaymentDetails;

public interface PaymentRepository  extends JpaRepository<PaymentDetails, Integer>{
	
}
