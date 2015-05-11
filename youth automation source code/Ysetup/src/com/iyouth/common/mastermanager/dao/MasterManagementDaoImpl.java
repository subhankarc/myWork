/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.mastermanager.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iyouth.common.dao.hibernate.util.ConnectionBaseDao;
import com.iyouth.common.exception.ApplicationException;
import com.iyouth.common.vo.MasterVO;


/**
 * 
 * @author sumanta
 */
public class MasterManagementDaoImpl extends ConnectionBaseDao implements
		MasterManagementDao {

	public List<MasterVO> getRelationWithDetails( ) {
		List<MasterVO> relationDetailsList = null;
				
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="select relation_id,relation_name from relation_with_master order by display_order;";
			//beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			
			rs=pstmt.executeQuery();
			if(rs!=null){
				relationDetailsList=new ArrayList<MasterVO>();
				while(rs.next()){
					MasterVO relationDetails=new MasterVO();
					relationDetails.setKey(rs.getString(1));
					relationDetails.setValue(rs.getString(2));
					relationDetailsList.add(relationDetails);
				}
			}
			
			////commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		return relationDetailsList;
	}

	@Override
	public List<MasterVO> getLocation() {
		List<MasterVO> locationDetailsList = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="select location_id,location_name from location_master order by display_order";
			////beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			
			rs=pstmt.executeQuery();
			if(rs!=null){
				locationDetailsList=new ArrayList<MasterVO>();
				while(rs.next()){
					MasterVO locDetails=new MasterVO();
					locDetails.setKey(rs.getString(1));
					locDetails.setValue(rs.getString(2));
					locationDetailsList.add(locDetails);
				}
			}
			
			//commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		return locationDetailsList;	}

	@Override
	public List<MasterVO> getQualificationDetails() {
		List<MasterVO> qualDetailsList = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="select qualification_id,qualification from qualification_master order by display_order";
			////beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			
			rs=pstmt.executeQuery();
			if(rs!=null){
				qualDetailsList=new ArrayList<MasterVO>();
				while(rs.next()){
					MasterVO qualDetails=new MasterVO();
					qualDetails.setKey(rs.getString(1));
					qualDetails.setValue(rs.getString(2));
					qualDetailsList.add(qualDetails);
				}
			}
			
			//commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		return qualDetailsList;
	}

	@Override
	public List<MasterVO> getCourseTypeDetails() {
		List<MasterVO> courceTypeDetailsList = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="select course_type_id,course_type_name from course_type_master order by display_order";
			//beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			
			rs=pstmt.executeQuery();
			if(rs!=null){
				courceTypeDetailsList=new ArrayList<MasterVO>();
				while(rs.next()){
					MasterVO courceType=new MasterVO();
					courceType.setKey(rs.getString(1));
					courceType.setValue(rs.getString(2));
					courceTypeDetailsList.add(courceType);
				}
			}
			
			//commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		return courceTypeDetailsList;
	}

	@Override
	public List<MasterVO> getStreamDetails() {
		List<MasterVO> streamDetailsList = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="select stream_id,stream_name from stream_master order by display_order";
			//beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			
			rs=pstmt.executeQuery();
			if(rs!=null){
				streamDetailsList=new ArrayList<MasterVO>();
				while(rs.next()){
					MasterVO streamDetails=new MasterVO();
					streamDetails.setKey(rs.getString(1));
					streamDetails.setValue(rs.getString(2));
					streamDetailsList.add(streamDetails);
				}
			}
			
			//commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		return streamDetailsList;
	}

	@Override
	public List<MasterVO> getStudentType() {
		List<MasterVO> stdTypeList = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="select student_type,description from student_type_master ";
			//beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			
			rs=pstmt.executeQuery();
			if(rs!=null){
				stdTypeList=new ArrayList<MasterVO>();
				while(rs.next()){
					MasterVO stdTypeDetails=new MasterVO();
					stdTypeDetails.setKey(rs.getString(1));
					stdTypeDetails.setValue(rs.getString(2));
					stdTypeList.add(stdTypeDetails);
				}
			}
			
			//commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		return stdTypeList;
	}

	@Override
	public List<MasterVO> getSession() {
		List<MasterVO> sessionList = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="select session_id,description from session_master";
			//beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			
			rs=pstmt.executeQuery();
			if(rs!=null){
				sessionList=new ArrayList<MasterVO>();
				while(rs.next()){
					MasterVO sessionDetails=new MasterVO();
					sessionDetails.setKey(rs.getString(1));
					sessionDetails.setValue(rs.getString(2));
					sessionList.add(sessionDetails);
				}
			}
			
			//commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		return sessionList;
	}
	
	
}
