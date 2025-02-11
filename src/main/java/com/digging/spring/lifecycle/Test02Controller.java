package com.digging.spring.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("rate", 0);
		map2.put("director", "로베르트 베니니");
		map2.put("time", 166);
		map2.put("title", "인생은 아름다워");
		movie.add(map2);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("rate", 12);
		map3.put("director", "크리스토퍼 놀란");
		map3.put("time", 147);
		map3.put("title", "인셉션");
		movie.add(map3);
		
		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("rate", 19);
		map4.put("director", "윤종빈");
		map4.put("time", 133);
		map4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movie.add(map4);
		
		Map<String, Object> map5 = new HashMap<String, Object>();
		map5.put("rate", 15);
		map5.put("director", "프란시스 로린스");
		map5.put("time", 137);
		map5.put("title", "헝거게임");
		movie.add(map5);
		
		return movie;
		
	}
	
	@RequestMapping("/2")
	public List<Post> listObjectResponse() {
		
		List<Post> postList = new ArrayList<>();
		
		Post post = new Post("안녕하세요 가입인사 드립니다.", "hagulu", "안녕하세요 가입했어요. 잘 부탁 드립니다.");
		
		postList.add(post);
		
		postList.add(new Post("헐 대박", "bada", "오늘 화요일이었어, 목요일인줄!"));
		postList.add(new Post("오늘 데이터는 이야기 해드릴게요", "dulumary", "...."));
		
		return postList;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Post> entityResponse() {

		Post post = new Post("안녕하세요 가입인사 드립니다.", "hagulu", "안녕하세요 가입했어요. 잘 부탁 드립니다.");
		
		ResponseEntity<Post> entity = new ResponseEntity<>(post, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
	}
	

}
