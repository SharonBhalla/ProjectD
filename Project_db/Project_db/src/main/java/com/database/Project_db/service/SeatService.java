package com.database.Project_db.service;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.support.ExampleMatcherAccessor;
import org.springframework.stereotype.Service;

import com.database.Project_db.entity.Course;
import com.database.Project_db.entity.SeatEntity;
import com.database.Project_db.jpa.CourseJpaRepository;
import com.database.Project_db.jpa.SeatJpaRepositoryInterface;
import com.database.Project_db.rest.constant.EnumDeclare;
import com.project.booking.dto.BookingDTO;

@Service
public class SeatService {

	@Autowired
	private SeatJpaRepositoryInterface repository;
	
	
	
	public void bookTicket(Set<Long> seatToBeBooked) {
		//Set<Long> seatIds = bookDTO.getSeatIds();
		if(seatToBeBooked.size()==1) {
			SeatEntity seatEntity  = repository.getReferenceById(seatToBeBooked.iterator().next());
			seatEntity.setSeatStatus(EnumDeclare.seatStatus.Booked.name());
			repository.save(seatEntity);
		}
		else {
			repository.updateUserSetStatusForName(EnumDeclare.seatStatus.Booked.name(), seatToBeBooked);
		}
		
		//repository.saveAllAndFlush(null)
		//select the seats : can be multiple
				//get the prices
				//calculate the billing
	}
	
	public static void main(String[] args) {
		Enum<EnumDeclare.seatStatus> abc = EnumDeclare.seatStatus.Available;
		System.out.println("SeatService.main()"+abc.name());
		System.out.println("SeatService.main()"+abc.ordinal());
		
	}

}
