package com.log.access;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author sebastian
 *
 */
@SpringBootApplication
public class LogAccessApplication {
	/**
	 * 
	 */
	@Autowired
	DataSource dataSource;
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(LogAccessApplication.class, args);
	}
}
