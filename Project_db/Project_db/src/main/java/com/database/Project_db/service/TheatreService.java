package com.database.Project_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.Project_db.entity.TheatreEntity;
import com.database.Project_db.jpa.TheatreJpaRepositoryInterface;

@Service
public class TheatreService {

	@Autowired
	private TheatreJpaRepositoryInterface repository;
	
	public TheatreEntity get(long id) {
		return  repository.findById(id).get();
	}
	
	public TheatreEntity save(TheatreEntity course) {		
		return repository.save(course);
	}
	
	public void delete(long id) {
		 repository.deleteById(id);
	}

	public TheatreEntity update(TheatreEntity theatreEntity) {
		return repository.saveAndFlush(theatreEntity);
	}
	
	public List<TheatreEntity> findByTownName(String town) {
		return repository.findByTownName(town);
	}
	
	public List<TheatreEntity> findByCity(String city) {
		return repository.findByCity(city);
	}
	
	public List<TheatreEntity> findByCountry(String country) {
		return repository.findByCountry(country);
	}
	

}
