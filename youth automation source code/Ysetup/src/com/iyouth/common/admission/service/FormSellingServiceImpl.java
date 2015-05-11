/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.service;

import org.apache.log4j.Logger;

import com.iyouth.common.admission.dao.FormSellingDao;
import com.iyouth.common.admission.dao.FormSellingDaoImpl;
import com.iyouth.common.admission.vo.FormSellingVO;
import com.iyouth.common.util.CommonUtilityClass;

/**
 * 
 * @author sumanta
 */
public class FormSellingServiceImpl implements FormSellingService {

	private static Logger logger = Logger
			.getLogger(FormSellingServiceImpl.class);
	FormSellingDao formSellingDao = new FormSellingDaoImpl();

	@Override
	public boolean enquiryIdGenerationService(FormSellingVO formSellingObj) {
		
		if(formSellingObj.getContactNo()!=null){
			formSellingObj.setContactNoDB(Long.parseLong(formSellingObj.getContactNo().trim()));
		}
		
		if (formSellingObj.getCallCount() == null) {
			formSellingObj.setCallCount(0);
		}
		int maxSerialNo = formSellingDao.getMaxSerialNo(formSellingObj);
		CommonUtilityClass utilityClass = new CommonUtilityClass();
		String enquiryId = utilityClass.getEnquiryNoSequence(maxSerialNo);
		formSellingObj.setEnquiryId(enquiryId);
		return formSellingDao.generateTokenNo(formSellingObj);
	}

	@Override
	public boolean sellFormService(FormSellingVO formSellingVO) {
		if(formSellingVO.getContactNo()!=null){
			formSellingVO.setContactNoDB(Long.parseLong(formSellingVO.getContactNo().trim()));
		}
		if (formSellingVO.getCallCount() == null) {
			formSellingVO.setCallCount(0);
		}
		if (formSellingDao.enquiryIdExists(formSellingVO)) {
			return formSellingDao.sellFormWithUpdate(formSellingVO);
		} else {
			return formSellingDao.generateTokenNo(formSellingVO);
		}
	}
}
