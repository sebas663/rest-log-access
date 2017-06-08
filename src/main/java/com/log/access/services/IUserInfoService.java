package com.log.access.services;

import java.util.List;

import com.log.access.entities.UserInfo;

/**
 * 
 * @author sescudero
 *
 */
public interface IUserInfoService {
	/**
	 * 
	 * @param login
	 * @return
	 */
	UserInfo getUserInfoByLogin(String login);
	
	/**
	 * 
	 * @return
	 */
	List<UserInfo> getAll();
}
