package com.iyouth.common.callmanagement.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class CallManagementVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8143675975780307181L;

	private String year;
	private String sessionId;
	private String statusId;
	private String courseTypeId;
	private String streamId;
	private ArrayList<EnquiryStudentDetailsVO> studentData;
	private String searchString;
	
	private String hiddenEnqId;
	
	private String enquiryId;
	private String name;
	private String relateWith;
	private String contactNo;
	private String course;
	private String stream;
	private String sessionName;
	private String studentType;
	private String qualification;
	private String location;
	private String enquiryDate;
	private String receptionistIdEnq;
	private String formNo;
	private String sellingDate;
	private String receptionistIdSelling;
	private String status;
	private String callcount;
	private String callUpdate;
	private String callNextDate;
	private String receptionistIdLastCaller;
	private String lastCallerDate;
	private String yearInDetailsPage;

	
	/**
	 * @return the enquiryId
	 */
	public String getEnquiryId() {
		return enquiryId;
	}
	/**
	 * @param enquiryId the enquiryId to set
	 */
	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
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
	 * @return the relateWith
	 */
	public String getRelateWith() {
		return relateWith;
	}
	/**
	 * @param relateWith the relateWith to set
	 */
	public void setRelateWith(String relateWith) {
		this.relateWith = relateWith;
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
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
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
	/**
	 * @return the sessionName
	 */
	public String getSessionName() {
		return sessionName;
	}
	/**
	 * @param sessionName the sessionName to set
	 */
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
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
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the enquiryDate
	 */
	public String getEnquiryDate() {
		return enquiryDate;
	}
	/**
	 * @param enquiryDate the enquiryDate to set
	 */
	public void setEnquiryDate(String enquiryDate) {
		this.enquiryDate = enquiryDate;
	}
	/**
	 * @return the receptionistIdEnq
	 */
	public String getReceptionistIdEnq() {
		return receptionistIdEnq;
	}
	/**
	 * @param receptionistIdEnq the receptionistIdEnq to set
	 */
	public void setReceptionistIdEnq(String receptionistIdEnq) {
		this.receptionistIdEnq = receptionistIdEnq;
	}
	/**
	 * @return the formNo
	 */
	public String getFormNo() {
		return formNo;
	}
	/**
	 * @param formNo the formNo to set
	 */
	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}
	/**
	 * @return the sellingDate
	 */
	public String getSellingDate() {
		return sellingDate;
	}
	/**
	 * @param sellingDate the sellingDate to set
	 */
	public void setSellingDate(String sellingDate) {
		this.sellingDate = sellingDate;
	}
	/**
	 * @return the receptionistIdSelling
	 */
	public String getReceptionistIdSelling() {
		return receptionistIdSelling;
	}
	/**
	 * @param receptionistIdSelling the receptionistIdSelling to set
	 */
	public void setReceptionistIdSelling(String receptionistIdSelling) {
		this.receptionistIdSelling = receptionistIdSelling;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the callcount
	 */
	public String getCallcount() {
		return callcount;
	}
	/**
	 * @param callcount the callcount to set
	 */
	public void setCallcount(String callcount) {
		this.callcount = callcount;
	}
	/**
	 * @return the callUpdate
	 */
	public String getCallUpdate() {
		return callUpdate;
	}
	/**
	 * @param callUpdate the callUpdate to set
	 */
	public void setCallUpdate(String callUpdate) {
		this.callUpdate = callUpdate;
	}
	/**
	 * @return the callNextDate
	 */
	public String getCallNextDate() {
		return callNextDate;
	}
	/**
	 * @param callNextDate the callNextDate to set
	 */
	public void setCallNextDate(String callNextDate) {
		this.callNextDate = callNextDate;
	}
	/**
	 * @return the receptionistIdLastCaller
	 */
	public String getReceptionistIdLastCaller() {
		return receptionistIdLastCaller;
	}
	/**
	 * @param receptionistIdLastCaller the receptionistIdLastCaller to set
	 */
	public void setReceptionistIdLastCaller(String receptionistIdLastCaller) {
		this.receptionistIdLastCaller = receptionistIdLastCaller;
	}
	/**
	 * @return the lastCallerDate
	 */
	public String getLastCallerDate() {
		return lastCallerDate;
	}
	/**
	 * @param lastCallerDate the lastCallerDate to set
	 */
	public void setLastCallerDate(String lastCallerDate) {
		this.lastCallerDate = lastCallerDate;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}
	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * @return the statusId
	 */
	public String getStatusId() {
		return statusId;
	}
	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	/**
	 * @return the courseTypeId
	 */
	public String getCourseTypeId() {
		return courseTypeId;
	}
	/**
	 * @param courseTypeId the courseTypeId to set
	 */
	public void setCourseTypeId(String courseTypeId) {
		this.courseTypeId = courseTypeId;
	}
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
	public ArrayList<EnquiryStudentDetailsVO> getStudentData() {
		return studentData;
	}
	public void setStudentData(ArrayList<EnquiryStudentDetailsVO> studentData) {
		this.studentData = studentData;
	}
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public String getHiddenEnqId() {
		return hiddenEnqId;
	}
	public void setHiddenEnqId(String hiddenEnqId) {
		this.hiddenEnqId = hiddenEnqId;
	}
	public String getYearInDetailsPage() {
		return yearInDetailsPage;
	}
	public void setYearInDetailsPage(String yearInDetailsPage) {
		this.yearInDetailsPage = yearInDetailsPage;
	}
	

}
