package com.database.Project_db.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.database.Project_db.entity.Course;


@Repository
public interface CourseJpaRepositoryInterface extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
	
}
