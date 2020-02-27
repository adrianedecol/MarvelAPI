package com.adrianedecol.marvelAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/public/characters")
public class CharactersController {
	
	@RequestMapping("/")
	public String getCharacters() {
		return "helloooo Marvel API";
	}

}
