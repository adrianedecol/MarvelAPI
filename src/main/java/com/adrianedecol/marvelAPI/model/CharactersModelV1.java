package com.adrianedecol.marvelAPI.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CHARACTERS")
@Getter
@Setter
@ConstructorBinding
@NoArgsConstructor
public class CharactersModelV1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	private int id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "modified")
	private Date modified;
	
	@Column(name = "resourceURI")
	private String resourceURI;
		
	@Lob
	@Column(name = "thumbnail")
	private byte[] thumbnail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public byte[] getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(byte[] thumbnail) {
		this.thumbnail = thumbnail;
	}

	public CharactersModelV1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/*
	 * @@TODO
	 * Mapeamento de relacionamentos
	 */
	
}
