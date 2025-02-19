package com.digging.spring.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class weatherController {

	@GetMapping("/thymeleaf/weather/info")
	public String weatherInfo() {
		return "thymeleaf/weatherinfo";
	}
}
