package com.digging.spring.ajax.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digging.spring.ajax.domain.Booking;
import com.digging.spring.ajax.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	public List<Booking> getBookingList() {
		 List<Booking> bookingList = bookingRepository.selectBookingList();
		 
		 return bookingList;
	}
	
	public int deleteBooking(int id) {
		int count = bookingRepository.deleteBooking(id);
		
		return count;
	}
	
	public int insertBooking(String name, LocalDate date, int day, int headcount, String phoneNumber, String state) {
		int count = bookingRepository.insertBooking(name, date, day, headcount, phoneNumber, state);
		
		return count;
	}
	
	public Booking searchBooking(String name, String phoneNumber) {
		Booking booking = bookingRepository.searchBooking(name, phoneNumber);
		
		return booking;
	}
}
