/**
 * 
 */
package com.iyouth.common.admission.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.iyouth.common.action.BaseAction;
import com.iyouth.common.admission.service.DetailAdmissionService;
import com.iyouth.common.admission.service.DetailAdmissionServiceImpl;
import com.iyouth.common.admission.vo.DetailAdmissionVO;
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
public class DetailAdmissionAction extends BaseAction implements ModelDriven<DetailAdmissionVO>{
	
	private DetailAdmissionVO detailAdmissionVO=new DetailAdmissionVO();

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(DetailAdmissionAction.class);
	DetailAdmissionService detailAdmissionService = new DetailAdmissionServiceImpl();
	MasterManagementService masterManagementService=new MasterManagementServiceImpl();
	
	List<MasterVO> courseTypeMasterList=new ArrayList<MasterVO>();
	List<MasterVO> streamMasterList=new ArrayList<MasterVO>();
	List<MasterVO> studentTypMasterList=new ArrayList<MasterVO>();
	List<MasterVO> studentSessionMasterList=new ArrayList<MasterVO>();
	
	public String loadDetailAdmissionPage() {
        System.out.println("Enter into loadDetailAdmission");
        logger.info("Enter into loadDetailAdmission");
        courseTypeMasterList=masterManagementService.getCourseTypeDetails();
	    streamMasterList=masterManagementService.getStreamDetails();
	    studentTypMasterList=masterManagementService.getStudentType();
        studentSessionMasterList=masterManagementService.getSession();
		return "loadpage";
	}
	
	public String loadDetailAdmissionData(){
		//return null;
		
		System.out.println("Load data from form_seelling");
		DetailAdmissionVO admissionVO = detailAdmissionService.loadData(detailAdmissionVO);
		detailAdmissionVO.setFormNo(admissionVO.getFormNo());
		detailAdmissionVO.setCandidateName(admissionVO.getCandidateName());
		detailAdmissionVO.setPrimaryContactNo(admissionVO.getPrimaryContactNo());
		detailAdmissionVO.setCourseType(admissionVO.getCourseType());
		detailAdmissionVO.setStream(admissionVO.getStream());
		detailAdmissionVO.setStudentType(admissionVO.getStudentType());
		detailAdmissionVO.setSession(admissionVO.getSession());
		detailAdmissionVO.setStudentId(admissionVO.getStudentId());
		
		courseTypeMasterList=masterManagementService.getCourseTypeDetails();
	    streamMasterList=masterManagementService.getStreamDetails();
	    studentTypMasterList=masterManagementService.getStudentType();
        studentSessionMasterList=masterManagementService.getSession();
		return "loadpage";		
	
		}

	public String doDetailAdmission() {
        System.out.println("Entered in do detail Admission");
        User userDtls = (User) sessionMap.get(IYOUTHConstants.USEROBJ);
       // System.out.println("formSellingVO"+detailAdmissionVO.getCandidateName());
       // System.out.println("formSellingVO"+detailAdmissionVO.getFormNo());
        detailAdmissionVO.setAddedBy(userDtls.getId().toString());
        detailAdmissionVO.setModifiedBy(userDtls.getId().toString());
        detailAdmissionService.doDetailAdmissionService(detailAdmissionVO);
		return "successaddmission";
	}
	
	

	
	@Override
	public DetailAdmissionVO getModel() {
		// TODO Auto-generated method stub
		return detailAdmissionVO;
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

	public void setStudentSessionMasterList(List<MasterVO> studentSessionMasterList) {
		this.studentSessionMasterList = studentSessionMasterList;
	}
	

		
	
}
