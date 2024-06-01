package com.techfire.gg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // it will auto increment ID
	private int aId;
	
	@Column(length=15,nullable=false)
	private String adminName;
	
	@Column(length = 12, nullable = false, unique = true)
	@NotNull(message = "admin number is mandatory")
	private long aPhone;
	
	@Column(length=25,nullable=false,unique=true)
	@NotBlank(message = "fill the password")
	private String password;
	
}
