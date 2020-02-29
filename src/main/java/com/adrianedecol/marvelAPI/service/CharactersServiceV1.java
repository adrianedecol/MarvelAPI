package com.adrianedecol.marvelAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianedecol.marvelAPI.model.CharactersModelV1;
import com.adrianedecol.marvelAPI.repository.CharactersRepositoryV1;

@Service
public class CharactersServiceV1 {
	
	@Autowired
	private CharactersRepositoryV1 repository;
	
	public List<CharactersModelV1> findAll() {
		return repository.findAll();				
	}

}
