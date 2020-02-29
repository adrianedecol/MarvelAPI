package com.adrianedecol.marvelAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;
import com.adrianedecol.marvelAPI.model.ComicModelV1;
import com.adrianedecol.marvelAPI.repository.ComicRepositoryV1;

@Service
public class ComicServiceV1 {
	
	@Autowired
	private ComicRepositoryV1 repositoryV1;
	
	/*public List<ComicModelV1> findByCharacter (CharacterModelV1 character) {
		return repositoryV1.findByCharacter(character);
	}*/

}
