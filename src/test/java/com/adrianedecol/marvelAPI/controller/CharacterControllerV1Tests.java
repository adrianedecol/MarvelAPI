package com.adrianedecol.marvelAPI.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CharacterControllerV1Tests {
	
	private final String URI = "/v1/public/characters";
	private final String URI_NOT_FOUND = "/99";
	private final String URI_IRON_MAN = "/3";
	private final String NOME_IRON_MAN = "Iron-Man";
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void testRetornarStatusOKLista() throws Exception {
		ResponseEntity<List<CharacterModelV1>> response = restTemplate.exchange(
				URI, HttpMethod.GET, null, new ParameterizedTypeReference<List<CharacterModelV1>>() {});
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void testRetornarStatusNOTFOUNDLista() throws Exception {
		ResponseEntity<CharacterModelV1> response = restTemplate.exchange(
				URI.concat(URI_NOT_FOUND), HttpMethod.GET, null, new ParameterizedTypeReference<CharacterModelV1>() {});
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}
	
	@Test
	public void testRetornarCharacterIronMan() throws Exception {
		ResponseEntity<CharacterModelV1> response = restTemplate.exchange(
				URI.concat(URI_IRON_MAN), HttpMethod.GET, null, new ParameterizedTypeReference<CharacterModelV1>() {});
		assertThat(response.getBody().getName()).isEqualToIgnoringCase(NOME_IRON_MAN);
	}
	
}
