package com.digging.spring.mvc.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.Mapping;

@Mapping
public interface SellerRepository {
	
	public int insertSeller(
			@Param("name") String name
			, @Param("photo") String photo
			, @Param("temperature") String temperature);
