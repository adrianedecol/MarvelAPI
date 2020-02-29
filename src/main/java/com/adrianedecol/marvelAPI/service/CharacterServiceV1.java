package com.adrianedecol.marvelAPI.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;
import com.adrianedecol.marvelAPI.model.ComicModelV1;
import com.adrianedecol.marvelAPI.repository.CharacterRepositoryV1;

@Service
public class CharacterServiceV1 {
	
	@Autowired
	private CharacterRepositoryV1 repository;
	@Autowired
	private Optional<CharacterModelV1> character;
	
	public List<CharacterModelV1> findAll() {
		return repository.findAll();				
	}
	
	public CharacterModelV1 findById(Integer id) throws EntityNotFoundException {
		character = repository.findById(id);
		if (character.isPresent()) {
			return character.get();
		}
		throw new EntityNotFoundException("Herói não encontrado");
	}

}
