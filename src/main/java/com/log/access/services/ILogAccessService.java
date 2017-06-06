package com.log.access.services;

import java.util.Date;
import java.util.List;

import com.log.access.entities.LogAccess;

public interface ILogAccessService {
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getAll();
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getBetweenDates(Date from, Date to);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getByLogin(String login);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getByDocument(String document);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getByAction(String action);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getByNhc(String nhc);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getByNepisode(String nepisode);
	/**
	 * 
	 * @return
	 */
	List<LogAccess> getByIp(String ip);

}
