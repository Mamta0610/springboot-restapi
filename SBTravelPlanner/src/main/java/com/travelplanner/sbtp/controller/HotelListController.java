package com.travelplanner.sbtp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.travelplanner.sbtp.entity.HotelList;
import com.travelplanner.sbtp.service.HotelListService;

//Controller for all incoming request on hotelList entity 
@RestController
public class HotelListController {
	
	@Autowired
	HotelListService hs;
	
	//get mapping to fetch all hotel 
	@GetMapping("/getHotelList")
	public List<HotelList> getHotels(){
		return hs.fetchHotelDetails();
	}
	
	//get mapping with parameter for hotel list as per city
	@GetMapping("/getHotelList/{city}")
	public List<HotelList> getHotelsByCity(@PathVariable("city") String city){
		return hs.fetchHotelDetails1(city);
	}
	
	
}
