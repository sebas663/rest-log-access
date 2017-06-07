package com.log.access.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.log.access.entities.LogAccess;
import com.log.access.repositories.ILogAccessPagSortRepo;
import com.log.access.repositories.ILogAccessRepo;
/**
 * 
 * @author sebastian
 *
 */
@Service
public class LogAccessService implements ILogAccessService{
	/**
	 * 
	 */
	@Autowired
	private ILogAccessRepo logAccessRepository;
	/**
	 * 
	 */
	@Autowired
	private ILogAccessPagSortRepo logAccessPagSortRepo;
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getAll()
	 */
//	@Override
	public List<LogAccess> getAll() {
		// TODO Auto-generated method stub
		return logAccessRepository.findAll();
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getBetweenDates(java.util.Date, java.util.Date)
	 */
//	@Override
	public List<LogAccess> getBetweenDates(Date from, Date to) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByRCreationDateBetween(from, to);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByLogin(java.lang.String)
	 */
//	@Override
	public List<LogAccess> getByLogin(String login) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByLogin(login);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByDocument(java.lang.String)
	 */
//	@Override
	public List<LogAccess> getByDocument(String document) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByDocument(document);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByAction(java.lang.String)
	 */
//	@Override
	public List<LogAccess> getByAction(String action) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByAction(action);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByNhc(java.lang.String)
	 */
//	@Override
	public List<LogAccess> getByNhc(String nhc) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByNhc(nhc);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByNepisode(java.lang.String)
	 */
//	@Override
	public List<LogAccess> getByNepisode(String nepisode) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByNepisode(nepisode);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByIp(java.lang.String)
	 */
//	@Override
	public List<LogAccess> getByIp(String ip) {
		// TODO Auto-generated method stub
		return logAccessRepository.findByIp(ip);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getAll(org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getAll(PageRequest request) {
		// TODO Auto-generated method stub
		return logAccessPagSortRepo.findAll(request);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getBetweenDates(java.util.Date, java.util.Date, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getBetweenDates(Date from, Date to, PageRequest request) {
		// TODO Auto-generated method stub
		return logAccessPagSortRepo.findByRCreationDateBetween(from, to,request);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByLogin(java.lang.String, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByLogin(String login, PageRequest request) {
		// TODO Auto-generated method stub
		return logAccessPagSortRepo.findByLogin(login,request);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByDocument(java.lang.String, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByDocument(String document, PageRequest request) {
		// TODO Auto-generated method stub
		return logAccessPagSortRepo.findByDocument(document, request);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByAction(java.lang.String, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByAction(String action, PageRequest request) {
		// TODO Auto-generated method stub
		return logAccessPagSortRepo.findByAction(action, request);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByNhc(java.lang.String, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByNhc(String nhc, PageRequest request) {
		// TODO Auto-generated method stub
		return logAccessPagSortRepo.findByNhc(nhc, request);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByNepisode(java.lang.String, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByNepisode(String nepisode, PageRequest request) {
		// TODO Auto-generated method stub
		return logAccessPagSortRepo.findByNepisode(nepisode, request);
	}
	/*
	 * (non-Javadoc)
	 * @see com.log.access.services.ILogAccessService#getByIp(java.lang.String, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByIp(String ip, PageRequest request) {
		// TODO Auto-generated method stub
		return logAccessPagSortRepo.findByIp(ip, request);
	}

}
