package com.digging.spring.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digging.spring.ajax.domain.Favorite;
import com.digging.spring.ajax.repository.FavoriteRepository;

@Service
public class FavoriteService {

	@Autowired
	private FavoriteRepository favoriteRepository;
	
	public int addFavorite(String name, String url) {
		int count = favoriteRepository.insertFavorite(name, url);
		
		return count;
	}
	
	public List<Favorite> getFavorite() {
		List<Favorite> favoriteList =  favoriteRepository.selectFavorite();

		return favoriteList;
		
	}
}
