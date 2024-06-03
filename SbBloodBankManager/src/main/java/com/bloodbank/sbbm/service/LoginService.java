package com.bloodbank.sbbm.service;

import com.bloodbank.sbbm.entity.Login;

public interface LoginService {

	public Login loginCustomer(String userName, String password);
}
