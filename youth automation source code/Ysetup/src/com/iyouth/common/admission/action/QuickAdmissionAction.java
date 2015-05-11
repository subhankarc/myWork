/**
 * 
 */
package com.iyouth.common.admission.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.iyouth.common.action.BaseAction;
import com.iyouth.common.admission.service.QuickAdmissionService;
import com.iyouth.common.admission.service.QuickAdmissionServiceImpl;
import com.iyouth.common.admission.vo.QuickAdmissionVO;
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
public class QuickAdmissionAction extends BaseAction implements ModelDriven<QuickAdmissionVO>{
	
	private QuickAdmissionVO quickAdmissionVO=new QuickAdmissionVO();

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(QuickAdmissionAction.class);
	QuickAdmissionService formSellingService = new QuickAdmissionServiceImpl();
	MasterManagementService masterManagementService=new MasterManagementServiceImpl();
	
	List<MasterVO> courseTypeMasterList=new ArrayList<MasterVO>();
	List<MasterVO> streamMasterList=new ArrayList<MasterVO>();
	List<MasterVO> studentTypMasterList=new ArrayList<MasterVO>();
	List<MasterVO> studentSessionMasterList=new ArrayList<MasterVO>();
	
	public String loadQuickAdmissionPage() {
        System.out.println("Enter into loadQuickAdmission");
        logger.info("Enter into loadQuickAdmission");
	    courseTypeMasterList=masterManagementService.getCourseTypeDetails();
	    streamMasterList=masterManagementService.getStreamDetails();
	    studentTypMasterList=masterManagementService.getStudentType();
        studentSessionMasterList=masterManagementService.getSession();
		return "loadpage";
	}
	
	public String loadQuickAdmissionData(){
		System.out.println("Load data from form_seelling");
		QuickAdmissionVO admissionVO = formSellingService.loadFormSeellingData(quickAdmissionVO);
		if(admissionVO!=null){
		quickAdmissionVO.setCandidateName(admissionVO.getCandidateName());
		quickAdmissionVO.setContactNo(admissionVO.getContactNo());
		quickAdmissionVO.setCourseTypeId(admissionVO.getCourseTypeId());
		quickAdmissionVO.setStreamId(admissionVO.getStreamId());
		quickAdmissionVO.setStudentType(admissionVO.getStudentType());
		quickAdmissionVO.setSessionId(admissionVO.getSessionId());
		}else{
			logger.error("QuickAdmissionAction:loadQuickAdmissionData:-->no data found for specific search");
			quickAdmissionVO.setCandidateName("");
			quickAdmissionVO.setContactNo("");
			quickAdmissionVO.setCourseTypeId(IYOUTHConstants.DROP_DOWN_INDEX);
			quickAdmissionVO.setStreamId(IYOUTHConstants.DROP_DOWN_INDEX);
			quickAdmissionVO.setStudentType(IYOUTHConstants.DROP_DOWN_INDEX);
			quickAdmissionVO.setSessionId(IYOUTHConstants.DROP_DOWN_INDEX);
		}
		courseTypeMasterList=masterManagementService.getCourseTypeDetails();
	    streamMasterList=masterManagementService.getStreamDetails();
	    studentTypMasterList=masterManagementService.getStudentType();
        studentSessionMasterList=masterManagementService.getSession();
		return "loadpage";		
	}

	public String doQuickAdmission() {
        System.out.println("Entered in do quick Admission");
        User userDtls = (User) sessionMap.get(IYOUTHConstants.USEROBJ);
        System.out.println("formSellingVO"+quickAdmissionVO.getCandidateName());
        System.out.println("formSellingVO"+quickAdmissionVO.getFormNo());
        quickAdmissionVO.setAddedBy(userDtls.getId().toString());
        quickAdmissionVO.setModifiedBy(userDtls.getId().toString());
        formSellingService.doQuickAdmissionService(quickAdmissionVO);
        
        quickAdmissionVO.setFormNo("");
        quickAdmissionVO.setCandidateName("");
		quickAdmissionVO.setContactNo("");
		quickAdmissionVO.setCourseTypeId(IYOUTHConstants.DROP_DOWN_INDEX);
		quickAdmissionVO.setStreamId(IYOUTHConstants.DROP_DOWN_INDEX);
		quickAdmissionVO.setStudentType(IYOUTHConstants.DROP_DOWN_INDEX);
		quickAdmissionVO.setSessionId(IYOUTHConstants.DROP_DOWN_INDEX);
	
	courseTypeMasterList=masterManagementService.getCourseTypeDetails();
    streamMasterList=masterManagementService.getStreamDetails();
    studentTypMasterList=masterManagementService.getStudentType();
    studentSessionMasterList=masterManagementService.getSession();
		return "successaddmission";
	}
	
	
	@Override
	public QuickAdmissionVO getModel() {
		// TODO Auto-generated method stub
		return quickAdmissionVO;
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
