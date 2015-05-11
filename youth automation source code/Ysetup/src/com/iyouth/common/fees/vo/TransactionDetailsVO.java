package com.iyouth.common.fees.vo;

import java.util.Date;


public class TransactionDetailsVO {
	private Integer rowNumber;
	private String transactionId;
	private String RegistrationId;
	private String studentId;
	private String scspId;
	private String amount;
	private String transactionDate;
	private String billNo;
	private String receivedBy;
	private String streamId;
	private String courseId;
	private String studenttype;
	private String scsId;
	private String validFrom;
	private String validTo;
	private String paymentType;
	private String paymentSeqNo;
	private String payableDate;
	private String fine;
	private String registrationYear;
	private Date payableDateInDateFormat;
	private Integer fineInInteger;

	/**
	 * @return the streamId
	 */
	public String getStreamId() {
		return streamId;
	}
	/**
	 * @param streamId the streamId to set
	 */
	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}
	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the studenttype
	 */
	public String getStudenttype() {
		return studenttype;
	}
	/**
	 * @param studenttype the studenttype to set
	 */
	public void setStudenttype(String studenttype) {
		this.studenttype = studenttype;
	}
	/**
	 * @return the scsId
	 */
	public String getScsId() {
		return scsId;
	}
	/**
	 * @param scsId the scsId to set
	 */
	public void setScsId(String scsId) {
		this.scsId = scsId;
	}
	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the registrationId
	 */
	public String getRegistrationId() {
		return RegistrationId;
	}
	/**
	 * @param registrationId the registrationId to set
	 */
	public void setRegistrationId(String registrationId) {
		RegistrationId = registrationId;
	}
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
	 * @return the scspId
	 */
	public String getScspId() {
		return scspId;
	}
	/**
	 * @param scspId the scspId to set
	 */
	public void setScspId(String scspId) {
		this.scspId = scspId;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the date
	 */
	public String getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param date the date to set
	 */
	public void setTransactionDate(String date) {
		this.transactionDate = date;
	}
	/**
	 * @return the billNo
	 */
	public String getBillNo() {
		return billNo;
	}
	/**
	 * @param billNo the billNo to set
	 */
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	/**
	 * @return the receivedBy
	 */
	public String getReceivedBy() {
		return receivedBy;
	}
	/**
	 * @param receivedBy the receivedBy to set
	 */
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}
	public String getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getValidTo() {
		return validTo;
	}
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentSeqNo() {
		return paymentSeqNo;
	}
	public void setPaymentSeqNo(String paymentSeqNo) {
		this.paymentSeqNo = paymentSeqNo;
	}
	public String getPayableDate() {
		return payableDate;
	}
	public void setPayableDate(String payableDate) {
		this.payableDate = payableDate;
	}
	public String getFine() {
		return fine;
	}
	public void setFine(String fine) {
		this.fine = fine;
	}
	public Integer getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}
	public String getRegistrationYear() {
		return registrationYear;
	}
	public void setRegistrationYear(String registrationYear) {
		this.registrationYear = registrationYear;
	}
	public Date getPayableDateInDateFormat() {
		return payableDateInDateFormat;
	}
	public void setPayableDateInDateFormat(Date payableDateInDateFormat) {
		this.payableDateInDateFormat = payableDateInDateFormat;
	}
	public Integer getFineInInteger() {
		return fineInInteger;
	}
	public void setFineInInteger(Integer fineInInteger) {
		this.fineInInteger = fineInInteger;
	}

}
