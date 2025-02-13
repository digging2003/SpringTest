package com.digging.spring.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.digging.spring.mybatis.domain.RealEstate;

@Mapper
@Repository
public interface RealEstateRepository {
	
	public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateRent(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectRealEstateAreaPrice(@Param("area") int area, @Param("price") int price);
	
	public int insertRealEstate(RealEstate realEstate);

}
