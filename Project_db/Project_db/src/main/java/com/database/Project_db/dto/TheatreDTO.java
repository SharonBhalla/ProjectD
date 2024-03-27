package com.database.Project_db.dto;

import java.io.Serializable;

public class TheatreDTO implements Serializable{
	
	private int theartreId;
	private String townName;
	private String city;
	private String country;	
	private MovieDTO[] movies;
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
	public MovieDTO[] getMovies() {
		return movies;
	}
	public void setMovies(MovieDTO[] movies) {
		this.movies = movies;
	}
	
	
	

}
