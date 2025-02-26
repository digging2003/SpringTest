package com.digging.spring.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ajax/booking")
@Controller
public class BookingController {

	@GetMapping("/list")
	public String bookingList() {
		return "ajax/bookinglist";
	}
}
