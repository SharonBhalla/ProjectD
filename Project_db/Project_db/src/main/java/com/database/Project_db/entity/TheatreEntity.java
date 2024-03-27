package com.database.Project_db.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "theatre")
public class TheatreEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int theartreId;
	@Column(name = "townName")
	private String townName;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;	
	
	@OneToMany(mappedBy = "theatre" ,fetch = FetchType.LAZY)
	private Set<MovieEntity> movies;
	
	
	public Set<MovieEntity> getMovies() {
		return movies;
	}
	public void setMovies(Set<MovieEntity> movies) {
		this.movies = movies;
	}
	public TheatreEntity(int theartreId, String townName, String city, String country,Set<MovieEntity> movieEntities) {
		super();
		this.theartreId = theartreId;
		this.townName = townName;
		this.city = city;
		this.country = country;
		this.movies = movieEntities;
	}
	public TheatreEntity() {
		super();
	}
	public int getTheartreId() {
		return theartreId;
	}
	public void setTheartreId(int theartreId) {
		this.theartreId = theartreId;
	}
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

		
	
}