package com.log.access.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LOG_ACCESS_DATA_VIEW")
public class LogAccess implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	/**
	 * 
	 */
	private Date r_creation_date;
	/**
	 * 
	 */
	private String login;
	/**
	 * 
	 */
	private String document;
	/**
	 * 
	 */
	private String action;
	/**
	 * 
	 */
	private String nhc;
	/**
	 * 
	 */
	private String nepisode;
	/**
	 * 
	 */
	private String ip;
	
	/**
	 * @return the r_creation_date
	 */
	public Date getR_creation_date() {
		return r_creation_date;
	}
	/**
	 * @param r_creation_date the r_creation_date to set
	 */
	public void setR_creation_date(Date r_creation_date) {
		this.r_creation_date = r_creation_date;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	/**
	 * @return the accion
	 */
	public String getAccion() {
		return accion;
	}
	/**
	 * @param accion the accion to set
	 */
	public void setAccion(String accion) {
		this.accion = accion;
	}
	/**
	 * @return the nhc
	 */
	public String getNhc() {
		return nhc;
	}
	/**
	 * @param nhc the nhc to set
	 */
	public void setNhc(String nhc) {
		this.nhc = nhc;
	}
	/**
	 * @return the nepisodio
	 */
	public String getNepisodio() {
		return nepisodio;
	}
	/**
	 * @param nepisodio the nepisodio to set
	 */
	public void setNepisodio(String nepisodio) {
		this.nepisodio = nepisodio;
	}
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
