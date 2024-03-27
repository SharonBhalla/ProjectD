package com.database.Project_db.jpa;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.database.Project_db.entity.SeatEntity;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface SeatJpaRepositoryInterface extends JpaRepository<SeatEntity, Long>{
	
	@Query(value=" select s from seat s where s.seatId in :names  ",nativeQuery = true)
	public List<SeatEntity> findSeatByIdList(@Param("names") Collection<Long> names);
	
	@Modifying
	@Query(value="update seat u set u.seat_Status = :status where u.seat_Id in  :seatIds",nativeQuery = true)
	public void updateUserSetStatusForName(@Param("status") String status, 
			@Param("seatIds") Set<Long> seatIds);
}
