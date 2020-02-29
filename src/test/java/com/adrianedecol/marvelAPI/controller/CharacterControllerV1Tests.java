package com.adrianedecol.marvelAPI.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.adrianedecol.marvelAPI.model.CharacterModelV1;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CharacterControllerV1Tests {
	
	private final String URI = "/v1/public/characters";
	
	@MockBean
	private CharacterControllerV1 api;
	@Autowired
	private TestRestTemplate restTemplate;

	private MockMvc mock;
	
	@BeforeEach
	public void setUp() {
		mock = MockMvcBuilders.standaloneSetup(api).build();
	}	

	@Test
	public void retornarStatusOK() throws Exception {
		/*mock.perform(get(URI))
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk()));*/
		mock.perform(get(URI)).andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
		
		//assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void retornarStatusNOTFOUND() throws Exception {
		mock.perform(get(URI.concat("/999"))).andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(status().isNotFound());
		/*ResponseEntity<CharacterModelV1> response = restTemplate.getForEntity(URI.concat("/170"), CharacterModelV1.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);*/
	}
	
}
