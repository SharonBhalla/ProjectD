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
@Table(name = "offer")
public class OfferEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long offerId;
	
	@PrimaryKeyJoinColumn
	@OneToOne
	@JoinColumn(name="movieId")
	private MovieEntity movieEntity;
	
	@Column(name = "offerName")
	private String offerName;
	
	@Column(name = "condition")
	private String condition;

	public long getOfferId() {
		return offerId;
	}

	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	public MovieEntity getMovieEntity() {
		return movieEntity;
	}

	public void setMovieEntity(MovieEntity movieEntity) {
		this.movieEntity = movieEntity;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public OfferEntity(long offerId, MovieEntity movieEntity, String offerName, String condition) {
		super();
		this.offerId = offerId;
		this.movieEntity = movieEntity;
		this.offerName = offerName;
		this.condition = condition;
	}

	public OfferEntity() {
		super();
	}
	
	
}
