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
public class LogAccessService implements ILogAccessService {
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
	 * 
	 * @see com.log.access.services.ILogAccessService#getAll()
	 */
	@Override
	public List<LogAccess> getAll() {

		return logAccessRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#save(com.log.access.entities.
	 * LogAccess)
	 */
	@Override
	public void save(LogAccess logAccess) {

		logAccessRepository.save(logAccess);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getBetweenDates(java.util.Date,
	 * java.util.Date)
	 */
	@Override
	public List<LogAccess> getBetweenDates(Date from, Date to) {

		return logAccessRepository.findByRCreationDateBetween(from, to);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getByLogin(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByLogin(String login) {

		return logAccessRepository.findByLogin(login);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getByDocument(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByDocument(String document) {

		return logAccessRepository.findByDocument(document);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getByAction(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByAction(String action) {

		return logAccessRepository.findByAction(action);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.log.access.services.ILogAccessService#getByNhc(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByNhc(String nhc) {

		return logAccessRepository.findByNhc(nhc);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getByNepisode(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByNepisode(String nepisode) {

		return logAccessRepository.findByNepisode(nepisode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.log.access.services.ILogAccessService#getByIp(java.lang.String)
	 */
	@Override
	public List<LogAccess> getByIp(String ip) {

		return logAccessRepository.findByIp(ip);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getAll(org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getAll(PageRequest request) {

		return logAccessPagSortRepo.findAll(request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getBetweenDates(java.util.Date,
	 * java.util.Date, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getBetweenDates(Date from, Date to, PageRequest request) {

		return logAccessPagSortRepo.findByRCreationDateBetween(from, to, request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getByLogin(java.lang.String,
	 * org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByLogin(String login, PageRequest request) {

		return logAccessPagSortRepo.findByLogin(login, request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getByDocument(java.lang.String,
	 * org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByDocument(String document, PageRequest request) {

		return logAccessPagSortRepo.findByDocument(document, request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getByAction(java.lang.String,
	 * org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByAction(String action, PageRequest request) {

		return logAccessPagSortRepo.findByAction(action, request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.log.access.services.ILogAccessService#getByNhc(java.lang.String,
	 * org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByNhc(String nhc, PageRequest request) {

		return logAccessPagSortRepo.findByNhc(nhc, request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.log.access.services.ILogAccessService#getByNepisode(java.lang.String,
	 * org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByNepisode(String nepisode, PageRequest request) {

		return logAccessPagSortRepo.findByNepisode(nepisode, request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.log.access.services.ILogAccessService#getByIp(java.lang.String,
	 * org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<LogAccess> getByIp(String ip, PageRequest request) {

		return logAccessPagSortRepo.findByIp(ip, request);
	}
}
