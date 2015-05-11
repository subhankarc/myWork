/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.dao;

import com.iyouth.common.admission.vo.DetailAdmissionVO;



/**
 *
 * @author subhankar
 */
public interface DetailAdmissionDao {

	DetailAdmissionVO loadData(DetailAdmissionVO detailAdmissionVO);


	boolean updateInStudent(DetailAdmissionVO detailAdmissionVO);
	

		
}
