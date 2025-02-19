package com.digging.spring.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.digging.spring.mvc.domain.Realtor;

@Mapper
public interface RealtorRepository {

	public int insertRealtorByObject(Realtor realtor);
}
