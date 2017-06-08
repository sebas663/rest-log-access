package com.log.access.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author sebastian
 *
 */
@Entity
@Table(name = "HCE_USUARIO")
public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1580210052378673900L;
	/**
	 * 
	 */
	@Id
	@Column(name = "r_object_id")
	private String id;
	/**
	 * 
	 */
	@Column(name = "login")
	private String login;
	/**
	 * 
	 */
	@Column(name = "nombre")
	private String name;
	/**
	 * 
	 */
	@Column(name = "apellido1")
	private String surname;
	/**
	 * 
	 */
	@Column(name = "apellido2")
	private String surname2;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the surname2
	 */
	public String getSurname2() {
		return surname2;
	}

	/**
	 * @param surname2
	 *            the surname2 to set
	 */
	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}

}
