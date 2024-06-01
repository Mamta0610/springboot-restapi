package com.travelplanner.sbtp.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.travelplanner.sbtp.entity.Bookings;
import com.travelplanner.sbtp.exception.BookingIdNotFoundException;
import com.travelplanner.sbtp.repository.BookingsRespository;
import com.travelplanner.sbtp.service.BookingsService;

@Service
public class BookingsServiceImpl  implements BookingsService{
	
	@Autowired
	BookingsRespository brepo;
	
	@Override
	public Bookings registerBookings(Bookings bookings) {
		return brepo.save(bookings);
	}

	@Override
	public void removeBookings(int bid) {
		brepo.findById(bid).orElseThrow(() -> new BookingIdNotFoundException("Enter id is incorrect bookingid, please check"));
       brepo.deleteById(bid);
		
	}

	@Override
	public Bookings fetchBookingsDetail(int bid) {
		return brepo.findById(bid).orElseThrow(() -> new BookingIdNotFoundException("Enter id is incorrect bookingid, please check"));
		
	}

}
