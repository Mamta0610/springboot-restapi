package com.techfire.gg.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.techfire.gg.entity.User;


// this repository is responsible for interacting with database
public interface UserRepository extends JpaRepository<User,Integer> {
	
	public User findByEmail(String email);
	
	

}
