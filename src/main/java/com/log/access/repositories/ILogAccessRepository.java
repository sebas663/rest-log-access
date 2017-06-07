package com.log.access.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.log.access.entities.LogAccess;
/**
 * 
 * @author sebastian
 *
 */
public interface ILogAccessRepository  extends JpaRepository<LogAccess, Long> {
	/**
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	List<LogAccess> findByRCreationDateBetween(Date from, Date to);
	/**
	 * 
	 * @param login
	 * @return
	 */
	List<LogAccess> findByLogin(String login);
	/**
	 * 
	 * @param document
	 * @return
	 */
	List<LogAccess> findByDocument(String document);
	/**
	 * 
	 * @param action
	 * @return
	 */
	List<LogAccess> findByAction(String action);
	/**
	 * 
	 * @param nhc
	 * @return
	 */
	List<LogAccess> findByNhc(String nhc);
	/**
	 * 
	 * @param nepisode
	 * @return
	 */
	List<LogAccess> findByNepisode(String nepisode);
	/**
	 * 
	 * @param ip
	 * @return
	 */
	List<LogAccess> findByIp(String ip);
}
