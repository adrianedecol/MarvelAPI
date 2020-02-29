package com.adrianedecol.marvelAPI.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="COMIC")
@Getter
@Setter
@ConstructorBinding
@NoArgsConstructor
@Component
public class ComicModelV1 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private Integer digitalId;
	
	@Column
	private String title;
	
	@Column
	private BigDecimal issueNumber;
	
	@Column
	private String variantDescription;
	
	@Column
	private String description;
	
	@Column
	private Date modified;
	
	@Column
	private String isbn;
	
	@Column
	private String upc;
	
	@Column
	private String diamondCode;
	
	@Column
	private String ean;
	
	@Column
	private String issn;
	
	@Column
	private String format;
	
	@Column
	private Integer pageCount;
	
	@Column
	private String resourceURI;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "character_id")
    private CharacterModelV1 character;*/

}
