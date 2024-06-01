package com.travelplanner.sbtp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	
	@NotBlank(message="Type is mandotory to mention")
	@Column(length=15, nullable = false)
	private String type;
		
	private String roomType;
	
	@NotBlank(message="CheckinDate is mandotory to mention")
	@Column(length=10, nullable = false)
	private String checkinDate;
	
	@NotBlank(message="CheckoutDate is mandotory to mention")
	@Column(length=15, nullable = false)
	private String checkoutDate;
	
	@NotBlank(message="noOfDays is mandotory")
	@Column(length=15, nullable = false)
	private String noOfDays;
	
	@NotNull(message="Mandotory to mention no of adults")
	@Column(length=15, nullable = false)
	private int noOfAdult;
	
	@NotNull(message = "Mandotory to mention no of kids")
	@Column(length=15, nullable = false)
	private int noOfKids;
	
	@NotBlank(message="City is mandotory")
	@Column(length=30, nullable = false)
	private String City;
	
	@NotBlank(message="PackageName_HotelName is mandotory")
	@Column(length=50, nullable = false)
	private String PackageName_HotelName;
	
	@ManyToOne(fetch=FetchType.EAGER,
			cascade = CascadeType.ALL)
	@JoinColumn(name="customerId", referencedColumnName = "cId")
	@JsonBackReference
	Customer customer;
	
}
