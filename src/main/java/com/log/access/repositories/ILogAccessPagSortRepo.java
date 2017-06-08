package com.log.access.repositories;

import java.util.Date;

import javax.persistence.TemporalType;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.log.access.entities.LogAccess;

public interface ILogAccessPagSortRepo extends PagingAndSortingRepository<LogAccess, Long> {
	/**
	 * 
	 * @param from
	 * @param to
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByRCreationDateBetween(Date from, Date to, Pageable pageable);
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @param login
	 * @param pageable
	 * @return
	 */
	 @Query(value = "SELECT t "
			 +" FROM LogAccess t "
			 +"  WHERE t.login = ?1 "
			 +"    AND t.rCreationDate BETWEEN ?2 "
			 +"                              AND ?3 ")
	Page<LogAccess> findByLoginAndRCreationDateBetween(String login, Date from, @Temporal(TemporalType.DATE) Date to, Pageable pageable);
	 
   /**
	 * 
	 * @param from
	 * @param to
	 * @param login
	 * @param pageable
	 * @return
	 */
	 @Query(value = "SELECT t "
			 +"   FROM LogAccess t "
			 +"  WHERE t.login = ?1 "
			 +"    AND trunc(t.rCreationDate) = trunc(?2)")
	Page<LogAccess> findByLoginAndRCreationDate(String login, Date from, Pageable pageable);

	/**
	 * 
	 * @param login
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByLogin(String login, Pageable pageable);

	/**
	 * 
	 * @param document
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByDocument(String document, Pageable pageable);

	/**
	 * 
	 * @param action
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByAction(String action, Pageable pageable);

	/**
	 * 
	 * @param nhc
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByNhc(String nhc, Pageable pageable);

	/**
	 * 
	 * @param nepisode
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByNepisode(String nepisode, Pageable pageable);

	/**
	 * 
	 * @param ip
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByIp(String ip, Pageable pageable);
}
