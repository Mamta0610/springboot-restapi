package com.travelplanner.sbtp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.travelplanner.sbtp.entity.Bookings;
import com.travelplanner.sbtp.service.BookingsService;
import jakarta.validation.Valid;

@RestController
public class BookingsController {
	
	@Autowired
	BookingsService bs;
	
	@PostMapping("/saveBookings")
	public ResponseEntity<Bookings> saveBookings(@Valid @RequestBody Bookings bookings){
		return new ResponseEntity<Bookings>(bs.registerBookings(bookings),HttpStatus.CREATED);
	}
	
	@GetMapping("/getBookingsDetails/{bid}")
	public ResponseEntity<Bookings> fetchBookings(@PathVariable("bid") int bid){
		return new ResponseEntity<Bookings>(bs.fetchBookingsDetail(bid), HttpStatus.OK);	
	}
	
	@DeleteMapping("/deleteBookings/{bid}")
	public ResponseEntity<String> deleteBookings(@PathVariable("bid") int bid){
		bs.removeBookings(bid);
		return new ResponseEntity<String>("<h1>Deleted Bookings Record, Kindly contact customer care for refund policy based on bookings </h1>", HttpStatus.OK);
	}
}

