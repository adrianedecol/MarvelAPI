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
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void retornarStatusOK() throws Exception {
		ResponseEntity<List<CharacterModelV1>> response = restTemplate.exchange(
				URI, HttpMethod.GET, null, new ParameterizedTypeReference<List<CharacterModelV1>>() {});
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void retornarStatusNOTFOUND() throws Exception {
		//@@TODO
	}
	
}
