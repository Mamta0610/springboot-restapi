package com.travelplanner.sbtp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelplanner.sbtp.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	public Login findByUserNameAndPassword(String userName, String password);

}
