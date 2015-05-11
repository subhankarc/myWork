/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.service;

import com.iyouth.common.admission.dao.DetailAdmissionDao;
import com.iyouth.common.admission.dao.DetailAdmissionDaoImpl;
import com.iyouth.common.admission.vo.DetailAdmissionVO;

public class DetailAdmissionServiceImpl implements DetailAdmissionService {

	DetailAdmissionDao detailAdmissionDao = new DetailAdmissionDaoImpl();

	// DetailAdmissionVO detailAdmissionVO = new DetailAdmissionVO();

	@Override
	public DetailAdmissionVO loadData(DetailAdmissionVO detailAdmissionVO) {
		return detailAdmissionDao.loadData(detailAdmissionVO);
	}

	@Override
	public boolean doDetailAdmissionService(DetailAdmissionVO detailAdmissionVO) {

		detailAdmissionVO.setSecondaryContactNoDb(Long
				.parseLong(detailAdmissionVO.getSecondaryContactNo()));

		detailAdmissionVO.setMarksDb(Double.parseDouble(detailAdmissionVO
				.getMarks()));

		detailAdmissionVO
				.setPinDb(Integer.parseInt(detailAdmissionVO.getPin()));

		boolean updateInStudent = detailAdmissionDao
				.updateInStudent(detailAdmissionVO);

		return updateInStudent;

	}
}