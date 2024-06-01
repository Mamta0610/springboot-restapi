package com.travelplanner.sbtp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelplanner.sbtp.entity.Login;
import com.travelplanner.sbtp.repository.LoginRepository;
import com.travelplanner.sbtp.service.LoginService;

@Service
public class LoginServiceImpl  implements LoginService{

	@Autowired
	LoginRepository lrepo;
	
	@Override
	public Login loginCustomer(String userName, String password) {
		Login login = lrepo.findByUserNameAndPassword(userName, password);
		return login;
	}

}
