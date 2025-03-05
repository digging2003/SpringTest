package com.digging.spring.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digging.spring.jpa.domain.Company;
import com.digging.spring.jpa.service.CompanyService;

@RequestMapping("/jpa/company")
@Controller
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@ResponseBody
	@GetMapping("/create")
	public List<Company> addCompany() {
		
		List<Company> companyList = new ArrayList<>();
		
		companyList.add(companyService.addCompany("넥손", "컨텐츠 게임", "대기업", 3585));
		companyList.add(companyService.addCompany("버블팡", "여신 금융업", "대기업", 6934));
		
		return companyList;
		
	}
	
	@ResponseBody
	@GetMapping("/update")
	public Company updateCompany() {
		
		Company company = companyService.updateCompany(9, "중견기업", 34);
		
		return company;
		
	}
	
	@ResponseBody
	@GetMapping("/delete")
	public String deleteCompany() {
		companyService.deleteCompany(9);
		
		return "수행 완료";
	}
}
