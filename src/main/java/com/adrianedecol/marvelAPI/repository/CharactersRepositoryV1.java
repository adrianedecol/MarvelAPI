package com.adrianedecol.marvelAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrianedecol.marvelAPI.model.CharactersModelV1;

@Repository
public interface CharactersRepositoryV1 extends JpaRepository<CharactersModelV1, Integer> {

}
