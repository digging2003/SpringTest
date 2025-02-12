package com.digging.spring.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.digging.spring.database.domain.Store;

@Mapper
public interface StoreRepository {

	public List<Store> selectStoreList();
	
}
