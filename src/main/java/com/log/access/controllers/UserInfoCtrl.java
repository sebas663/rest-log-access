package com.log.access.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.log.access.entities.UserInfo;
import com.log.access.services.IUserInfoService;

/**
 * 
 * @author sebastian
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/userInfo")
public class UserInfoCtrl {
	/**
	 * 
	 */
	@Autowired
	private IUserInfoService userInfoService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<List<UserInfo>> getAll() {
		List<UserInfo> list = null;
		ResponseEntity<List<UserInfo>> response = null;
		list = userInfoService.getAll();
		if (list != null && list.size() > 0) {
			response = new ResponseEntity<List<UserInfo>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<UserInfo>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	/**
	 * 
	 * @param login
	 * @return
	 */
	@GetMapping("/{login}")
	public ResponseEntity<UserInfo> getLogAccessByLogin(@PathVariable("login") String login) {
		UserInfo userInfo = null;
		ResponseEntity<UserInfo> response = null;
		userInfo = userInfoService.getUserInfoByLogin(login);
		if (userInfo != null) {
			response = new ResponseEntity<UserInfo>(userInfo, HttpStatus.OK);
		} else {
			response = new ResponseEntity<UserInfo>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
}
