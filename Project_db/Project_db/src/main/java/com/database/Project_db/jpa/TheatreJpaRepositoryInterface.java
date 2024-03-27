package com.database.Project_db.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.database.Project_db.entity.TheatreEntity;


@Repository
public interface TheatreJpaRepositoryInterface extends JpaRepository<TheatreEntity, Long>{
	
	List<TheatreEntity> findByTownName(String townName);
	List<TheatreEntity> findByCity(String city);	
	List<TheatreEntity> findByCountry(String country);
	
}
