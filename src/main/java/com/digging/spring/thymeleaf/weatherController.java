package com.digging.spring.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String weatherInput(Model model) {
		Weather weather = new Weather();
		model.addAttribute("weather", weather);
		
		return "thymeleaf/weatherinput";
	}
}
