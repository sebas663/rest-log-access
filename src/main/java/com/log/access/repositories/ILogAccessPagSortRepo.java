package com.log.access.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	Page<LogAccess> findByRCreationDateBetweenAndLogin(Date from, Date to, String login, Pageable pageable);

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
