package com.digging.spring.thymeleaf.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.digging.spring.thymeleaf.domain.Weather;

@Mapper
public interface WeatherRepository {

	public List<Weather> selectWeather();
}
