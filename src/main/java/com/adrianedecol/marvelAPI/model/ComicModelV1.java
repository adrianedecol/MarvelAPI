package com.adrianedecol.marvelAPI.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ConstructorBinding
@NoArgsConstructor
@ToString
@Component
@Entity
@Table(name="COMIC")
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
	@Temporal(TemporalType.TIMESTAMP)
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
	
	/*@ManyToMany(mappedBy = "comics")
    private List<CharacterModelV1> characters;
    
    */

}
