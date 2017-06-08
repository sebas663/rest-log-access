package com.log.access.services;

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
}
