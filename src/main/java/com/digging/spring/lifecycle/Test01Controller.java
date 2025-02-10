package com.digging.spring.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lifecycle/test01")
@RestController
public class Test01Controller {
	
	@RequestMapping("/1")
	public String test01() {
		return "<h1>테스트 프로젝트 완성</h1>"
				+ "<h3>해당 프로젝트를 통해서 문제 풀이를 진행합니다.";
	}
	
	@RequestMapping("/2")
	public Map<String, Integer> test02() {
		Map<String, Integer> subject = new HashMap<>();
		subject.put("국어", 80);
		subject.put("수학", 90);
		subject.put("영어", 85);
		
		return subject;
	}
	
	


}
