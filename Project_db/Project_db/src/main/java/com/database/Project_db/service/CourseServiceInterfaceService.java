package com.database.Project_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.Project_db.entity.Course;
import com.database.Project_db.jpa.CourseJpaRepositoryInterface;

@Service
public class CourseServiceInterfaceService {

	@Autowired
	private CourseJpaRepositoryInterface repository;
	
	public Course get(long id) {
		return repository.findById(id).get();
	}
	
	public Course save(Course course) {		
		return repository.save(course);
	}
	
	public List<Course> findByAuth(String author) {
		return repository.findByAuthor(author);
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		 repository.deleteById(id);
	}

	public Course update(Course course) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(course);
	}
	
	

}
