package com.techfire.gg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techfire.gg.entity.Login;

public interface LoginRepository extends JpaRepository<Login,Integer >{
		
	public Login findByUserNameAndPassword(String username,String password);
			
		
}
