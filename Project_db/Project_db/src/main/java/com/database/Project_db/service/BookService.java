package com.database.Project_db.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.Project_db.entity.Course;
import com.database.Project_db.jpa.CourseJpaRepository;
import com.project.booking.dto.BookingDTO;

@Service
public class BookService {

	@Autowired
	private SeatService seatService;
	

	
	public void bookTicket(BookingDTO bookDTO) {
		Set<Long> seatIds = bookDTO.getSeatIds();
		seatService.bookTicket(seatIds);
		
		//select the seats : can be multiple
				//get the prices
				//calculate the billing
	}

}
