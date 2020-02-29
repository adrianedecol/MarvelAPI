package com.adrianedecol.marvelAPI.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="EVENT")
@Getter
@Setter
@ConstructorBinding
@NoArgsConstructor
@Component
public class EventModelV1 implements Serializable {
	
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
	private Date modified;
	
	@Column
	private Date start;
	
	@Column
	private Date end;

}
