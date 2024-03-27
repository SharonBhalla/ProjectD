package com.database.Project_db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name = "price")
public class PriceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long priceId;	
	

	@Column(name = "price")
	private float price;	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	@JoinColumn(name="seatId")
	private SeatEntity seatEntity;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	@JoinColumn(name="movieId")
	private MovieEntity movieEntity;	
	
	
	public PriceEntity(long priceId, MovieEntity movieEntity, float price, SeatEntity seatEntity) {
		super();
		this.priceId = priceId;
		this.movieEntity = movieEntity;
		this.price = price;
		this.seatEntity = seatEntity;
	}
	
	
	
	public PriceEntity() {
		super();
	}



	public long getPriceId() {
		return priceId;
	}
	public void setPriceId(long priceId) {
		this.priceId = priceId;
	}
	public MovieEntity getMovieEntity() {
		return movieEntity;
	}
	public void setMovieEntity(MovieEntity movieEntity) {
		this.movieEntity = movieEntity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public SeatEntity getSeatName() {
		return seatEntity;
	}
	public void setSeatName( SeatEntity seatEntity) {
		this.seatEntity = seatEntity;
	}
	
	
	
		
}