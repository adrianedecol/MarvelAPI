package com.adrianedecol.marvelAPI.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;
import com.adrianedecol.marvelAPI.model.ComicModelV1;
import com.adrianedecol.marvelAPI.service.CharacterServiceV1;

@RestController
@RequestMapping("v1/public/characters")
public class CharacterControllerV1 {
	
	@Autowired
	private CharacterServiceV1 service;
	@Autowired
	private CharacterModelV1 character;
	
	/**
	 * Fetches lists of characters
	 * @return
	 */
	@RequestMapping("")
	public ResponseEntity<List<CharacterModelV1>> getCharacters() {
		List<CharacterModelV1> characters = service.findAll();
		return new ResponseEntity<>(characters, HttpStatus.OK);
	}
	
	/**
	 * Fetches a single character by id.
	 * @param characterId
	 * @return
	 */
	@RequestMapping("/{characterId}")
	public ResponseEntity<CharacterModelV1> getCharacter(@PathVariable Integer characterId) {
		try {
			character = service.findById(characterId);
		} catch (EntityNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(character, HttpStatus.OK);
	}
	
	/**
	 * Fetches lists of comics filtered by a character id.
	 * @param characterId
	 * @return
	 */
	@RequestMapping("/{characterId}/comics")
	public ResponseEntity<List<ComicModelV1>> getCharacterComics(@PathVariable int characterId) {
		try {
			character = service.findById(characterId);
		} catch (EntityNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(character.getComics(), HttpStatus.OK);
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
