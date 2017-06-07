package com.log.access.repositories;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.log.access.entities.LogAccess;

public interface ILogAccessPagSortRepo  extends PagingAndSortingRepository<LogAccess, Long> {
	/**
	 * 
	 * @param from
	 * @param to
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByRCreationDateBetween(Date from, Date to, PageRequest request);
	/**
	 * 
	 * @param login
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByLogin(String login, PageRequest request);
	/**
	 * 
	 * @param document
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByDocument(String document, PageRequest request);
	/**
	 * 
	 * @param action
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByAction(String action, PageRequest request);
	/**
	 * 
	 * @param nhc
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByNhc(String nhc, PageRequest request);
	/**
	 * 
	 * @param nepisode
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByNepisode(String nepisode, PageRequest request);
	/**
	 * 
	 * @param ip
	 * @param request
	 * @return
	 */
	Page<LogAccess> findByIp(String ip, PageRequest request);
}
