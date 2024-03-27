package com.database.Project_db.consumer;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.database.Project_db.service.SeatService;
import com.project.booking.dto.BookingDTO;

@Component
public class ShowConsumer {
	
	@Autowired
	SeatService seatService;

	@JmsListener(destination = "${springjms.showqueue}")
	void consumeData(BookingDTO bookingDTO) {
		System.out.println("MessageConsumer.getMovieId() "+bookingDTO.getMovieId()+ " getShowId "+bookingDTO.getShowId());
		//update Seat
		Set<Long> seatIds = bookingDTO.getSeatIds();
		seatService.bookTicket(seatIds);
		
	}

}
