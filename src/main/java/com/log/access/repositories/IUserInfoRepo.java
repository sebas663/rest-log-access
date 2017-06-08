package com.log.access.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.log.access.entities.UserInfo;

/**
 * 
 * @author sescudero
 *
 */
public interface IUserInfoRepo extends JpaRepository<UserInfo, String> {
	/**
	 * 
	 * @param login
	 * @return
	 */
	UserInfo findByLogin(String login);
}
