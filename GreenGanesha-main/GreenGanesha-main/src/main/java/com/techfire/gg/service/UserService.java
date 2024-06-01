package com.techfire.gg.service;





import com.techfire.gg.entity.User;

public interface UserService {
	
	// register new user to database table
	User registerUser(User user);
	
	//updating the details of user based on its id
	User editUser(User user,int uId);
	
	//deleting the customer record from table based on its id
		void removeUser(int uId);
		
	// fetching data of customer based on id in tale
		User displayUserDetails(int uId);
	
		//for login	
	 public User findByEmail(String email);
		
}
