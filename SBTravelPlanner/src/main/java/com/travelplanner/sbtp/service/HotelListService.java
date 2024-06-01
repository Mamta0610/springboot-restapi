package com.travelplanner.sbtp.service;

import java.util.List;
import com.travelplanner.sbtp.entity.HotelList;


public interface HotelListService {
	
	//fetch hotel list from db table 
	List<HotelList>   fetchHotelDetails();
	
	//fetch hotel list from db table  as per city
	List<HotelList>   fetchHotelDetails1(String city);
	
}
