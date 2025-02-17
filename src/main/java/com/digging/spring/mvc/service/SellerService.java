package com.digging.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public int addSeller(
			String name
			, String photo
			, String temperature) {
		int count = sellerRepository.insertSeller(name, photo, temperature);
		
		return count;
	}
}
