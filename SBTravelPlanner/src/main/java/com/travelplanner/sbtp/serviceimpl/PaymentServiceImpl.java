package com.travelplanner.sbtp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelplanner.sbtp.entity.PaymentDetails;
import com.travelplanner.sbtp.repository.PaymentRepository;
import com.travelplanner.sbtp.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentRepository pprepo;

	@Override
	public PaymentDetails addPayment(PaymentDetails paymentdetails) {
		return pprepo.save(paymentdetails);
	}

}
