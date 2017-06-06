package com.log.access.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.log.access.entities.LogAccess;
import com.log.access.repositories.ILogAccessRepository;

@Service
public class LogAccessService implements ILogAccessService{
	/**
	 * 
	 */
	@Autowired
	private ILogAccessRepository logAccessRepository;
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getAll()
	 */
	@Override
	public List<LogAccess> getAll() {
		// TODO Auto-generated method stub
		return logAccessRepository.findAll();
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getBetweenDates(java.util.Date, java.util.Date)
	 */
	@Override
	public List<LogAccess> getBetweenDates(Date from, Date to) {
		// TODO Auto-generated method stub
		return logAccessRepository.getBetweenDates(from, to);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByLogin(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByLogin(String login) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByLogin(login);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByDocument(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByDocument(String document) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByDocument(document);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByAction(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByAction(String action) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByAction(action);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByNhc(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByNhc(String nhc) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByNhc(nhc);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByNepisode(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByNepisode(String nepisode) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByNepisode(nepisode);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByIp(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByIp(String ip) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByIp(ip);
	}

}
