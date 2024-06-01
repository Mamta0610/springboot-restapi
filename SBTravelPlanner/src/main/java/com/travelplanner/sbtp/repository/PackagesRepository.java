package com.travelplanner.sbtp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.travelplanner.sbtp.entity.Packages;

public interface PackagesRepository  extends JpaRepository<Packages, Integer>{
	
	@Query("Select pg from Packages pg where pg.city=?1")
	List<Packages>  findByCityy(String city);
}
