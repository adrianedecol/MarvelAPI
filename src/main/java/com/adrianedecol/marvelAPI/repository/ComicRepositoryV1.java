package com.adrianedecol.marvelAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;
import com.adrianedecol.marvelAPI.model.ComicModelV1;

@Repository
public interface ComicRepositoryV1 extends JpaRepository<ComicModelV1, Integer>{
	
	//public List<ComicModelV1> findByCharacter(CharacterModelV1 character);

}
