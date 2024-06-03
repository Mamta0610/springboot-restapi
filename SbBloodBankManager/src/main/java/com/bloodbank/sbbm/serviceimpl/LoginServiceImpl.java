package com.bloodbank.sbbm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.sbbm.entity.Login;
import com.bloodbank.sbbm.repository.LoginRepository;
import com.bloodbank.sbbm.service.LoginService;

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
