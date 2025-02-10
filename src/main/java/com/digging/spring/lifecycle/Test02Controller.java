package com.digging.spring.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lifecycle/test02")
@RestController
public class Test02Controller {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> test02() {
		List<Map<String, Object>> movie = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("rate", 15);
		map1.put("director", "봉준호");
		map1.put("time", 131);
		map1.put("title", "기생충");
		movie.add(map1);
		
		return movie;
		
	}

}
