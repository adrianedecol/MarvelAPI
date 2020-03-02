package com.adrianedecol.marvelAPI.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Lazy;
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
@Table(name="CHARACTER")
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
	@Temporal(TemporalType.TIMESTAMP)
	private Date modified;
	
	@Column(name = "resourceURI")
	private String resourceURI;
		
	@Lob
	@Column(name = "thumbnail")
	private byte[] thumbnail;
	
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "character_comic", 
    	joinColumns = @JoinColumn(name = "character_id"), 
    	inverseJoinColumns = @JoinColumn(name = "comic_id"))
    @Lazy
    private List<ComicModelV1> comics;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "character_event", 
    	joinColumns = @JoinColumn(name = "character_id"), 
    	inverseJoinColumns = @JoinColumn(name = "event_id"))
    @Lazy
    private List<EventModelV1> events;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "character_serie", 
    	joinColumns = @JoinColumn(name = "character_id"), 
    	inverseJoinColumns = @JoinColumn(name = "serie_id"))
    @Lazy
    private List<SerieModelV1> series;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "character_story", 
    	joinColumns = @JoinColumn(name = "character_id"), 
    	inverseJoinColumns = @JoinColumn(name = "story_id"))
    @Lazy
    private List<StoryModelV1> stories;
	
}
