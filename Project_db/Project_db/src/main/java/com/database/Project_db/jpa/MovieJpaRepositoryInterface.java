package com.database.Project_db.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.database.Project_db.entity.MovieEntity;
import com.database.Project_db.entity.TheatreEntity;

@Repository
public interface MovieJpaRepositoryInterface extends JpaRepository<MovieEntity, Long>{
	
	List<TheatreEntity> findByMovieName(String movieName);

}

