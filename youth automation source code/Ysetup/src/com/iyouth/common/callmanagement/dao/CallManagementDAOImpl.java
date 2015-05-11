package com.iyouth.common.callmanagement.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iyouth.common.callmanagement.vo.CallManagementVO;
import com.iyouth.common.callmanagement.vo.EnquiryStudentDetailsVO;
import com.iyouth.common.dao.hibernate.util.ConnectionBaseDao;
import com.iyouth.common.exception.ApplicationException;

public class CallManagementDAOImpl extends ConnectionBaseDao implements
		CallManagementDAO {

	@Override
	public CallManagementVO searchCallManagementData(
			CallManagementVO callManagementVO) {
		CallManagementVO managementVO = new CallManagementVO();
		EnquiryStudentDetailsVO studentDetails = null;
		ArrayList<EnquiryStudentDetailsVO> studentDetailsVOs = new ArrayList<EnquiryStudentDetailsVO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			if (getDataBaseSession() != null) {
				String selectStr = callManagementVO.getSearchString();
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(selectStr);
				int i = 1;
				if (!callManagementVO.getCourseTypeId().equalsIgnoreCase("-1")) {
					pstmt.setString(i, callManagementVO.getCourseTypeId());
					i++;
				}
				if (!callManagementVO.getSessionId().equalsIgnoreCase("-1")) {
					pstmt.setString(i, callManagementVO.getSessionId());
					i++;
				}
				if (!callManagementVO.getStatusId().equalsIgnoreCase("-1")) {
					pstmt.setString(i, callManagementVO.getStatusId());
					i++;
				}
				if (!callManagementVO.getStreamId().equalsIgnoreCase("-1")) {
					pstmt.setString(i, callManagementVO.getStreamId());
					i++;
				}
				if (!callManagementVO.getYear().equalsIgnoreCase("-1")) {
					pstmt.setString(i, callManagementVO.getYear());
					i++;
				}
				rs = pstmt.executeQuery();
				if (rs != null) {

					while (rs.next()) {
						studentDetails = new EnquiryStudentDetailsVO();
						studentDetails.setEnquiryId(rs.getString(2));
						studentDetails.setName(rs.getString(3));
						studentDetails.setRelateWith(rs.getString(4));
						studentDetails.setContactNo(rs.getString(5));
						studentDetails.setCourse(rs.getString(6));
						studentDetails.setStream(rs.getString(7));
						studentDetails.setStudentType(rs.getString(8));
						studentDetails.setSessionName(rs.getString(9));
						studentDetails.setQualification(rs.getString(10));
						studentDetails.setLocation(rs.getString(11));
						studentDetails.setEnquiryDate(rs.getString(12));
						studentDetails.setReceptionistIdEnq(rs.getString(13));
						studentDetails.setFormNo(rs.getString(14));
						studentDetails.setSellingDate(rs.getString(15));
						studentDetails.setReceptionistIdSelling(rs
								.getString(16));
						studentDetails.setStatus(rs.getString(20));
						studentDetails.setCallcount(rs.getString(21));
						studentDetails.setCallUpdate(rs.getString(22));
						studentDetails.setCallNextDate(rs.getString(23));
						studentDetails.setReceptionistIdLastCaller(rs
								.getString(24));
						studentDetails.setLastCallerDate(rs.getString(25));
						studentDetails.setYear(rs.getString(30));
						studentDetailsVOs.add(studentDetails);
					}
				}

				commitTransaction();
			}
		} catch (Exception ex) {
			new ApplicationException(ex.getMessage());
		}
		managementVO.setStudentData(studentDetailsVOs);
		return managementVO;
	}

	@Override
	public CallManagementVO fetchCallManagementData(
			CallManagementVO callManagementVO) {
		CallManagementVO studentDetails = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			if (getDataBaseSession() != null) {
				String selectStr = "select * from form_selling where enquiry_id = ?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(selectStr);
				pstmt.setString(1, callManagementVO.getHiddenEnqId());
				rs = pstmt.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						studentDetails = new CallManagementVO();
						studentDetails.setEnquiryId(rs.getString(2));
						studentDetails.setName(rs.getString(3));
						studentDetails.setRelateWith(rs.getString(4));
						studentDetails.setContactNo(rs.getString(5));
						studentDetails.setCourse(rs.getString(6));
						studentDetails.setStream(rs.getString(7));
						studentDetails.setStudentType(rs.getString(8));
						studentDetails.setSessionName(rs.getString(9));
						studentDetails.setQualification(rs.getString(10));
						studentDetails.setLocation(rs.getString(11));
						studentDetails.setEnquiryDate(rs.getString(12));
						studentDetails.setReceptionistIdEnq(rs.getString(13));
						studentDetails.setFormNo(rs.getString(14));
						studentDetails.setSellingDate(rs.getString(15));
						studentDetails.setReceptionistIdSelling(rs
								.getString(16));
						studentDetails.setStatus(rs.getString(20));
						studentDetails.setCallcount(rs.getString(21));
						studentDetails.setCallUpdate(rs.getString(22));
						studentDetails.setCallNextDate(rs.getString(23));
						studentDetails.setReceptionistIdLastCaller(rs
								.getString(24));
						studentDetails.setLastCallerDate(rs.getString(25));
						studentDetails.setYearInDetailsPage(rs.getString(30));
					}
				}

				commitTransaction();
			}
		} catch (Exception ex) {
			new ApplicationException(ex.getMessage());
		}
		return studentDetails;

	}

}
