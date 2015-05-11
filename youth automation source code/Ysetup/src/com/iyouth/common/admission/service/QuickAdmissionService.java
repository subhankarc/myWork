package com.iyouth.common.admission.service;

import com.iyouth.common.admission.vo.QuickAdmissionVO;

public interface QuickAdmissionService {

	boolean doQuickAdmissionService(QuickAdmissionVO quickAdmissionVO);

	QuickAdmissionVO loadFormSeellingData(QuickAdmissionVO quickAdmissionVO);
	
	

}
