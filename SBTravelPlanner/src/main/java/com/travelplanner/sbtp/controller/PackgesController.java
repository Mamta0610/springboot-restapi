package com.travelplanner.sbtp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.travelplanner.sbtp.entity.Packages;
import com.travelplanner.sbtp.service.PackagesService;

@RestController
public class PackgesController {
	
	@Autowired
	PackagesService ps;
	
	//get mapping to fetch all packages 
		@GetMapping("/getPackageList")
		public List<Packages> getPackages(){
			return ps.fetchPackagesDetails();
		}
		
		//get mapping with parameter for packages list as per city
		@GetMapping("/getpackagesList/{city}")
		public List<Packages> getPackagesByCity(@PathVariable("city") String city){
			return ps.fetchpackageDetails1(city);
		}
	
	
}
