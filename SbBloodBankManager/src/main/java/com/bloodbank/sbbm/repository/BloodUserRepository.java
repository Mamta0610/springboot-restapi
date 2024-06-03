package com.bloodbank.sbbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.sbbm.entity.BloodUser;

//repository to get predefined methods of JpaRepository for BloodUser Entity
public interface BloodUserRepository extends JpaRepository<BloodUser, Integer> {

	//custom query
	
}
