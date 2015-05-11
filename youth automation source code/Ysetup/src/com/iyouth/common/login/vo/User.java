package com.iyouth.common.login.vo;

import java.util.Date;

public class User implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7722213461945527892L;
	private String sessionId;
	private Integer id;
	private String userName;
	private Integer userType;
	private Date loginStartDate;
	private Date loginEndDate;
	private boolean activeStatus;

	public Date getLoginStartDate() {
		return loginStartDate;
	}

	public void setLoginStartDate(Date loginStartDate) {
		this.loginStartDate = loginStartDate;
	}

	public Date getLoginEndDate() {
		return loginEndDate;
	}

	public void setLoginEndDate(Date loginEndDate) {
		this.loginEndDate = loginEndDate;
	}

	public boolean isActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

}
