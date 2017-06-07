package com.log.access.services;

import java.util.Date;
import java.util.List;

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
	 * @param from
	 * @param to
	 * @return
	 */
	List<LogAccess> getBetweenDates(Date from, Date to);
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

}
