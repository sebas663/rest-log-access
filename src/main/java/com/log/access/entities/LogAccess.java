package com.log.access.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author sebastian
 *
 */
@Entity
@Table(name = "LOG_ACCESS_DATA_T")
public class LogAccess implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Sin un id no puedo mapear la vista como entidad. tengo que agregar en la
	 * vista rownum AS ID see
	 * http://tuhrig.de/using-spring-data-for-database-views-without-an-id/
	 */
	@Id
	@Column(name = "id")
	private Long id;
	/**
	 * 
	 */
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "r_creation_date")
	private Date rCreationDate;
	/**
	 * 
	 */
	@Column(name = "login")
	private String login;
	/**
	 * 
	 */
	@Column(name = "documento")
	private String document;
	/**
	 * 
	 */
	@Column(name = "accion")
	private String action;
	/**
	 * 
	 */
	@Column(name = "nhc")
	private String nhc;
	/**
	 * 
	 */
	@Column(name = "nepisodio")
	private String nepisode;
	/**
	 * 
	 */
	@Column(name = "ip")
	private String ip;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the rCreationDate
	 */
	public Date getrCreationDate() {
		return rCreationDate;
	}

	/**
	 * @param rCreationDate
	 *            the rCreationDate to set
	 */
	public void setrCreationDate(Date rCreationDate) {
		this.rCreationDate = rCreationDate;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the document
	 */
	public String getDocument() {
		return document;
	}

	/**
	 * @param document
	 *            the document to set
	 */
	public void setDocument(String document) {
		this.document = document;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the nhc
	 */
	public String getNhc() {
		return nhc;
	}

	/**
	 * @param nhc
	 *            the nhc to set
	 */
	public void setNhc(String nhc) {
		this.nhc = nhc;
	}

	/**
	 * @return the nepisode
	 */
	public String getNepisode() {
		return nepisode;
	}

	/**
	 * @param nepisode
	 *            the nepisode to set
	 */
	public void setNepisode(String nepisode) {
		this.nepisode = nepisode;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip
	 *            the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

}
