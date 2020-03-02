package com.adrianedecol.marvelAPI.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;

@SpringBootTest
class CharacterServiceV1Tests {
	
	private final Integer ID_THOR = 4;
	private final String NOME_THOR = "Thor";
	private final Integer ID_NAO_ENCONTRADO = 99;
	private final Integer QTDADE_CHARACTERS = 5;	
	@Autowired
	private CharacterServiceV1 service;
	@Autowired
	private CharacterModelV1 character;
	@Autowired
	private List<CharacterModelV1> listCharacters;
	
	@Test
	void testRetornarCharacterThor() {
		character = service.findById(ID_THOR);		
		assertThat(character.getName()).isEqualToIgnoringCase(NOME_THOR);
	}
	
	@Test
	void testRetornarCharacterNaoEncontrado() {		
		assertThrows(EntityNotFoundException.class, () -> {
				service.findById(ID_NAO_ENCONTRADO);
			});	
	}
	
	@Test
	void testRetornarTodosCharacters() {
		listCharacters = service.findAll();		
		assertThat(listCharacters.size()).isEqualTo(QTDADE_CHARACTERS);
	}
	
}
