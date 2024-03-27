package com.database.Project_db.rest;

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

import com.database.Project_db.entity.MovieEntity;
import com.database.Project_db.entity.TheatreEntity;
import com.database.Project_db.service.MovieService;
import com.database.Project_db.service.TheatreService;



@RestController
@RequestMapping("/theatre")
public class TheatreController {
		
	@Autowired
	private TheatreService theatreService ;
	
	@Autowired
	private MovieService movieService ;
	
	@GetMapping("/{id}")
	public ResponseEntity<TheatreEntity> getView(@PathVariable long id) {		
		HttpStatus status = HttpStatus.OK;
		TheatreEntity theatreEntity = theatreService.get(id);
		
		if (theatreEntity!=null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(theatreEntity);
	}	
	
	
	
	@PostMapping
	public ResponseEntity<TheatreEntity> createView(@RequestBody TheatreEntity theatreDTO ) {	
		TheatreEntity createdEntity = theatreService.save(theatreDTO);
		HttpStatus status = HttpStatus.OK;
		
		
		if (createdEntity!=null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(createdEntity);		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteView(@PathVariable long id) {
	
		theatreService.delete(id);
		
		TheatreEntity createdEntity = theatreService.get(id);
		HttpStatus status = HttpStatus.NOT_FOUND;
		String statusStr = "Not found to delete";
		
		
		if (createdEntity==null) {
			status = HttpStatus.OK;
			statusStr = "Sucessfully deleted "+id;
		}

		return ResponseEntity.status(status).body(statusStr);				
	}
	
	@PatchMapping
	public ResponseEntity<TheatreEntity> updateView( @RequestBody TheatreEntity theatreDTO) {
		
		
		HttpStatus status = HttpStatus.OK;
		TheatreEntity theatreEntity = theatreService.update(theatreDTO);
		
		if (theatreEntity!=null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(theatreEntity);
	}
	
	@GetMapping("/movie/{id}")
	public ResponseEntity<MovieEntity> getMovieView(@PathVariable long id) {		
		HttpStatus status = HttpStatus.OK;
		MovieEntity theatreEntity = movieService.get(id);
		
		if (theatreEntity!=null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(theatreEntity);
	}
	
	@PostMapping("/movie")
	public ResponseEntity<MovieEntity> createMoviewView(@RequestBody MovieEntity theatreDTO ) {	
		MovieEntity createdEntity = movieService.save(theatreDTO);
		HttpStatus status = HttpStatus.OK;
		
		
		if (createdEntity!=null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(createdEntity);		
	}
	
	@DeleteMapping("/movie/{id}")
	public ResponseEntity<String> deleteMovieView(@PathVariable long id) {
	
		movieService.delete(id);
		
		MovieEntity createdEntity = movieService.get(id);
		HttpStatus status = HttpStatus.NOT_FOUND;
		String statusStr = "Not found to delete";
		
		
		if (createdEntity==null) {
			status = HttpStatus.OK;
			statusStr = "Sucessfully deleted "+id;
		}

		return ResponseEntity.status(status).body(statusStr);				
	}
	
	@PatchMapping("/movie")
	public ResponseEntity<MovieEntity> updateMovieView( @RequestBody MovieEntity theatreDTO) {
		
		
		HttpStatus status = HttpStatus.OK;
		MovieEntity theatreEntity = movieService.update(theatreDTO);
		
		if (theatreEntity!=null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(theatreEntity);
	}
	

}
