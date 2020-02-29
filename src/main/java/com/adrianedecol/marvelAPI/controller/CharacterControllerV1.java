package com.adrianedecol.marvelAPI.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;
import com.adrianedecol.marvelAPI.model.ComicModelV1;
import com.adrianedecol.marvelAPI.model.EventModelV1;
import com.adrianedecol.marvelAPI.model.SerieModelV1;
import com.adrianedecol.marvelAPI.model.StoryModelV1;
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
	@GetMapping
	public ResponseEntity<List<CharacterModelV1>> getCharacters() {
		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}
	
	/**
	 * Fetches a single character by id.
	 * @param characterId
	 * @return
	 */
	@GetMapping("/{characterId}")
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
	@GetMapping("/{characterId}/comics")
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
	@GetMapping("/{characterId}/events")
	public ResponseEntity<List<EventModelV1>> getCharacterEvents(@PathVariable int characterId) {
		try {
			character = service.findById(characterId);
		} catch (EntityNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(character.getEvents(), HttpStatus.OK);
	}

	/**
	 * Fetches lists of series filtered by a character id
	 * @param characterId
	 * @return
	 */
	@GetMapping("/{characterId}/series")
	public ResponseEntity<List<SerieModelV1>> getCharacterSeries(@PathVariable int characterId) {
		try {
			character = service.findById(characterId);
		} catch (EntityNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(character.getSeries(), HttpStatus.OK);
	}
	
	/**
	 * Fetches lists of stories filtered by a character id
	 * @param characterId
	 * @return
	 */
	@GetMapping("/{characterId}/stories")
	public ResponseEntity<List<StoryModelV1>> getCharacterStories(@PathVariable int characterId) {
		try {
			character = service.findById(characterId);
		} catch (EntityNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(character.getStories(), HttpStatus.OK);
	}
}
