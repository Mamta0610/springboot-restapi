package com.bloodbank.sbbm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.sbbm.entity.BloodUser;
import com.bloodbank.sbbm.exception.BloodUserIDNotFoundException;
import com.bloodbank.sbbm.repository.BloodUserRepository;
import com.bloodbank.sbbm.service.BloodUserService;

//business logic for entity Patient
@Service
public class BloodUserServiceImpl implements BloodUserService{

	@Autowired
	BloodUserRepository uRepo;
	
	//registering bloodUser into db table using save of jpaRepository
	@Override
	public BloodUser registerBloodUser(BloodUser bloodUser) {
		return uRepo.save(bloodUser);
	}

	//editing bloodUser details using findById() & save() of JpaRepository
	@Override
	public BloodUser editBloodUser(BloodUser bloodUser, int userId) {
		
		//fetch bloodUser data based on id, if not found throw exception
		BloodUser updatedBloodUserDetails = uRepo.findById(userId).orElseThrow(() -> new BloodUserIDNotFoundException("BloodUser ID is incorrect/invalid"));
		
		//set new values to bloodUser entity
		updatedBloodUserDetails.setUserContact(bloodUser.getUserContact());
		updatedBloodUserDetails.setAddr(bloodUser.getAddr());
		
		uRepo.save(updatedBloodUserDetails);
		return updatedBloodUserDetails;
	}

	//removing bloodUser record from db table using deleteById() of JpaRepository
	@Override
	public void deleteBloodUser(int userId) {
		//fetch bloodUser data based on id, if not found throw exception
		uRepo.findById(userId).orElseThrow(() -> new BloodUserIDNotFoundException("BloodUser ID is incorrect/invalid"));
		//if id found then delete data of bloodUser
		uRepo.deleteById(userId);
	}

	//fetch an bloodUser record from db table using findById() of JpaRepository
	@Override
	public BloodUser fetchBloodUser(int userId) {
		//fetch bloodUser data based on id, if not found throw exception
		return uRepo.findById(userId).orElseThrow(() -> new BloodUserIDNotFoundException("BloodUser ID is incorrect/invalid"));
	}
}
