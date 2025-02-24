package com.digging.spring.thymeleaf.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.digging.spring.thymeleaf.domain.Weather;

@Mapper
public interface WeatherRepository {

	public List<Weather> selectWeather();
	
	public int insertWeather(
			@Param("date") LocalDate date
			, @Param("weather") String weather
			, @Param("temperatures") double temperatures
			, @Param("precipitation") double precipitation
			, @Param("microDust") String microDust
			, @Param("windSpeed") double windSpeed);
	
	public int insertWeatherByObject(Weather weather);
}
