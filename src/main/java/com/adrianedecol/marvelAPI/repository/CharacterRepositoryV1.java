package com.adrianedecol.marvelAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;

@Repository
public interface CharacterRepositoryV1 extends JpaRepository<CharacterModelV1, Integer> {

}
