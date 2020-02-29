package com.adrianedecol.marvelAPI.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CHARACTERS")
@Getter
@Setter
@ConstructorBinding
@NoArgsConstructor
@Component
public class CharacterModelV1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

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

	@OneToMany(/*mappedBy = "character", */fetch = FetchType.LAZY)
	@JoinColumn(name = "character_id")
	private List<ComicModelV1> comics;
	
}
