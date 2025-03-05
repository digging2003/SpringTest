package com.digging.spring.jpa;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digging.spring.jpa.domain.Recruit;
import com.digging.spring.jpa.repository.RecruitRepository;
import com.fasterxml.jackson.annotation.JsonFormat;

@RequestMapping("/jpa/recruit")
@Controller
public class RecruitController {

	@Autowired
	RecruitRepository recruitRepository;
	
	@ResponseBody
	@GetMapping("/info1")
	public Recruit companyInfo1() {
		Optional<Recruit> optionalRecruit = recruitRepository.findById(8);
		
		Recruit recruit = optionalRecruit.orElse(null);
		
		return recruit;
	}
	
	@ResponseBody
	@GetMapping("/info2")
	public Recruit companyInfo2(@RequestParam("id") int id) {
		Optional<Recruit> optionalRecruit = recruitRepository.findById(id);
		
		Recruit recruit = optionalRecruit.orElse(null);
		
		return recruit;
	}
	
	@ResponseBody
	@GetMapping("/info3")
	public List<Recruit> companyInfo3() {
		
		List<Recruit> recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
		
		return recruitList;
	}
	
	@ResponseBody
	@GetMapping("/info4")
	public List<Recruit> companyInfo4() {
		
		List<Recruit> recruitList = recruitRepository.findByTypeOrSalaryGreaterThanEqual("정규직", 9000);
		
		return recruitList;
	}
	
	@ResponseBody
	@GetMapping("/info5")
	public List<Recruit> companyInfo5() {
		
		List<Recruit> recruitList = recruitRepository.findTop3ByTypeOrderBySalaryDesc("정규직");
		
		return recruitList;
	}
	
	@ResponseBody
	@GetMapping("/info6")
	public List<Recruit> companyInfo6() {
		
		List<Recruit> recruitList = recruitRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
		
		return recruitList;
	}
	
	@ResponseBody
	@GetMapping("/info7")
	public List<Recruit> companyInfo7() {
		
		LocalDateTime deadline = LocalDateTime.of(2026, 4, 10, 0, 0);
		
		List<Recruit> recruitList = recruitRepository.findByTypeAndSalaryGreaterThanEqualAndDeadlineGreaterThanOrderBySalaryDesc("정규직", 8100, deadline);
		
		return recruitList;
	}
}
