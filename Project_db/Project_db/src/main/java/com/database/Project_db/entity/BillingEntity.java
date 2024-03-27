package com.database.Project_db.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "billing")
public class BillingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long billingId;
	@Column(name = "billingTransactionId")
	private long billingTransactionId;
	@Column(name = "totalMoney")
	private float totalMoney;
	@Column(name = "consession")
	private float consession;
	@Column(name = "moneyPayable")
	private float moneyPayable;
	@Column(name = "numberOfSeat")
	private int numberOfSeat;
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	@JoinColumn(name="priceId")
	private PriceEntity priceDTO;
	@OneToMany
	private List<OfferEntity> offeravailable;
	@OneToMany
	private List<OfferEntity> offerApplied;
	
	
	@OneToMany
	private List<SeatEntity> seatName;

	public BillingEntity(long billingId, long billingTransactionId, PriceEntity priceDTO, float totalMoney,
			float consession, float moneyPayable, List<OfferEntity> offeravailable, List<OfferEntity> offerApplied,
			int numberOfSeat, List<SeatEntity> seatName) {
		super();
		this.billingId = billingId;
		this.billingTransactionId = billingTransactionId;
		this.priceDTO = priceDTO;
		this.totalMoney = totalMoney;
		this.consession = consession;
		this.moneyPayable = moneyPayable;
		this.offeravailable = offeravailable;
		this.offerApplied = offerApplied;
		this.numberOfSeat = numberOfSeat;
		this.seatName = seatName;
	}

	public BillingEntity() {
		super();
	}

	public long getBillingId() {
		return billingId;
	}

	public void setBillingId(long billingId) {
		this.billingId = billingId;
	}

	public long getBillingTransactionId() {
		return billingTransactionId;
	}

	public void setBillingTransactionId(long billingTransactionId) {
		this.billingTransactionId = billingTransactionId;
	}

	public PriceEntity getPriceDTO() {
		return priceDTO;
	}

	public void setPriceDTO(PriceEntity priceDTO) {
		this.priceDTO = priceDTO;
	}

	public float getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(float totalMoney) {
		this.totalMoney = totalMoney;
	}

	public float getConsession() {
		return consession;
	}

	public void setConsession(float consession) {
		this.consession = consession;
	}

	public float getMoneyPayable() {
		return moneyPayable;
	}

	public void setMoneyPayable(float moneyPayable) {
		this.moneyPayable = moneyPayable;
	}

	public List<OfferEntity> getOfferavailable() {
		return offeravailable;
	}

	public void setOfferavailable(List<OfferEntity> offeravailable) {
		this.offeravailable = offeravailable;
	}

	public List<OfferEntity> getOfferApplied() {
		return offerApplied;
	}

	public void setOfferApplied(List<OfferEntity> offerApplied) {
		this.offerApplied = offerApplied;
	}

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public List<SeatEntity> getSeatName() {
		return seatName;
	}

	public void setSeatName(List<SeatEntity> seatName) {
		this.seatName = seatName;
	}
	
	
	
	// billing process : total for seatNumber * price,evaluate offer, total
	// money-offer moeny : moneypayable

}