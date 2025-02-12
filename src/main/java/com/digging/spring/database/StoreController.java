package com.digging.spring.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digging.spring.database.domain.Store;
import com.digging.spring.database.service.StoreService;

@Controller
public class StoreController {

	@Autowired
	private StoreService storeService;
	
	@ResponseBody
	@RequestMapping("/db/store/list")
	public List<Store> storeList() {
		
		// 가게 정보 리스트 얻어오기
		List<Store> storeList =  storeService.getStoreList();
		return storeList;
	}
}
