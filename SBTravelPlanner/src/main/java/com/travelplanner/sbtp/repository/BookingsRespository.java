package com.travelplanner.sbtp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelplanner.sbtp.entity.Bookings;

public interface BookingsRespository  extends JpaRepository<Bookings, Integer>{

}
