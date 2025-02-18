package com.digging.spring.mvc.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digging.spring.mvc.repository.RealtorRepository;

@Service
public class RealtorService {

	@Autowired
	private RealtorRepository realtorRepository;
	
	public int addRealtor(String office
			, String phonNumber
			, String address
			, String grade) {
		int count = realtorRepository.insertRealtor(office, phonNumber, address, grade);
		
		return count;
	}
}
