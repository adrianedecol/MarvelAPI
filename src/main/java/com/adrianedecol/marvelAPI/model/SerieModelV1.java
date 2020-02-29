package com.adrianedecol.marvelAPI.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SERIE")
@Getter
@Setter
@ConstructorBinding
@NoArgsConstructor
@Component
public class SerieModelV1 implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String resourceURI;
	
	@Column
	private Integer startYear;
	
	@Column
	private Integer endYear;
	
	@Column
	private String rating;
	
	@Column
	private Date modified;
}
