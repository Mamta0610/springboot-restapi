package com.travelplanner.sbtp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PaymentDetails {
	
	@Id
	private int ppid;
	
	@NotNull(message="Add amount to proceed")
	private long payableamt;
	
	@NotBlank(message="Mandotory to add mode")
	@Column(length=10, nullable = false)
	private String paymentMode;

	
	
}
