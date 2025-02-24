package com.digging.spring.thymeleaf.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digging.spring.thymeleaf.domain.Weather;
import com.digging.spring.thymeleaf.repository.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;
	
	public List<Weather> getWeather() {
		List<Weather> weatherList = weatherRepository.selectWeather();
		
		return weatherList;
	}
	
	public int addWeather(
			LocalDate date
			, String weather
			, double temperatures
			, double precipitation
			, String microDust
			, double windSpeed) {
		
		int count = weatherRepository.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		return count;
	}
	
	public int addWeatherByObject(Weather weather) {
		int count = weatherRepository.insertWeatherByObject(weather);
		
		return count;
	}
}
