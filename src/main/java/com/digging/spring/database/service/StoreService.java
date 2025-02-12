package com.digging.spring.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digging.spring.database.domain.Store;
import com.digging.spring.database.repository.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository;
	
	// 가게 정보 리스트 얻어오기
	public List<Store> getStoreList() {
		// store 테이블 모든행 조회
		List<Store> storeList = storeRepository.selectStoreList();
		
		return storeList;
	}

}
