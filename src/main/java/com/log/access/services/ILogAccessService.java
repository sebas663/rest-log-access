package com.log.access.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.log.access.entities.LogAccess;

/**
 * 
 * @author sebastian
 *
 */
public interface ILogAccessService {
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getAll();

	/**
	 * 
	 * @param logAccess
	 */
	void save(LogAccess logAccess);

	/**
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	List<LogAccess> getBetweenDates(Date from, Date to);
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @param login
	 * @return
	 */
	List<LogAccess> getBetweenDatesAndLogin(Date from, Date to,String login);

	/**
	 * 
	 * @param login
	 * @return
	 */
	List<LogAccess> getByLogin(String login);

	/**
	 * 
	 * @param document
	 * @return
	 */
	List<LogAccess> getByDocument(String document);

	/**
	 * 
	 * @param action
	 * @return
	 */
	List<LogAccess> getByAction(String action);

	/**
	 * 
	 * @param nhc
	 * @return
	 */
	List<LogAccess> getByNhc(String nhc);

	/**
	 * 
	 * @param nepisode
	 * @return
	 */
	List<LogAccess> getByNepisode(String nepisode);

	/**
	 * 
	 * @param ip
	 * @return
	 */
	List<LogAccess> getByIp(String ip);

	/**
	 * 
	 * @param request
	 * @return
	 */
	Page<LogAccess> getAll(PageRequest request);

	/**
	 * 
	 * @param from
	 * @param to
	 * @param request
	 * @return
	 */
	Page<LogAccess> getBetweenDates(Date from, Date to, PageRequest request);
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @param login
	 * @return
	 */
	Page<LogAccess> getBetweenDatesAndLogin(Date from, Date to,String login, PageRequest request);

	/**
	 * 
	 * @param login
	 * @param request
	 * @return
	 */
	Page<LogAccess> getByLogin(String login, PageRequest request);

	/**
	 * 
	 * @param document
	 * @param request
	 * @return
	 */
	Page<LogAccess> getByDocument(String document, PageRequest request);

	/**
	 * 
	 * @param action
	 * @param request
	 * @return
	 */
	Page<LogAccess> getByAction(String action, PageRequest request);

	/**
	 * 
	 * @param nhc
	 * @param request
	 * @return
	 */
	Page<LogAccess> getByNhc(String nhc, PageRequest request);

	/**
	 * 
	 * @param nepisode
	 * @param request
	 * @return
	 */
	Page<LogAccess> getByNepisode(String nepisode, PageRequest request);

	/**
	 * 
	 * @param ip
	 * @param request
	 * @return
	 */
	Page<LogAccess> getByIp(String ip, PageRequest request);

}
