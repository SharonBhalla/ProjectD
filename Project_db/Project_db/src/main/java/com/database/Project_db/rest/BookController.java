package com.database.Project_db.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.Project_db.service.BookService;
import com.project.booking.dto.BookingDTO;

@RestController
@RequestMapping("/theatre/book")
public class BookController {
	
	//get the theatre
	//get the movie
	//get the show
	//get the seats : show the seats
	//pick the seats
	//get the price 
	//calculate the billing
	
	
	
	@Autowired
	BookService bookService;
	
	@GetMapping
	public String getView() {
		return "Theatre getView";
	}
		
	@PostMapping
	public String createBookView(boolean bulkBook,@RequestBody BookingDTO bookDTO ) {
		//select the theatreId
		//select the movieId
		//select the showId
		//select the seats : can be multiple
		//get the prices
		//calculate the billing
		
		bookService.bookTicket(bookDTO);
		return "Theatre Bulk createBookView";
	}
	
	@DeleteMapping
	public String cancelBookView(boolean bulkBook) {
		return "Theatre cancelBookView";
	}
	
	@PatchMapping
	public String updateBookView(boolean bulkBook) {
		return "Theatre updateBookView";
	}
}
