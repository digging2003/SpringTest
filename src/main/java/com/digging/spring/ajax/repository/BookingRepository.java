package com.digging.spring.ajax.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.digging.spring.ajax.domain.Booking;

@Mapper
public interface BookingRepository {

	public List<Booking> selectBookingList();
	
	public int deleteBooking(@Param("id") int id);
	
	public int insertBooking(
			@Param("name") String name
			, @Param("date") LocalDate date
			, @Param("day") int day
			, @Param("headcount") int headcount
			, @Param("phoneNumber") String phoneNumber);
	
	public Booking searchBooking(
			@Param("name") String name
			, @Param("phoneNumber") String phoneNumber);
	
}
