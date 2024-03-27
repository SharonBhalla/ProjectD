package com.database.Project_db.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.Project_db.entity.Course;
import com.database.Project_db.service.CourseServiceInterfaceService;


@RestController
@RequestMapping("/first")
public class FirstController {
	
	@Autowired
	private CourseServiceInterfaceService timeService ;
	
	@GetMapping("/{id1}")
	public ResponseEntity<Course> getView(@PathVariable long id1) {		
		HttpStatus status = HttpStatus.OK;
		Course timeDto = timeService.get(id1);
		
		if (timeDto!=null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(timeDto);
	}	
	
	@GetMapping("/author/{author1}")
	public ResponseEntity<List<Course>> getView(@PathVariable String  author1) {		
		HttpStatus status = HttpStatus.OK;
		List<Course> timeDto = timeService.findByAuth(author1);
		
		if (timeDto!=null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(timeDto);
	}	
		
	@PostMapping
	public ResponseEntity<Course> createView(@RequestBody Course theatreDTO ) {	
		HttpStatus status = HttpStatus.OK;
		theatreDTO = timeService.save(theatreDTO);
		
		return ResponseEntity.status(status).body(theatreDTO);
	}
	
	@DeleteMapping("/{id}")
	public String deleteView(@PathVariable long id) {
		timeService.delete(id);
		return "Theatre deleteView ";
		
	}
	
	@PatchMapping
	public ResponseEntity<Course> updateView(@RequestBody Course theatreDTO) {
		HttpStatus status = HttpStatus.OK;
		Course updatedCourse = timeService.update(theatreDTO);
		
		return ResponseEntity.status(status).body(updatedCourse);
	}
}