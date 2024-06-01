package com.travelplanner.sbtp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Packages {
	
	@Id
	private int pid;
	
	@Column(length=50, nullable = false)
	private String packageName;
	
	@Column(length=30, nullable = false)
	private String city;
	
	@Column(nullable = false)
	private long price;
	
	@Column(length=30, nullable = false)
	private String State;
	
	@Column(length=80, nullable = false)
	private String Description;
	
}
