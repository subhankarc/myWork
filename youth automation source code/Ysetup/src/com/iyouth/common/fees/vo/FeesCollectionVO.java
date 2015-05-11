package com.iyouth.common.fees.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class FeesCollectionVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String searchValue;
	private String searchBy;
	private ArrayList<String> searchByList;
	
	private String studentId;
	private String regId;
	private String name;
	private String address;
	private String contactNo;
	private Integer contactNoDb;
	private String registrationDate;
	private String courseType;
	private String studentType;
	private String session;
	private String stream;
	private String rowCount;
	private ArrayList<FeesCollectionVO> studentData;
	private Integer rowNumber;
	private ArrayList<TransactionDetailsVO> transactionDetails;
	private String hiddenregid;
	private ArrayList<TransactionDetailsVO> feesDetails;
	private ArrayList<TransactionDetailsVO> dueDetails;
	private String selectedRow;
	private String hiddenregistrationid;
	private ArrayList<PaidDetailsVO> paidDetails;
	private String reg;
	private String stdId;
	private String receivedBy;
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the regId
	 */
	public String getRegId() {
		return regId;
	}
	/**
	 * @param regId the regId to set
	 */
	public void setRegId(String regId) {
		this.regId = regId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	/**
	 * @return the contactNoDb
	 */
	public Integer getContactNoDb() {
		return contactNoDb;
	}
	/**
	 * @param contactNoDb the contactNoDb to set
	 */
	public void setContactNoDb(Integer contactNoDb) {
		this.contactNoDb = contactNoDb;
	}
	/**
	 * @return the registrationDate
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * @return the courseType
	 */
	public String getCourseType() {
		return courseType;
	}
	/**
	 * @param courseType the courseType to set
	 */
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	/**
	 * @return the studentType
	 */
	public String getStudentType() {
		return studentType;
	}
	/**
	 * @param studentType the studentType to set
	 */
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	/**
	 * @return the session
	 */
	public String getSession() {
		return session;
	}
	/**
	 * @param session the session to set
	 */
	public void setSession(String session) {
		this.session = session;
	}
	/**
	 * @return the stream
	 */
	public String getStream() {
		return stream;
	}
	/**
	 * @param stream the stream to set
	 */
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	public String getSearchBy() {
		return searchBy;
	}
	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}
	public ArrayList<String> getSearchByList() {
		return searchByList;
	}
	public void setSearchByList(ArrayList<String> searchByList) {
		this.searchByList = searchByList;
	}
	public String getRowCount() {
		return rowCount;
	}
	public void setRowCount(String rowCount) {
		this.rowCount = rowCount;
	}
	public ArrayList<FeesCollectionVO> getStudentData() {
		return studentData;
	}
	public void setStudentData(ArrayList<FeesCollectionVO> studentData) {
		this.studentData = studentData;
	}
	public Integer getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}
	public ArrayList<TransactionDetailsVO> getTransactionDetails() {
		return transactionDetails;
	}
	public void setTransactionDetails(ArrayList<TransactionDetailsVO> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
	public String getHiddenregid() {
		return hiddenregid;
	}
	public void setHiddenregid(String hiddenregid) {
		this.hiddenregid = hiddenregid;
	}
	public ArrayList<TransactionDetailsVO> getFeesDetails() {
		return feesDetails;
	}
	public void setFeesDetails(ArrayList<TransactionDetailsVO> feesDetails) {
		this.feesDetails = feesDetails;
	}
	public ArrayList<TransactionDetailsVO> getDueDetails() {
		return dueDetails;
	}
	public void setDueDetails(ArrayList<TransactionDetailsVO> dueDetails) {
		this.dueDetails = dueDetails;
	}
	public String getSelectedRow() {
		return selectedRow;
	}
	public void setSelectedRow(String selectedRow) {
		this.selectedRow = selectedRow;
	}
	public String getHiddenregistrationid() {
		return hiddenregistrationid;
	}
	public void setHiddenregistrationid(String hiddenregistrationid) {
		this.hiddenregistrationid = hiddenregistrationid;
	}
	public ArrayList<PaidDetailsVO> getPaidDetails() {
		return paidDetails;
	}
	public void setPaidDetails(ArrayList<PaidDetailsVO> paidDetails) {
		this.paidDetails = paidDetails;
	}
	public String getReceivedBy() {
		return receivedBy;
	}
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
}
