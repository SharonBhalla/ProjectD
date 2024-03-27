package com.database.Project_db.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "show")
public class ShowEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long showId;
	@Column(name = "showName")
	private String showName;
	@Column(name = "totalSeats")
	private int totalSeats;
	
	@ManyToOne
    @JoinColumn(name="movie_Id", nullable=false)
    private MovieEntity show;
	
	@OneToOne(mappedBy = "time")
	private TimeEntity timing;	
	
	@OneToMany(mappedBy = "show" ,fetch = FetchType.LAZY)
	private List<SeatEntity> seats;

	public ShowEntity(long showId, String showName, int totalSeats, MovieEntity show, TimeEntity timing,
			List<SeatEntity> seats) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.totalSeats = totalSeats;
		this.show = show;
		this.timing = timing;
		this.seats = seats;
	}

	public ShowEntity() {
		super();
	}

	public List<SeatEntity> getSeats() {
		return seats;
	}



	public void setSeats(List<SeatEntity> seats) {
		this.seats = seats;
	}



	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	

	
}