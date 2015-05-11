package com.iyouth.common.admission.service;

import com.iyouth.common.admission.vo.DetailAdmissionVO;


public interface DetailAdmissionService {

	DetailAdmissionVO loadData(DetailAdmissionVO detailAdmissionVO);

	boolean doDetailAdmissionService(DetailAdmissionVO detailAdmissionVO);

}
