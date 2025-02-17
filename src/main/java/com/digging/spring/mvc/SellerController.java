package com.digging.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/mvc/seller")
@Controller
public class SellerController {

	private SellerService sellerservice;
	
	@ResponseBody
	@PostMapping("/create")
	public String createSeller(
			@RequestParam("name") String name
			, @RequestParam("photo") String photo
			, @RequestParam("temperature") String temperature) {
		
		int count = sellerService.addUser(name, photo, temperature);
		
		return "삽입 결과 : " + count;
		
	}
}
