package com.digging.spring.mybatis.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	
	public int insertRealEstateByObject(RealEstate realEstate) {
		
	    int count = realEstateRepository.insertRealEstateByObject(realEstate);
	    
	    return count;
	}
	
	public int insertRealEstate(
			int realtorId
			, String address
			, int area
			, String type
			, int price
			, int rentPrice) {
		int count = realEstateRepository.insertRealEstate(realtorId, address, area, type, price, rentPrice);
		return count;
	}
	
	public int updateRealEstate(String type, int price, int id) {
		int count = realEstateRepository.updateRealEstate(type, price, id);
		return count;
	}
	
	public int deleteRealEstate(int id) {
		int count = realEstateRepository.deleteRealEstate(id);
		return count;
	}
}
