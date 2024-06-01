package com.travelplanner.sbtp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelplanner.sbtp.entity.Login;
import com.travelplanner.sbtp.service.LoginService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.ServletException;

@RestController
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@PostMapping("/Loogin")
	public String validate(@RequestBody Login user)  throws ServletException{
		String jwtToken ="";
		if(user.getUserName() == null || user.getPassword() == null) {
			throw new ServletException("Mandotory to fill username & password");
		}
		
		String username =user.getUserName();
		String password = user.getPassword();
		user = ls.loginCustomer(username, password);
		
		if(user == null) {
			throw new ServletException("user details not found");
		}
		
		jwtToken = Jwts.builder().setSubject(username).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();				
				
		return jwtToken;
	}

}
