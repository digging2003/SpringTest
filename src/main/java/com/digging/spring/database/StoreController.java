package com.digging.spring.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digging.spring.database.domain.Store;
import com.digging.spring.database.service.StoreService;

@RequestMapping("/db/store")
@Controller
public class StoreController {

	@Autowired
	private StoreService storeService;
	
	@RequestMapping("/list")
	public String storeList(Model model) {
		
		// 가게 정보 리스트 얻어오기
		List<Store> storeList =  storeService.getStoreList();
		
		model.addAttribute("storeList", storeList);
		
		return "thymeleaf/store/list";
	}
}
