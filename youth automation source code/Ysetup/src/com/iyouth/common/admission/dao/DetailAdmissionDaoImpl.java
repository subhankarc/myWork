/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iyouth.common.admission.vo.DetailAdmissionVO;
import com.iyouth.common.dao.hibernate.util.ConnectionBaseDao;
import com.iyouth.common.exception.ApplicationException;

/**
 * 
 * @author subhankar
 */
public class DetailAdmissionDaoImpl extends ConnectionBaseDao implements
		DetailAdmissionDao {

	

	@Override
	public DetailAdmissionVO loadData(DetailAdmissionVO detailAdmissionVO) {

		DetailAdmissionVO userDetails = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		PreparedStatement pstmt2 = null;
		ResultSet rs2 = null;
		try{
		if(getDataBaseSession()!=null){
			String selectStr="SELECT `form_no`, `course_type_id`, " +
					"`stream_id`, `session_id`, `student_type`, `student_id`" +
					" FROM " +
					"`registration` WHERE `form_no`=?";
			beginTransaction();
			pstmt=getDbConnection().prepareStatement(selectStr);
			pstmt.setString(1, detailAdmissionVO.getFormNoSearch());
			rs=pstmt.executeQuery();
			if(rs!=null){
				if(rs.next()){
					userDetails=new DetailAdmissionVO();
					userDetails.setFormNo(rs.getString(1));
					userDetails.setCourseType(rs.getString(2));
					userDetails.setStream(rs.getString(3));
					userDetails.setSession(rs.getString(4));
					userDetails.setStudentType(rs.getString(5));
					userDetails.setStudentId(rs.getString(6));
				}
			}
			
			commitTransaction();	
		}
		}catch(Exception ex){
			 new ApplicationException(ex.getMessage());
		}
		
		try{
			if(getDataBaseSession()!=null){
				String selectStr2="SELECT `student_name`, `contactno1` " +
						"FROM `student` WHERE `student_id` = ?";
				beginTransaction();
				pstmt2=getDbConnection().prepareStatement(selectStr2);
				pstmt2.setString(1, userDetails.getStudentId());
				rs2=pstmt2.executeQuery();
				if(rs2!=null){
					if(rs2.next()){
						userDetails.setCandidateName(rs2.getString(1));
						userDetails.setPrimaryContactNo(String.valueOf(rs2.getInt(2)));
					}
				}
				
				commitTransaction();	
			}
			}catch(Exception ex){
				 new ApplicationException(ex.getMessage());
			}
		
		return userDetails;
	
	
	}

	
	@Override
	public boolean updateInStudent(DetailAdmissionVO detailAdmissionVO) {

		boolean rowBoolean = false;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "UPDATE student SET guardian_name=?," +
						"relation_with_guardian=?,address=?,pincode=?,contactno2=?," +
						"emailid=?,dob=?,photo=?,last_education=?,year_of_passing=?," +
						"institution=?,marks=?,computer_skills=?,computer_institutions=?," +
						"modified_by=?,modified_time=NOW() WHERE student_id=?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(insertStr);
				pstmt.setString(1, detailAdmissionVO.getGuardian());
				pstmt.setString(2, detailAdmissionVO.getRelationWith());
				pstmt.setString(3, detailAdmissionVO.getAddress());
				pstmt.setInt(4, detailAdmissionVO.getPinDb());
				pstmt.setLong(5, detailAdmissionVO.getSecondaryContactNoDb());
				pstmt.setString(6, detailAdmissionVO.getEmail());
				pstmt.setString(7, detailAdmissionVO.getDob());
				pstmt.setString(8, detailAdmissionVO.getPhoto());
				pstmt.setString(9, detailAdmissionVO.getLastEducation());
				pstmt.setString(10, detailAdmissionVO.getYearOfPassing());
				pstmt.setString(11, detailAdmissionVO.getInstitution());
				pstmt.setDouble(12, detailAdmissionVO.getMarksDb());
				pstmt.setString(13, detailAdmissionVO.getComputerSkills());
				pstmt.setString(14, detailAdmissionVO.getComputerInstitution());
				pstmt.setString(15, detailAdmissionVO.getModifiedBy());
				//pstmt.setString(16, detailAdmissionVO.getModifiedTime());
				pstmt.setString(16, detailAdmissionVO.getStudentId());
				
				
				rowCount = pstmt.executeUpdate();

				if (rowCount > 0) {
					rowBoolean = true;
					commitTransaction();
				}

			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			new ApplicationException(ex.getMessage());
		}
		return rowBoolean;
	
	
	}
	
}
