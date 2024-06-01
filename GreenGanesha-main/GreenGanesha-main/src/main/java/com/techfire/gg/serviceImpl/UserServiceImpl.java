package com.techfire.gg.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfire.gg.entity.User;
import com.techfire.gg.exception.UserIdNotFoundException;
import com.techfire.gg.repository.UserRepository;
import com.techfire.gg.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	//register user and store data into table
	@Override
	public User registerUser(User user) {
		return userRepo.save(user);
	}
	
	// update user 
	@Override
	public User editUser(User user, int uId) {
		User userDetailsUpdated = userRepo.findById(uId).orElseThrow(()-> new UserIdNotFoundException("Please Enter Valid ID"));
		userDetailsUpdated.setUPhone(user.getUPhone());
		userDetailsUpdated.setAddr(user.getAddr());
		userRepo.save(userDetailsUpdated);
		return userDetailsUpdated;
		
	}
	
	//remove user
	@Override
	public void removeUser(int uId) {
		userRepo.findById(uId).orElseThrow(()-> new UserIdNotFoundException("Please Enter Valid ID"));
		userRepo.deleteById(uId);
		
	}

	// fetch data from databse on the basis of Id
	@Override
	public User displayUserDetails(int uId) {
		return userRepo.findById(uId).orElseThrow(()-> new UserIdNotFoundException("Please Enter Valid ID"));
		
	}

	@Override
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	
		
}

