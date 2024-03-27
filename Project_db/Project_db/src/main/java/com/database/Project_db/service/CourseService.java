package com.database.Project_db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.Project_db.entity.Course;
import com.database.Project_db.jpa.CourseJpaRepository;

@Service
public class CourseService {

	@Autowired
	private CourseJpaRepository repository;
	
	public Course get(long id) {
		return repository.findById(id);
	}

}
