package com.bloodbank.sbbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.sbbm.entity.BloodRequest;

public interface BloodRequestRepository  extends JpaRepository<BloodRequest, Integer>{

}
