package com.database.Project_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.Project_db.entity.MovieEntity;
import com.database.Project_db.entity.TheatreEntity;
import com.database.Project_db.jpa.MovieJpaRepositoryInterface;

@Service
public class MovieService {

	@Autowired
	private MovieJpaRepositoryInterface repository;
	
	public MovieEntity get(long id) {
		return repository.findById(id).get();
	}
	
	public MovieEntity save(MovieEntity course) {		
		return repository.save(course);
	}
	
	public void delete(long id) {
		 repository.deleteById(id);
	}

	public MovieEntity update(MovieEntity theatreEntity) {
		return repository.saveAndFlush(theatreEntity);
	}
	
	public List<TheatreEntity> findByMovieName(String town) {
		return repository.findByMovieName(town);
	}
	

}
