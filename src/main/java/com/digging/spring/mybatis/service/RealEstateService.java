package com.digging.spring.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digging.spring.mybatis.domain.RealEstate;
import com.digging.spring.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {

	@Autowired
	private RealEstateRepository realEstateRepository;
	
	public RealEstate getRealEstate(int id) {
		RealEstate realEstate = realEstateRepository.selectRealEstate(20); 
		
		return realEstate;
	}
	
	public List<RealEstate> getRealEstateRent(int rentPrice) {
		List<RealEstate> realEstateRentList = realEstateRepository.selectRealEstateRent(90); 
		
		return realEstateRentList;
	}
	
	public List<RealEstate> getRealEstateAreaPrice(int area, int price) {
		List<RealEstate> realEstateList = realEstateRepository.selectRealEstateAreaPrice(90, 130000);
		
		return realEstateList;
	}
}
