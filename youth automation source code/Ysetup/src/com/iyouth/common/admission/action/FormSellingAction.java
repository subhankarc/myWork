/**
 * 
 */
package com.iyouth.common.admission.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.iyouth.common.action.BaseAction;
import com.iyouth.common.admission.service.FormSellingService;
import com.iyouth.common.admission.service.FormSellingServiceImpl;
import com.iyouth.common.admission.vo.FormSellingVO;
import com.iyouth.common.login.vo.User;
import com.iyouth.common.mastermanager.service.MasterManagementService;
import com.iyouth.common.mastermanager.service.MasterManagementServiceImpl;
import com.iyouth.common.util.IYOUTHConstants;
import com.iyouth.common.vo.MasterVO;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author Subhankar
 * 
 */
public class FormSellingAction extends BaseAction implements
		ModelDriven<FormSellingVO> {

	
	private FormSellingVO formSellingVO = new FormSellingVO();

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(FormSellingAction.class);
	FormSellingService formSellingService = new FormSellingServiceImpl();
	MasterManagementService masterManagementService = new MasterManagementServiceImpl();

	List<MasterVO> relationMasterList = new ArrayList<MasterVO>();
	List<MasterVO> locationMasterList = new ArrayList<MasterVO>();
	List<MasterVO> qualificationMasterList = new ArrayList<MasterVO>();
	List<MasterVO> courseTypeMasterList = new ArrayList<MasterVO>();
	List<MasterVO> streamMasterList = new ArrayList<MasterVO>();
	List<MasterVO> studentTypMasterList = new ArrayList<MasterVO>();
	List<MasterVO> studentSessionMasterList = new ArrayList<MasterVO>();

	public String loadFormSelling() {
		System.out.println("Enter into loadFormSelling");
		logger.info("Enter into loadFormSelling");
		relationMasterList = masterManagementService.getRelationWithDetails();
		locationMasterList = masterManagementService.getLocation();
		qualificationMasterList = masterManagementService
				.getQualificationDetails();
		courseTypeMasterList = masterManagementService.getCourseTypeDetails();
		streamMasterList = masterManagementService.getStreamDetails();
		studentTypMasterList = masterManagementService.getStudentType();
		studentSessionMasterList = masterManagementService.getSession();
		System.out.println("relationMasterList:--"
				+ relationMasterList.get(0).getValue());
		
		return "loadpage";
	}

	public String saveFormSelling() {
		System.out.println("Entered in generate token no");
		User userDtls = (User) sessionMap.get(IYOUTHConstants.USEROBJ);
		System.out.println("formSellingVO" + formSellingVO.getCandidateName());
		System.out.println("formSellingVO" + formSellingVO.getFormNo());
		System.out.println("formSellingVO"		+ formSellingVO.getEnquiryIdContactNo());
		formSellingVO.setReceptionistIdEnquiry(userDtls.getId().toString());
		boolean status = formSellingService
				.enquiryIdGenerationService(formSellingVO);
		if (status) {
			logger.info("saveFormSelling  Faliure-------------------------------------------------");
			addActionMessage("SMSG001");
		} else {
			logger.info("saveFormSelling  Faliure-------------------------------------------------");
			addActionError("YERR002");
		}
		return "successsave";
	}

	public String sellFormAction() {
		System.out.println("Entered in FormSelling");
		User userDtls = (User) sessionMap.get(IYOUTHConstants.USEROBJ);
		System.out.println("formSellingVO" + formSellingVO.getCandidateName());
		System.out.println("formSellingVO" + formSellingVO.getFormNo());
		System.out.println("formSellingVO"
				+ formSellingVO.getEnquiryIdContactNo());
		formSellingVO.setReceptionistIdEnquiry(userDtls.getId().toString());
		formSellingVO.setReceptionistIdSelling(userDtls.getId().toString());
		formSellingService.sellFormService(formSellingVO);
		return "successformsale";
	}

	public String searchSellFormAction() {
		System.out.println("Entered in searchSellFormAction");
		System.out.println("::::searchSellFormAction::::>>>>keyword"+formSellingVO.getKeyword());
		return "successformsale";
	}
	
	
	@Override
	public FormSellingVO getModel() {
		// TODO Auto-generated method stub
		return formSellingVO;
	}

	public List<MasterVO> getRelationMasterList() {
		return relationMasterList;
	}

	public void setRelationMasterList(List<MasterVO> relationMasterList) {
		this.relationMasterList = relationMasterList;
	}

	public List<MasterVO> getLocationMasterList() {
		return locationMasterList;
	}

	public void setLocationMasterList(List<MasterVO> locationMasterList) {
		this.locationMasterList = locationMasterList;
	}

	public List<MasterVO> getQualificationMasterList() {
		return qualificationMasterList;
	}

	public void setQualificationMasterList(
			List<MasterVO> qualificationMasterList) {
		this.qualificationMasterList = qualificationMasterList;
	}

	public List<MasterVO> getCourseTypeMasterList() {
		return courseTypeMasterList;
	}

	public void setCourseTypeMasterList(List<MasterVO> courseTypeMasterList) {
		this.courseTypeMasterList = courseTypeMasterList;
	}

	public List<MasterVO> getStreamMasterList() {
		return streamMasterList;
	}

	public void setStreamMasterList(List<MasterVO> streamMasterList) {
		this.streamMasterList = streamMasterList;
	}

	public List<MasterVO> getStudentTypMasterList() {
		return studentTypMasterList;
	}

	public void setStudentTypMasterList(List<MasterVO> studentTypMasterList) {
		this.studentTypMasterList = studentTypMasterList;
	}

	public List<MasterVO> getStudentSessionMasterList() {
		return studentSessionMasterList;
	}

	public void setStudentSessionMasterList(
			List<MasterVO> studentSessionMasterList) {
		this.studentSessionMasterList = studentSessionMasterList;
	}

}
