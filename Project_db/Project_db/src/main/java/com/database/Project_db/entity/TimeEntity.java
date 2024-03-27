package com.database.Project_db.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "timeen")
public class TimeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long timeId;
	
	private LocalDateTime startTime;
	
	private LocalDateTime endTime;
	
	private LocalDateTime updateTime;
	
	@OneToOne
	@JoinColumn(name="show_Id", nullable=false)
	private ShowEntity time;	
	
	public TimeEntity() {
		
	}
	
	public TimeEntity(long timeId, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime updateTime,
			ShowEntity show) {
		super();
		this.timeId = timeId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.updateTime = updateTime;
		this.time = show;
	}

	public long getTimeId() {
		return timeId;
	}

	public void setTimeId(long timeId) {
		this.timeId = timeId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
}
