package com.adrianedecol.marvelAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrianedecol.marvelAPI.model.CharactersModelV1;
import com.adrianedecol.marvelAPI.repository.CharactersRepositoryV1;

@RestController
@RequestMapping("v1/public/characters")
public class CharactersControllerV1 {
	
	@Autowired
	private CharactersRepositoryV1 repository;
	
	/**
	 * Fetches lists of characters
	 * @return
	 */
	@RequestMapping("")
	public ResponseEntity<List<CharactersModelV1>> getCharacters() {
		List<CharactersModelV1> characters = repository.findAll();
		return new ResponseEntity<>(characters, HttpStatus.OK);
	}
	
	/**
	 * Fetches a single character by id.
	 * @param characterId
	 * @return
	 */
	@RequestMapping("/{characterId}")
	public String getCharacter(@PathVariable int characterId) {
		return "helloooo Marvel API {characterId}";
	}
	
	/**
	 * Fetches lists of comics filtered by a character id.
	 * @param characterId
	 * @return
	 */
	@RequestMapping("/{characterId}/comics")
	public String getCharacterComics(@PathVariable int characterId) {
		return "helloooo Marvel API {characterId}/comics";
	}
	
	/**
	 * Fetches lists of events filtered by a character id.
	 * @param characterId
	 * @return
	 */
	@RequestMapping("/{characterId}/events")
	public String getCharacterEvents(@PathVariable int characterId) {
		return "helloooo Marvel API {characterId}/events";
	}

	/**
	 * Fetches lists of series filtered by a character id
	 * @param characterId
	 * @return
	 */
	@RequestMapping("/{characterId}/series")
	public String getCharacterSeries(@PathVariable int characterId) {
		return "helloooo Marvel API {characterId}/series";
	}
	
	/**
	 * Fetches lists of stories filtered by a character id
	 * @param characterId
	 * @return
	 */
	@RequestMapping("/{characterId}/stories")
	public String getCharacterStories(@PathVariable int characterId) {
		return "helloooo Marvel API {characterId}/stories";
	}
}
