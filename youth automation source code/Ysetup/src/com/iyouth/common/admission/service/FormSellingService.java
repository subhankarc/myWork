package com.iyouth.common.admission.service;

import com.iyouth.common.admission.vo.FormSellingVO;

public interface FormSellingService {

	public boolean enquiryIdGenerationService(FormSellingVO formSellingObj) ;
	
	public boolean sellFormService(FormSellingVO formSellingVO);
}
