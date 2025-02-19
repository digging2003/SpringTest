package com.digging.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digging.spring.mvc.domain.Realtor;
import com.digging.spring.mvc.repository.RealtorRepository;

@Service
public class RealtorService {

	@Autowired
	private RealtorRepository realtorRepository;
	
	public int addRealtorByObject(Realtor realtor) {
		
		int count = realtorRepository.insertRealtorByObject(realtor);
		return count;
	}
}
