package com.iyouth.common.fees.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iyouth.common.dao.hibernate.util.ConnectionBaseDao;
import com.iyouth.common.exception.ApplicationException;
import com.iyouth.common.fees.vo.FeesCollectionVO;
import com.iyouth.common.fees.vo.PaidDetailsVO;
import com.iyouth.common.fees.vo.TransactionDetailsVO;

public class FeesCollectionDaoImpl extends ConnectionBaseDao implements
		FeesCollectionDao {

	private String course;
	private String stream;
	private String studentType;
	private String scsId;
	private String sessionId;
	private String registrationYear;
	private String studentId;

	@Override
	public ArrayList<FeesCollectionVO> getStudentInfo(
			FeesCollectionVO feesCollectionVO) {
		ArrayList<FeesCollectionVO> tempList = new ArrayList<FeesCollectionVO>();
		PreparedStatement pstmt = null;
		boolean rowBoolean = false;
		int rowCount = 0;
		try {
			if (getDataBaseSession() != null) {

				String flag = feesCollectionVO.getSearchBy();
				String value = feesCollectionVO.getSearchValue();
				value = "%" + value + "%";
				String searchStr = "SELECT * FROM `registration`, `student` WHERE `student`.`student_current_regid` = `registration`.`registration_id`";

				if (flag.equalsIgnoreCase("Registration Id")) {
					searchStr = "SELECT * FROM `registration`, `student` WHERE `student`.`student_current_regid` = `registration`.`registration_id` AND `registration`.`registration_id` like ?";
				}

				if (flag.equalsIgnoreCase("Student Id")) {
					searchStr = "SELECT * FROM `registration`, `student` WHERE `student`.`student_current_regid` = `registration`.`registration_id` AND `registration`.`student_id` like ?";
				}

				if (flag.equalsIgnoreCase("Name")) {
					searchStr = "SELECT * FROM `registration`, `student` WHERE `student`.`student_current_regid` = `registration`.`registration_id` AND `student`.`student_name` like ?";
				}

				beginTransaction();
				pstmt = getDbConnection().prepareStatement(searchStr);
				pstmt.setString(1, value);
				ResultSet resultSet = pstmt.executeQuery();

				while (resultSet.next()) {
					FeesCollectionVO tempVO = new FeesCollectionVO();
					tempVO.setRegId(resultSet.getString(2));
					tempVO.setStudentId(resultSet.getString(3));
					tempVO.setRegistrationDate(resultSet.getString(5));
					tempVO.setCourseType(resultSet.getString(7));
					tempVO.setStream(resultSet.getString(8));
					tempVO.setStudentType(resultSet.getString(9));
					tempVO.setSession(resultSet.getString(10));
					tempVO.setName(resultSet.getString(21));
					tempVO.setAddress(resultSet.getString(24));
					tempVO.setContactNoDb(resultSet.getInt(26));
					tempList.add(tempVO);
					rowCount++;
				}
				Integer size = rowCount;
				feesCollectionVO.setRowCount(size.toString()
						+ " Nos Data Found");

				System.out.println("status:::---" + rowCount);

				if (rowCount > 0) {
					rowBoolean = true;
					commitTransaction();
				}

			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			System.out.println(ex);
		}

		if (rowBoolean)
			return tempList;
		else
			return null;
	}

	@Override
	public ArrayList<TransactionDetailsVO> getFeesDetails(String regId) {

		ArrayList<TransactionDetailsVO> tempList = new ArrayList<TransactionDetailsVO>();
		PreparedStatement pstmt = null;
		boolean rowBoolean = false;
		int rowCount = 0;
		try {
			if (getDataBaseSession() != null) {
				String searchStr = "SELECT * FROM `registration` WHERE `registration_id` = ?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(searchStr);
				pstmt.setString(1, regId);
				ResultSet resultSet = pstmt.executeQuery();

				while (resultSet.next()) {
					course = resultSet.getString(7);
					stream = resultSet.getString(8);
					studentType = resultSet.getString(9);
					sessionId = resultSet.getString(10);
					registrationYear = resultSet.getString(6);
					studentId = resultSet.getString(3);
				}
				commitTransaction();
			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			System.out.println(ex);
		}

		try {
			if (getDataBaseSession() != null) {
				String searchStr = "SELECT scs_id FROM `scs_master` WHERE `strm_id` = ? and course_id = ? and std_type_id = ?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(searchStr);
				pstmt.setString(1, stream);
				pstmt.setString(2, course);
				pstmt.setString(3, studentType);
				ResultSet resultSet = pstmt.executeQuery();

				while (resultSet.next()) {
					scsId = resultSet.getString(1);
				}
			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			System.out.println(ex);
		}

		try {
			if (getDataBaseSession() != null) {
				String searchStr = "SELECT * FROM `scsp_master` WHERE `scs_id` = ?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(searchStr);
				pstmt.setString(1, scsId);
				ResultSet resultSet = pstmt.executeQuery();

				while (resultSet.next()) {
					TransactionDetailsVO tempVO = new TransactionDetailsVO();
					tempVO.setScspId(resultSet.getString(1));
					tempVO.setScsId(resultSet.getString(2));
					tempVO.setPaymentType(resultSet.getString(3));
					tempVO.setAmount(resultSet.getString(4));
					tempVO.setPaymentSeqNo(resultSet.getString(5));
					tempVO.setValidFrom(resultSet.getString(6));
					tempVO.setValidTo(resultSet.getString(7));
					tempVO.setRegistrationYear(registrationYear);
					tempVO.setStudentId(studentId);
					tempList.add(tempVO);
					rowCount++;
				}
				System.out.println("status:::---" + rowCount);
				if (rowCount > 0) {
					rowBoolean = true;
					commitTransaction();
				}

			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			System.out.println(ex);
		}

		for (TransactionDetailsVO tempVO : tempList) {
			setTransactionDetails(tempVO, tempVO.getScspId(), regId);
			setPayableDate(tempVO, tempVO.getScspId(), sessionId);
			setFine(tempVO, regId, tempVO.getScspId());
		}
		if (rowBoolean) {
			return tempList;
		} else {
			return null;
		}
	}

	private void setPayableDate(TransactionDetailsVO tempVO, String scspId,
			String sessionId) {

		PreparedStatement pstmt = null;
		try {
			if (getDataBaseSession() != null) {
				String searchStr = "SELECT * FROM `sscsp_master` WHERE `scsp_id` = ? and session_id = ?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(searchStr);
				pstmt.setString(1, scspId);
				pstmt.setString(2, sessionId);
				ResultSet resultSet = pstmt.executeQuery();

				while (resultSet.next()) {
					tempVO.setPayableDate(resultSet.getString(4));
				}
				commitTransaction();
			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			System.out.println(ex);
		}

	}

	private void setTransactionDetails(TransactionDetailsVO tempVO,
			String scspId, String regId) {
		PreparedStatement pstmt = null;
		try {
			if (getDataBaseSession() != null) {
				String searchStr = "SELECT * FROM `fees_transaction_details` WHERE `scsp_id` = ? and reg_id = ?";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(searchStr);
				pstmt.setString(1, scspId);
				pstmt.setString(2, regId);
				ResultSet resultSet = pstmt.executeQuery();

				while (resultSet.next()) {
					tempVO.setTransactionId(resultSet.getString(1));
					tempVO.setReceivedBy(resultSet.getString(8));
					tempVO.setTransactionDate(resultSet.getString(6));
					tempVO.setBillNo(resultSet.getString(7));
				}
				commitTransaction();
			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			System.out.println(ex);
		}

	}

	private void setFine(TransactionDetailsVO tempVO, String regId,
			String scspId) {
		PreparedStatement pstmt = null;
		try {
			if (getDataBaseSession() != null) {
				String searchStr = "Select amount from fees_transaction_details where scsp_id = ? and reg_id = ? and payment_seq_no = (Select payment_seq_no from scsp_master where scsp_id = ?)";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(searchStr);
				pstmt.setString(1, "0");
				pstmt.setString(2, regId);
				pstmt.setString(3, scspId);
				ResultSet resultSet = pstmt.executeQuery();

				while (resultSet.next()) {
					tempVO.setFine(resultSet.getString(1));
				}
				commitTransaction();
			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			System.out.println(ex);
		}

	}

	@Override
	public int getMaxTransactionId() {
		PreparedStatement pstmt = null;
		int maxSerialNo = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "SELECT MAX(`serial_no`) FROM `fees_transaction_details`";
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
	public void enterTransaction(PaidDetailsVO paidDetailsVO) {
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			if (getDataBaseSession() != null) {
				String insertStr = "INSERT INTO `fees_transaction_details`"
						+ " (`trans_id`, `reg_id`, `std_id`, `scsp_id`, `amount`, "
						+ "`date`, `bill_no`, `recieved_by`, `payment_seq_no`) VALUES(?,?,?,?,?,?,?,?,?)";
				beginTransaction();
				pstmt = getDbConnection().prepareStatement(insertStr);
				pstmt.setString(1, paidDetailsVO.getTransactionId());
				pstmt.setString(2, paidDetailsVO.getRegistrationId());
				pstmt.setString(3, paidDetailsVO.getStudentId());
				pstmt.setString(4, paidDetailsVO.getScspId());
				pstmt.setString(5, paidDetailsVO.getAmount());
				pstmt.setString(6, paidDetailsVO.getDate());
				pstmt.setString(7, paidDetailsVO.getBillNo());
				pstmt.setString(8, paidDetailsVO.getReceivedBy());
				pstmt.setString(9, paidDetailsVO.getPaymentSeqNo());
				rowCount = pstmt.executeUpdate();
				if (rowCount > 0) {
					commitTransaction();
				}
			}
		} catch (Exception ex) {
			rollBackTransaction();
			ex.printStackTrace();
			new ApplicationException(ex.getMessage());
		}
	}

}
