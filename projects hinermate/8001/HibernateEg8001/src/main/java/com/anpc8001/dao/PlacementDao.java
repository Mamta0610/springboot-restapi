package com.anpc8001.dao;

import java.util.List;

import com.anpc8001.entity.Placement;

public interface PlacementDao {
		void addPlacementDetail(); 
		void viewPlacementDetailById(); 
		List<Placement> getAllPlacementDetails(); 
		void updatePlacementDetails(); //update techstack, opp2, opp3 		
}
