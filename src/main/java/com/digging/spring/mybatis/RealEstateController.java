package com.digging.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digging.spring.database.domain.Store;
import com.digging.spring.mybatis.domain.RealEstate;
import com.digging.spring.mybatis.service.RealEstateService;

@Controller
@RequestMapping("/mybatis/real-estate/select")
public class RealEstateController {

	@Autowired
	private RealEstateService realEstateService;
	
	@ResponseBody
	@RequestMapping("/1")
	public RealEstate RealEstateSelect(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateService.getRealEstate(id);
		return realEstate;
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public List<RealEstate> RealEstateRent(@RequestParam("rent") int rentPrice) {
		
		List<RealEstate> realEstateList = realEstateService.getRealEstateRent(rentPrice);
		
		return realEstateList;
	}
	
	@ResponseBody
	@RequestMapping("/3")
	public List<RealEstate> RealEstateAreaPrice(@RequestParam("area") int area, @RequestParam("price") int price) {
		
		List<RealEstate> realEstateList = realEstateService.getRealEstateAreaPrice(area, price);
		
		return realEstateList;
	}
}


