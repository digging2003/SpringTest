package com.digging.spring.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.digging.spring.ajax.domain.Favorite;
import com.digging.spring.ajax.service.FavoriteService;

@RequestMapping("/ajax/favorite")
@Controller
public class FavoriteController {

	@Autowired
	public FavoriteService favoriteService;
	
	@GetMapping("/input")
	public String favoriteInput() {

		
		return "ajax/favoriteinput";
	}
	
	@GetMapping("/list")
	public String favoriteList(Model model) {
		
		List<Favorite> favoriteList = favoriteService.getFavorite();
		model.addAttribute("favoriteList", favoriteList);
		
		return "ajax/favoritelist";
	}
	
	@PostMapping("/create")
	public String favoriteCreate(
			@RequestParam("name") String name
			, @RequestParam("url") String url) {
		
		int count = favoriteService.addFavorite(name, url);

		
		return "redirect:/ajax/favorite/list";
		
	}
	

}
