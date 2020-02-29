package com.adrianedecol.marvelAPI.model;

import java.io.Serializable;
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

@Entity
@Table(name="STORY")
@Getter
@Setter
@ConstructorBinding
@NoArgsConstructor
@Component
public class StoryModelV1 implements Serializable {

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
	private String type;
	
	@Column
	private String rating;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modified;

}
