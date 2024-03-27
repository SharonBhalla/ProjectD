package com.database.Project_db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "seat")
public class SeatEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seatId;
	
	@Column(name = "seatStatus")
	private String seatStatus;
	@Column(name = "seatName")
	private String seatName;	
	@Column(name = "showSeat")
	private String showSeat;
	
	@ManyToOne
    @JoinColumn(name="show_Id", nullable=false)
	private ShowEntity show;
	
	public SeatEntity() {
		super();
	}

	

	public SeatEntity(long seatId,  String seatStatus, String seatName, String showSeat, ShowEntity show) {
		super();
		this.seatId = seatId;
		
		this.seatStatus = seatStatus;
		this.seatName = seatName;
		this.showSeat = showSeat;
		this.show = show;
	}



	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	

	public String getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

	public String getShowSeat() {
		return showSeat;
	}

	public void setShowSeat(String showSeat) {
		this.showSeat = showSeat;
	}
	
		
}