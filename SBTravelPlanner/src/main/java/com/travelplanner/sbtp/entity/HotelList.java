package com.travelplanner.sbtp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//hotelList entity

@Entity
@Getter
@Setter
public class HotelList {
	
	@Id
	private int hid;
	
	@Column(name="roomType", length=20, nullable = false)
	private String roomType;
	
	@Column(name="price", nullable = false)
	private String price;
	
	@Column(name="hotelName", length=30, nullable = false)
	private String hotelName;
	
	@Column(name="contactNo", nullable = false, unique = true)
	private long contactNo;
	
	@Column(name="city", length=30, nullable = false)
	private String city ;
	
	@Column(name="addr", length=40, nullable = false)
	private String addr;
	
	@Column(name="avaliability", length=5, nullable = false)
	private String avaliability;
}
