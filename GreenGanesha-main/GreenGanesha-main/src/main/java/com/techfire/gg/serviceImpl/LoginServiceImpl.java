package com.techfire.gg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfire.gg.entity.Login;
import com.techfire.gg.exception.UserIdNotFoundException;
import com.techfire.gg.repository.LoginRepository;
import com.techfire.gg.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository lrepo;	
	
	@Override
	public Login loginCustomer(String username, String password) {
		
		
			Login login = lrepo.findByUserNameAndPassword(username, password);
			return login;
		}
	
	public Login getLoginUser(int id) {
		return lrepo.findById(id).orElseThrow(() -> new UserIdNotFoundException("User not found with id: " +id));
	}
	}


