package com.bloodbank.sbbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.sbbm.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	public Login findByUserNameAndPassword(String userName, String password);

}