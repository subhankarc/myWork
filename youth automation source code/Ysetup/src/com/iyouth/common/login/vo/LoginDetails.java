/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.login.vo;

import java.io.Serializable;

/**
 *
 * @author sumanta.laha
 */
public class LoginDetails implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7756006640011056529L;
	private String userName;
    private String pass;
    private String sessionID;
    
    
    
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
    

}
