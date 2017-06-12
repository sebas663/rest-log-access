package com.log.access.responses;

import java.util.List;

import com.log.access.entities.LogAccess;
/**
 * 
 * @author sescudero
 *
 */
public class PageResponse {
	/**
	 * 
	 */
	private List<LogAccess> listPaged;
	/**
	 * 
	 */
	private Integer totalItems;
	/**
	 * @return the listPaged
	 */
	public List<LogAccess> getListPaged() {
		return listPaged;
	}
	/**
	 * @param listPaged the listPaged to set
	 */
	public void setListPaged(List<LogAccess> listPaged) {
		this.listPaged = listPaged;
	}
	/**
	 * @return the totalItems
	 */
	public Integer getTotalItems() {
		return totalItems;
	}
	/**
	 * @param totalItems the totalItems to set
	 */
	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}
	
}
