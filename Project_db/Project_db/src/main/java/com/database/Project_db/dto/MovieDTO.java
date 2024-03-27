package com.database.Project_db.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable{	
	private long movieId;	
	private String movieName;
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}	
	
	
}
