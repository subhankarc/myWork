package com.iyouth.common.callmanagement.action;

import java.util.ArrayList;
import java.util.List;

import com.iyouth.common.action.BaseAction;
import com.iyouth.common.callmanagement.service.CallManagementService;
import com.iyouth.common.callmanagement.service.CallManagementServiceImpl;
import com.iyouth.common.callmanagement.vo.CallManagementVO;
import com.iyouth.common.mastermanager.service.MasterManagementService;
import com.iyouth.common.mastermanager.service.MasterManagementServiceImpl;
import com.iyouth.common.util.IYOUTHConstants;
import com.iyouth.common.vo.MasterVO;
import com.opensymphony.xwork2.ModelDriven;

public class CallManagementAction extends BaseAction implements
		ModelDriven<CallManagementVO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1219451068840519756L;

	MasterManagementService masterManagementService = new MasterManagementServiceImpl();
	CallManagementService callManagementService = new CallManagementServiceImpl();

	List<MasterVO> yearList = new ArrayList<MasterVO>();
	List<MasterVO> courseTypeMasterList = new ArrayList<MasterVO>();
	List<MasterVO> streamMasterList = new ArrayList<MasterVO>();
	List<MasterVO> studentSessionMasterList = new ArrayList<MasterVO>();
	List<MasterVO> statusList = new ArrayList<MasterVO>();
	private CallManagementVO callManagementVO = new CallManagementVO();

	public CallManagementAction() {
		courseTypeMasterList = masterManagementService.getCourseTypeDetails();
		streamMasterList = masterManagementService.getStreamDetails();
		studentSessionMasterList = masterManagementService.getSession();
		// yearList.add("2012");
		// statusList.add("enquired");
	}

	public String loadCallManagement() {
		return "loadpage";
	}

	public String searchCallManagement() {
		CallManagementVO callVO = callManagementService
				.searchCallManagementData(callManagementVO);
		callManagementVO.setStudentData(callVO.getStudentData());

		callManagementVO.setCourseTypeId(IYOUTHConstants.DROP_DOWN_INDEX);
		callManagementVO.setStreamId(IYOUTHConstants.DROP_DOWN_INDEX);
		callManagementVO.setSessionId(IYOUTHConstants.DROP_DOWN_INDEX);
		return "loadpage";
	}

	public String fetchCallManagement() {
		CallManagementVO managementVO = callManagementService
				.fetchCallManagementData(callManagementVO);
		setReturnedValues(managementVO);
		return "loadpage";
	}

	private void setReturnedValues(CallManagementVO managementVO) {
		if (managementVO.getCallcount() != null)
			callManagementVO.setCallcount(managementVO.getCallcount());
		if (managementVO.getName() != null)
			callManagementVO.setName(managementVO.getName());
		if (managementVO.getCallNextDate() != null)
			callManagementVO.setCallNextDate(managementVO.getCallNextDate());
		if (managementVO.getCallUpdate() != null)
			callManagementVO.setCallUpdate(managementVO.getCallUpdate());
		if (managementVO.getContactNo() != null)
			callManagementVO.setContactNo(managementVO.getContactNo());
		if (managementVO.getCourse() != null)
			callManagementVO.setCourse(managementVO.getCourse());
		if (managementVO.getEnquiryDate() != null)
			callManagementVO.setEnquiryDate(managementVO.getEnquiryDate());
		if (managementVO.getEnquiryId() != null)
			callManagementVO.setEnquiryId(managementVO.getEnquiryId());
		if (managementVO.getFormNo() != null)
			callManagementVO.setFormNo(managementVO.getFormNo());
		if (managementVO.getLastCallerDate() != null)
			callManagementVO
					.setLastCallerDate(managementVO.getLastCallerDate());
		if (managementVO.getLocation() != null)
			callManagementVO.setLocation(managementVO.getLocation());
		if (managementVO.getQualification() != null)
			callManagementVO.setQualification(managementVO.getQualification());
		if (managementVO.getReceptionistIdEnq() != null)
			callManagementVO.setReceptionistIdEnq(managementVO
					.getReceptionistIdEnq());
		if (managementVO.getReceptionistIdLastCaller() != null)
			callManagementVO.setReceptionistIdLastCaller(managementVO
					.getReceptionistIdLastCaller());
		if (managementVO.getReceptionistIdSelling() != null)
			callManagementVO.setReceptionistIdSelling(managementVO
					.getReceptionistIdSelling());
		if (managementVO.getRelateWith() != null)
			callManagementVO.setRelateWith(managementVO.getRelateWith());
		if (managementVO.getSellingDate() != null)
			callManagementVO.setSellingDate(managementVO.getSellingDate());
		if (managementVO.getSessionName() != null)
			callManagementVO.setSessionName(managementVO.getSessionName());
		if (managementVO.getStatus() != null)
			callManagementVO.setStatus(managementVO.getStatus());
		if (managementVO.getStream() != null)
			callManagementVO.setStream(managementVO.getStream());
		if (managementVO.getYearInDetailsPage() != null) {
			callManagementVO.setYearInDetailsPage(managementVO
					.getYearInDetailsPage());
		}

	}

	@Override
	public CallManagementVO getModel() {
		return callManagementVO;
	}

	/**
	 * @return the yearList
	 */
	public List<MasterVO> getYearList() {
		return yearList;
	}

	/**
	 * @param yearList
	 *            the yearList to set
	 */
	public void setYearList(List<MasterVO> yearList) {
		this.yearList = yearList;
	}

	/**
	 * @return the courseTypeMasterList
	 */
	public List<MasterVO> getCourseTypeMasterList() {
		return courseTypeMasterList;
	}

	/**
	 * @param courseTypeMasterList
	 *            the courseTypeMasterList to set
	 */
	public void setCourseTypeMasterList(List<MasterVO> courseTypeMasterList) {
		this.courseTypeMasterList = courseTypeMasterList;
	}

	/**
	 * @return the streamMasterList
	 */
	public List<MasterVO> getStreamMasterList() {
		return streamMasterList;
	}

	/**
	 * @param streamMasterList
	 *            the streamMasterList to set
	 */
	public void setStreamMasterList(List<MasterVO> streamMasterList) {
		this.streamMasterList = streamMasterList;
	}

	/**
	 * @return the studentSessionMasterList
	 */
	public List<MasterVO> getStudentSessionMasterList() {
		return studentSessionMasterList;
	}

	/**
	 * @param studentSessionMasterList
	 *            the studentSessionMasterList to set
	 */
	public void setStudentSessionMasterList(
			List<MasterVO> studentSessionMasterList) {
		this.studentSessionMasterList = studentSessionMasterList;
	}

	/**
	 * @return the statusList
	 */
	public List<MasterVO> getStatusList() {
		return statusList;
	}

	/**
	 * @param statusList
	 *            the statusList to set
	 */
	public void setStatusList(List<MasterVO> statusList) {
		this.statusList = statusList;
	}
}