package com.digging.spring.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.digging.spring.thymeleaf.domain.Weather;
import com.digging.spring.thymeleaf.service.WeatherService;

@RequestMapping("/thymeleaf/weather")
@Controller
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/info")
	public String weatherInfo(Model model) {
		
		List<Weather> weatherList = weatherService.getWeather();
		
		model.addAttribute("weatherList", weatherList);
		
		return "thymeleaf/weatherinfo";
	}
	
	
	@GetMapping("/input")
	public String weatherInput() {
		
		return "thymeleaf/weatherinput";
	}
	
	@GetMapping("/create")
	public String createWeather(
//			@DateTimeFormat(pattern="yyyy년 M월 d일") @RequestParam("date") LocalDate date // 2025년 2월 24일
//			, @RequestParam("weather") String weather
//			, @RequestParam("temperatures") double temperatures
//			, @RequestParam("precipitation") double precipitation
//			, @RequestParam("microDust") String microDust
//			, @RequestParam("windSpeed") double windSpeed
			@ModelAttribute Weather weather) {
		
		
		
//		int count = weatherService.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		int count = weatherService.addWeatherByObject(weather);
		
		return "redirect:/thymeleaf/weather/info";
		
	}
		
	
}
