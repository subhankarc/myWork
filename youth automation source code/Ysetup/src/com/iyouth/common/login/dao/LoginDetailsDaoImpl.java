/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.login.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iyouth.common.dao.hibernate.util.ConnectionBaseDao;
import com.iyouth.common.exception.ApplicationException;
import com.iyouth.common.login.vo.LoginDetails;
import com.iyouth.common.login.vo.User;


/**
 * 
 * @author sumanta
 */
public class LoginDetailsDaoImpl extends ConnectionBaseDao implements
		LoginDetailsDao {

	public User getUserDetails(LoginDetails loginDetails) {
		User userDetails = null;
				
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="select id,user_type,login_start_date,login_end_date,active_status from user_details  where binary user_name=? and binary user_password=?";
			beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			pstmt.setString(1, loginDetails.getUserName());
			pstmt.setString(2, loginDetails.getPass());
			rs=pstmt.executeQuery();
			if(rs!=null){
				if(rs.next()){
					userDetails=new User();
					userDetails.setUserName(loginDetails.getUserName());
					userDetails.setId(rs.getInt(1));
					userDetails.setUserType(rs.getInt(2));
					userDetails.setLoginStartDate(rs.getTimestamp(3));
					userDetails.setLoginEndDate(rs.getTimestamp(4));
				}
			}
			
			commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		return userDetails;
	}

	public boolean saveLoginDetails(User loginDetails) {
		boolean status = true;
		System.out.println("Enter in to saveLoginDetails");
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try{
		if(getDataBaseSession()!=null){
			String insertStr="insert into login_logout_details (session_id, user_id, login_time) values (?, ?, now())";
			beginTransaction();
			pstmt=getDbConnection().prepareStatement(insertStr);
			pstmt.setString(1, loginDetails.getSessionId());
			pstmt.setInt(2, loginDetails.getId());
			
			
			rowCount=pstmt.executeUpdate();
			if(rowCount<0){
				status=false;
			}
			
			commitTransaction();	
		}
		}catch(Exception ex){
			status=false;
			 new ApplicationException(ex.getMessage());
		}
		return status;
	}

	public boolean saveLogOutDetails(User loginDetails) {
		boolean status = true;
		System.out.println("Enter in to saveLogOutDetails");
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try{
		if(getDataBaseSession()!=null){
			String insertStr="update `login_logout_details` set `logout_time`=now() where  `session_id`=?  and `user_id`=?";
			beginTransaction();
			pstmt=getDbConnection().prepareStatement(insertStr);
			pstmt.setString(1, loginDetails.getSessionId());
			pstmt.setInt(2, loginDetails.getId());
			
			
			rowCount=pstmt.executeUpdate();
			if(rowCount<0){
				status=false;
			}
			
			commitTransaction();	
		}
		}catch(Exception ex){
			status=false;
			 new ApplicationException(ex.getMessage());
		}
		return status;
		
	}
}
