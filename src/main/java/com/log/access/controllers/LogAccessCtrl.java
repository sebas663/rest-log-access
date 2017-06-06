package com.log.access.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.log.access.entities.LogAccess;
import com.log.access.services.ILogAccessService;

@RestController
@RequestMapping("/logAccess")
public class LogAccessCtrl {
	/**
	 * 
	 */
	@Autowired
	private ILogAccessService logAccessService;
	/**
	 * 
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<List<LogAccess>> getAll() {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getAll();
		if(list != null && list.size() > 0){
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		}else{
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	/**
	 * 
	 * @param login
	 * @return
	 */
	@GetMapping("/da")
	public ResponseEntity<List<LogAccess>> getLogAccessBetweenDates(@RequestParam("from") Date from, @RequestParam("to") Date to) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getBetweenDates(from, to);
		if(list != null && list.size() > 0){
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		}else{
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	/**
	 * 
	 * @param login
	 * @return
	 */
	@GetMapping("/lo/{login}")
	public ResponseEntity<List<LogAccess>> getLogAccessByLogin(@PathVariable("login") String login) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByLogin(login);
		if(list != null && list.size() > 0){
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		}else{
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	/**
	 * 
	 * @param document
	 * @return
	 */
	@GetMapping("/do/{document}")
	public ResponseEntity<List<LogAccess>> getLogAccessByDocument(@PathVariable("document") String document) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByDocument(document);
		if(list != null && list.size() > 0){
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		}else{
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	/**
	 * 
	 * @param action
	 * @return
	 */
	@GetMapping("/ac/{action}")
	public ResponseEntity<List<LogAccess>> getLogAccessByAction(@PathVariable("action") String action) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByAction(action);
		if(list != null && list.size() > 0){
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		}else{
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	/**
	 * 
	 * @param nhc
	 * @return
	 */
	@GetMapping("/nh/{nhc}")
	public ResponseEntity<List<LogAccess>> getLogAccessByNhc(@PathVariable("nhc") String nhc) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByNhc(nhc);
		if(list != null && list.size() > 0){
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		}else{
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	/**
	 * 
	 * @param nepisode
	 * @return
	 */
	@GetMapping("/ne/{nepisode}")
	public ResponseEntity<List<LogAccess>> getLogAccessBynNepisode(@PathVariable("nepisode") String nepisode) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByNepisode(nepisode);
		if(list != null && list.size() > 0){
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		}else{
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	@GetMapping("/i/{ip}")
	public ResponseEntity<List<LogAccess>> getLogAccessByIp(@PathVariable("ip") String ip) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByIp(ip);
		if(list != null && list.size() > 0){
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		}else{
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
}