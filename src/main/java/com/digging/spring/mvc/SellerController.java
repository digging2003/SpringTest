package com.digging.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digging.spring.mvc.domain.Seller;
import com.digging.spring.mvc.service.SellerService;


@Controller
@RequestMapping("/mvc/seller")
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	@ResponseBody
	@PostMapping("/create")
	public String createSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profileImage") String profileImage
			, @RequestParam("temperature") double temperature) {
		
		int count = sellerService.addSeller(nickname, profileImage, temperature);
		
		return "삽입 결과 : " + count;
		
	}
	
	// @ResponseBody가 없으면 경로로 적용 
	@GetMapping("/input")
	public String inputSeller() {
		return "mvc/sellerInput";
	}
	
//	@GetMapping("/info")
//	public String sellerInfo(Model model) {
//		Seller seller = sellerService.getLastSeller();
//		model.addAttribute("seller", seller);
//		return "mvc/sellerInfo";
//	}
	
	@GetMapping("/info")
	public String sellerSearch(Model model, @RequestParam(required = false, value = "id") Integer id) {
		
		Seller seller = null;
		
		if(id == null) {
			seller = sellerService.getLastSeller();
		} else {
			seller = sellerService.getSearchSeller(id);
		}
		model.addAttribute("seller", seller);
		
		return "mvc/sellerinfo";
	}
}
