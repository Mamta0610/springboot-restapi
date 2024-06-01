package com.techfire.gg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techfire.gg.entity.User;
import com.techfire.gg.service.UserService;
import jakarta.validation.Valid;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired 
	UserService us;
	
	
	//resister new user
	@PostMapping("/registerUser")
	public ResponseEntity<User> registerUser( @Valid @RequestBody User user){
		return new ResponseEntity<User>(us.registerUser(user),HttpStatus.CREATED);
	}
	
	//fetch user data from table
	@GetMapping("/fetchUser/{uId}")
	public ResponseEntity<User> fetchUserData(@PathVariable("uId") int uId) {
		return  new ResponseEntity<User>(us.displayUserDetails(uId),HttpStatus.OK);
	}
	
	
	
	//delete user
	@DeleteMapping("/deleteUser/{uId}")
	public ResponseEntity<String> deleteCutomer(@PathVariable("uId") int uId){
		us.removeUser(uId);
		return new ResponseEntity<String>("Delete User Record",HttpStatus.OK);
	}
	
	//updating user
	@PutMapping("/editUser/{uId}")
	public ResponseEntity<User> editUser(@Valid @PathVariable("uId") int uId, @RequestBody User user){
			return new ResponseEntity<User>(us.editUser(user, uId), HttpStatus.OK);
		}
	
	//user Login
	
		@PostMapping("/loginUser")
	    public ResponseEntity<String> loginUser(@RequestParam String email, @RequestParam String password) {
	        User user = us.findByEmail(email);

	        if (user != null) {
	            
	            if (user.getPassword().equals(password)) {
	                String userIdString = String.valueOf(user.getUId());
	                return ResponseEntity.ok(userIdString);
	            } else {
	                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	            }
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found");
	        }
	    }
		
}

