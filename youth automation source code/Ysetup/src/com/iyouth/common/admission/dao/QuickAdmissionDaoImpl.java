/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iyouth.common.admission.vo.QuickAdmissionVO;
import com.iyouth.common.dao.hibernate.util.ConnectionBaseDao;
import com.iyouth.common.exception.ApplicationException;

/**
 * 
 * @author subhankar
 */
public class QuickAdmissionDaoImpl extends ConnectionBaseDao implements
		QuickAdmissionDao {

	@Override
	public int getMaxSerialNoFromReg(QuickAdmissionVO quickAdmissionVO) {
		PreparedStatement pstmt = null;
		int maxSerialNo = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "SELECT MAX(`serial_no`) FROM `registration`";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(insertStr);
				ResultSet rs = pstmt.executeQuery();

				if (rs != null) {
					if (rs.next()) {
						maxSerialNo = rs.getInt(1);
						return maxSerialNo;
					}
				}

			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			new ApplicationException(ex.getMessage());
		}

		return maxSerialNo;

	}

	@Override
	public Integer getSessionStartMonth(QuickAdmissionVO quickAdmissionVO) {
		PreparedStatement pstmt = null;
		int sessionStartMonth = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "SELECT `start` FROM `session_master` where `session_id`=?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(insertStr);
				pstmt.setString(1, quickAdmissionVO.getSessionId());
				ResultSet rs = pstmt.executeQuery();

				if (rs != null) {
					if (rs.next()) {
						sessionStartMonth = rs.getInt(1);
						return sessionStartMonth;
					}
				}

			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			new ApplicationException(ex.getMessage());
		}

		return sessionStartMonth;

	}

	@Override
	public int getMaxSerialNoFromStd(QuickAdmissionVO quickAdmissionVO) {

		PreparedStatement pstmt = null;
		int maxSerialNo = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "SELECT MAX(`serial_no`) FROM `student`";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(insertStr);
				ResultSet rs = pstmt.executeQuery();

				if (rs != null) {
					if (rs.next()) {
						maxSerialNo = rs.getInt(1);
						return maxSerialNo;
					}
				}

			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			new ApplicationException(ex.getMessage());
		}

		return maxSerialNo;
	}

	@Override
	public boolean insertInStudent(QuickAdmissionVO quickAdmissionVO) {

		boolean rowBoolean = false;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "INSERT INTO `student` (`student_id`, "
						+ "`student_current_regid`, `added_by`, "
						+ "`added_time`, `modified_by`, " +
						"`modified_time`, `student_name`, `contactno1`) " +
						"VALUES (?,?,?,now(),?,now(),?,?)";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(insertStr);
				pstmt.setString(1, quickAdmissionVO.getStudentId());
				pstmt.setString(2, quickAdmissionVO.getRegistrationId());
				pstmt.setString(3, quickAdmissionVO.getAddedBy());
				pstmt.setString(4, quickAdmissionVO.getModifiedBy());
				pstmt.setString(5, quickAdmissionVO.getCandidateName());
				pstmt.setLong(6, quickAdmissionVO.getContactNoDB());
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

	@Override
	public boolean insertInReg(QuickAdmissionVO quickAdmissionVO) {

		boolean rowBoolean = false;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "INSERT INTO `registration` "
						+ "(`registration_id`, `student_id`, `registration_date`,"
						+ " `registration_year`, `course_type_id`, `stream_id`,"
						+ " `student_type`, `session_id`, `added_by`, `added_time`,"
						+ " `modified_by`, `modified_time`, `form_no`) VALUES "
						+ "(?,?,now(),?,?,?,?,?,?,now(),?,now(),?)";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(insertStr);
				pstmt.setString(1, quickAdmissionVO.getRegistrationId());
				pstmt.setString(2, quickAdmissionVO.getStudentId());
				pstmt.setInt(3, quickAdmissionVO.getRegistrationYear());
				pstmt.setString(4, quickAdmissionVO.getCourseTypeId());
				pstmt.setString(5, quickAdmissionVO.getStreamId());
				pstmt.setString(6, quickAdmissionVO.getStudentType());
				pstmt.setString(7, quickAdmissionVO.getSessionId());
				pstmt.setString(8, quickAdmissionVO.getAddedBy());
				pstmt.setString(9, quickAdmissionVO.getModifiedBy());
				pstmt.setString(10, quickAdmissionVO.getFormNo());

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

	@Override
	public QuickAdmissionVO loadDataFromFormSelling(
			QuickAdmissionVO quickAdmissionVO) {
		QuickAdmissionVO userDetails = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			if (getDataBaseSession() != null) {
				String selectStr = "SELECT `candidate_name`, `contact_no`, "
						+ "`course_type_id`, `stream_id`, `student_type`, `session_id`"
						+ " FROM `form_selling` WHERE `form_no`=?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(selectStr);
				pstmt.setString(1, quickAdmissionVO.getFormNo());
				rs = pstmt.executeQuery();
				if (rs != null) {
					if (rs.next()) {
						userDetails = new QuickAdmissionVO();
						userDetails.setCandidateName(rs.getString(1));
						userDetails.setContactNo(String.valueOf(rs.getInt(2)));
						userDetails.setCourseTypeId(rs.getString(3));
						userDetails.setStreamId(rs.getString(4));
						userDetails.setStudentType(rs.getString(5));
						userDetails.setSessionId(rs.getString(6));
					}
				}

				commitTransaction();
			}
		} catch (Exception ex) {
			new ApplicationException(ex.getMessage());
		}
		return userDetails;

	}

	@Override
	public boolean isFormNoExists(QuickAdmissionVO quickAdmissionVO) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			if (getDataBaseSession() != null) {
				String selectStr = "SELECT * FROM `registration` WHERE `form_no` = ?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(selectStr);
				pstmt.setString(1, quickAdmissionVO.getFormNo());
				rs = pstmt.executeQuery();
				if (rs != null) {
					if (rs.next()) {
						return true;
					}
				}

				commitTransaction();
			}
		} catch (Exception ex) {
			new ApplicationException(ex.getMessage());
		}
		return false;
	}

}
