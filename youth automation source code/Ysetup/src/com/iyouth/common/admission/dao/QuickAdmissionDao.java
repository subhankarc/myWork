/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.dao;

import com.iyouth.common.admission.vo.QuickAdmissionVO;


/**
 *
 * @author subhankar
 */
public interface QuickAdmissionDao {

	boolean insertInStudent(QuickAdmissionVO quickAdmissionVO);

	int getMaxSerialNoFromReg(QuickAdmissionVO quickAdmissionVO);

	Integer getSessionStartMonth(QuickAdmissionVO quickAdmissionVO);

	int getMaxSerialNoFromStd(QuickAdmissionVO quickAdmissionVO);

	boolean insertInReg(QuickAdmissionVO quickAdmissionVO);

	QuickAdmissionVO loadDataFromFormSelling(QuickAdmissionVO quickAdmissionVO);

	boolean isFormNoExists(QuickAdmissionVO quickAdmissionVO);
	
}
