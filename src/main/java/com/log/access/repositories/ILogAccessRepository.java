package com.log.access.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.log.access.entities.LogAccess;

public interface ILogAccessRepository  extends JpaRepository<LogAccess, Long> {
	
	@Query("select b from LogAccess b " +
	         "where b.r_creation_date between ?1 and ?2")
	List<LogAccess> getBetweenDates(Date from, Date to);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> findByLogin(String login);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> findByDocument(String document);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> findByAction(String action);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> findByNhc(String nhc);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> findByNepisode(String nepisode);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> findByIp(String ip);
}
