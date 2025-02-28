package com.digging.spring.ajax;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digging.spring.ajax.domain.Booking;
import com.digging.spring.ajax.service.BookingService;

@RequestMapping("/ajax/booking")
@Controller
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/list")
	public String bookingList(Model model) {
		
		List<Booking> bookingList = bookingService.getBookingList();
		model.addAttribute("bookingList", bookingList);
		
		
		return "ajax/booking/list";
	}
	
	@GetMapping("/reservation")
	public String bookingReservation() {
		return "ajax/booking/reservation";
	}
	
	@GetMapping("/main")
	public String bookingMain() {
		return "ajax/booking/main";
	}
	
	@PostMapping("/delete")
	public String bookingDelete(@RequestParam("id") int id) {
		int count = bookingService.deleteBooking(id);
		
		return "redirect:/ajax/booking/list";
	}
	
	@ResponseBody
	@PostMapping("/create")
	public int bookingInsert(
			@RequestParam("name") String name
			, @DateTimeFormat(pattern="yyyy년 M월 d일") @RequestParam("date") LocalDate date
			, @RequestParam("day") int day
			, @RequestParam("headcount") int headcount
			, @RequestParam("phoneNumber") String phoneNumber) {
		int count = bookingService.insertBooking(name, date, day, headcount, phoneNumber, "대기중");
		
		return count;
	}
	
	@ResponseBody
	@PostMapping("/search")
	public Map<String, Object> bookingSearch(
			@RequestParam("name") String name
			, @RequestParam("phoneNumber") String phoneNumber) {
		
		Booking booking = bookingService.searchBooking(name, phoneNumber);
		
		Map<String, Object> resultMap = new HashMap<>();
		
		if(booking != null) {
			resultMap.put("name", booking.getName());
			resultMap.put("date", booking.getDate());
			resultMap.put("day", booking.getDay());
			resultMap.put("headcount", booking.getHeadcount());
			resultMap.put("state", booking.getState());
			
			return resultMap;
		} else {
			resultMap.put("name", null);
			
			return resultMap;
		}
		
		
	}
	
	
}
