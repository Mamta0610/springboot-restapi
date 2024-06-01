package com.travelplanner.sbtp.service;

import java.util.List;
import com.travelplanner.sbtp.entity.Packages;

public interface PackagesService {
	
	//fetch packages list from db table 
	List<Packages>   fetchPackagesDetails();
	
	//fetch packages list from db table  as per city
	List<Packages>   fetchpackageDetails1(String city);
}
