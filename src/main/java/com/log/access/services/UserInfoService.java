package com.log.access.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.log.access.entities.UserInfo;
import com.log.access.repositories.IUserInfoRepo;
/**
 * 
 * @author sescudero
 *
 */
@Service
public class UserInfoService implements IUserInfoService {
	/**
	 * 
	 */
	@Autowired
	private IUserInfoRepo userInfoRepo;

	@Override
	public UserInfo getUserInfoByLogin(String login) {
		// TODO Auto-generated method stub
		return userInfoRepo.findByLogin(login);
	}

	@Override
	public List<UserInfo> getAll() {
		// TODO Auto-generated method stub
		return userInfoRepo.findAll();
	}
}
