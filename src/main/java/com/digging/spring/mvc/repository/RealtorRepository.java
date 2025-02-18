package com.digging.spring.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RealtorRepository {

	public int insertRealtor(
			@Param("office") String office
			, @Param("phoneNumber") String phonNumber
			, @Param("address") String address
			, @Param("grade") String grade);
}
