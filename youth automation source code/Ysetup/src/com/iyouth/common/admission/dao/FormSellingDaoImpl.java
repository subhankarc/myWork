/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iyouth.common.admission.vo.FormSellingVO;
import com.iyouth.common.dao.hibernate.util.ConnectionBaseDao;
import com.iyouth.common.exception.ApplicationException;

/**
 * 
 * @author sumanta
 */
public class FormSellingDaoImpl extends ConnectionBaseDao implements
		FormSellingDao {

	@Override
	public boolean generateTokenNo(FormSellingVO formSellingVO) {
		boolean rowBoolean = false;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "insert into `form_selling` ( `enquiry_id`, `candidate_name`,"
						+ " `relate_with`, `contact_no`, `course_type_id`, `stream_id`, `student_type`, "
						+ "`session_id`, `qualification`, `location`, `enquiry_date`,"
						+ " `receptionist_id_enquiry`, `form_no`, `selling_date`, `receptionist_id_selling`, "
						+ "`registration_id`, `admission_date`, `reception_id_admission`, `status`, "
						+ "`call_count`, `call_update`, `call_nextdate`, `receptionist_id_lastcaller`,"
						+ "`last_call_date`,`added_by`,`added_date`) values(?,?,?,?,?,?,?,?,?,?,current_date(),?,?,?,?,?,?,?,?,?,?,?,?,?,null,now())";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(insertStr);
				pstmt.setString(1, formSellingVO.getEnquiryId());
				pstmt.setString(2, formSellingVO.getCandidateName());
				pstmt.setString(3, formSellingVO.getRelateWith());
				pstmt.setLong(4, formSellingVO.getContactNoDB());
				pstmt.setString(5, formSellingVO.getCourseTypeId());
				pstmt.setString(6, formSellingVO.getStreamId());
				pstmt.setString(7, formSellingVO.getStudentType());
				pstmt.setString(8, formSellingVO.getSessionId());
				pstmt.setString(9, formSellingVO.getQualification());
				pstmt.setString(10, formSellingVO.getLocation());
				// pstmt.setString(11, formSellingVO.getEnquiryDate());
				pstmt.setString(11, formSellingVO.getReceptionistIdEnquiry());
				pstmt.setString(12, formSellingVO.getFormNo());
				pstmt.setString(13, formSellingVO.getSellingDate());
				pstmt.setString(14, formSellingVO.getReceptionistIdSelling());
				pstmt.setString(15, formSellingVO.getRegistrationId());
				pstmt.setString(16, formSellingVO.getAdmissionDate());
				pstmt.setString(17, formSellingVO.getReceptionIdAdmission());
				pstmt.setString(18, formSellingVO.getStatus());
				pstmt.setInt(19, formSellingVO.getCallCount());
				pstmt.setString(20, formSellingVO.getCallUpdate());
				pstmt.setString(21, formSellingVO.getCallNextdate());
				pstmt.setString(22, formSellingVO.getReceptionistIdLastcaller());
				pstmt.setString(23, formSellingVO.getLastCallDate());

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
	public boolean enquiryIdExists(FormSellingVO formSellingVO) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			if (getDataBaseSession() != null) {
				String count = "SELECT COUNT(*) FROM `form_selling` WHERE `enquiry_id` = ?";
				// beginTransaction();
				pstmt = getDbConnection().prepareStatement(count);
				pstmt.setString(1, formSellingVO.getEnquiryIdContactNo());
				rs = pstmt.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						if (rs.getInt(1) == 0) {
							return false;
						}
						return true;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			new ApplicationException(ex.getMessage());
		}
		return true;
	}

	@Override
	public boolean sellFormWithUpdate(FormSellingVO formSellingVO) {

		boolean rowBoolean = false;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			if (getDataBaseSession() != null) {
				String updateStr = "UPDATE `form_selling` SET `candidate_name`=?,`relate_with`=?,`contact_no`=?,"
						+ "`course_type_id`=?,`stream_id`=?,`student_type`=?,`session_id`=?,`qualification`=?,`location`=?,`receptionist_id_enquiry`=?,"
						+ "`form_no`=?,`selling_date`=current_date(),`receptionist_id_selling`=? WHERE `enquiry_id`=? ";
				beginTransaction();

				System.out.println(formSellingVO.getCandidateName());
				pstmt = getDbConnection().prepareStatement(updateStr);
				pstmt.setString(1, formSellingVO.getCandidateName());
				pstmt.setString(2, formSellingVO.getRelateWith());
				pstmt.setLong(3, formSellingVO.getContactNoDB());
				pstmt.setString(4, formSellingVO.getCourseTypeId());
				pstmt.setString(5, formSellingVO.getStreamId());
				pstmt.setString(6, formSellingVO.getStudentType());
				pstmt.setString(7, formSellingVO.getSessionId());
				pstmt.setString(8, formSellingVO.getQualification());
				pstmt.setString(9, formSellingVO.getLocation());
				pstmt.setString(10, formSellingVO.getReceptionistIdEnquiry());
				pstmt.setString(11, formSellingVO.getFormNo());
				pstmt.setString(12, formSellingVO.getReceptionistIdSelling());
				pstmt.setString(13, formSellingVO.getEnquiryIdContactNo());
				rowCount = pstmt.executeUpdate();
				System.out.println("status:::---" + rowCount);

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
	public int getMaxSerialNo(FormSellingVO formSellingVO) {
		PreparedStatement pstmt = null;
		int maxSerialNo = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "SELECT MAX(`serial_no`) FROM `form_selling`";
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

	/*
	 * @Override public boolean searchWithEnqiryId(FormSellingVO formSellingVO)
	 * {
	 * 
	 * }
	 */
	
}
