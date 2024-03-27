package com.database.Project_db.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long movieId;
	
	@Column(name = "movieName")
	private String movieName;
	
	@ManyToOne
    @JoinColumn(name="theartre_Id", nullable=false)
    private TheatreEntity theatre;
	
	@OneToMany(mappedBy = "show" ,fetch = FetchType.LAZY)
	private Set<ShowEntity> shows;

	public MovieEntity() {
		super();
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	

	public Set<ShowEntity> getShow() {
		return shows;
	}

	public void setShow(Set<ShowEntity> shows) {
		this.shows = shows;
	}

	public MovieEntity(long movieId, String movieName, TheatreEntity theatre, Set<ShowEntity> show) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.theatre = theatre;
		this.shows = show;
	}

	

	
	
	/*@PrimaryKeyJoinColumn
	@OneToOne
	@JoinColumn(name="theartreId")
	private TheatreEntity theatreEntity;*/
	
	/*@PrimaryKeyJoinColumn
	@OneToOne
	@JoinColumn(name="offerId")
	private OfferEntity offerDTO;
	
	@PrimaryKeyJoinColumn
	@OneToOne
	@JoinColumn(name="priceId")
	private PriceEntity price;
	*/
	
/*	@OneToMany
	private List<TimeEntity> timings;
	
	@OneToMany
	private List<ShowEntity> show;*/


}