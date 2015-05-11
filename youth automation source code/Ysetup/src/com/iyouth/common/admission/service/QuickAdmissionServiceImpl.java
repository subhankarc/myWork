/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.service;

import com.iyouth.common.admission.dao.QuickAdmissionDao;
import com.iyouth.common.admission.dao.QuickAdmissionDaoImpl;
import com.iyouth.common.admission.vo.QuickAdmissionVO;
import com.iyouth.common.util.CommonUtilityClass;

public class QuickAdmissionServiceImpl implements QuickAdmissionService {

	QuickAdmissionDao quickAdmissionDao = new QuickAdmissionDaoImpl();

	@Override
	public boolean doQuickAdmissionService(QuickAdmissionVO quickAdmissionVO) {

		boolean insertInStudent = false;
		boolean insertInReg = false;

		if (quickAdmissionVO.getContactNo() != null) {
			quickAdmissionVO.setContactNoDB(Long.parseLong(quickAdmissionVO
					.getContactNo()));
		}
		if (quickAdmissionVO.getCandidateName() != null
				&& quickAdmissionVO.getCourseTypeId() != null
				&& quickAdmissionVO.getStreamId() != null
				&& quickAdmissionVO.getSessionId() != null
				&& quickAdmissionVO.getStudentType() != null) {
			Integer sessionStartMonth = quickAdmissionDao
					.getSessionStartMonth(quickAdmissionVO);

			String courseId = quickAdmissionVO.getCourseTypeId();
			String streamId = quickAdmissionVO.getStreamId();
			String sessionId = quickAdmissionVO.getSessionId();

			int maxRegSerialNo = quickAdmissionDao
					.getMaxSerialNoFromReg(quickAdmissionVO);
			int maxStdSerialNo = quickAdmissionDao
					.getMaxSerialNoFromStd(quickAdmissionVO);
			CommonUtilityClass utilityClass = new CommonUtilityClass();
			String studentType = utilityClass.getFirstCharOf(quickAdmissionVO
					.getStudentType());
			int regYear = utilityClass.getRegYear(sessionStartMonth);
			quickAdmissionVO.setRegistrationYear(regYear);
			String regId = utilityClass.getRegId(courseId, streamId, sessionId,
					studentType, maxRegSerialNo, regYear);
			quickAdmissionVO.setRegistrationId(regId);
			String studentId = utilityClass.getStudentId(maxStdSerialNo);
			quickAdmissionVO.setStudentId(studentId);
			if (!quickAdmissionDao.isFormNoExists(quickAdmissionVO)) {
				insertInStudent = quickAdmissionDao
						.insertInStudent(quickAdmissionVO);
				insertInReg = quickAdmissionDao.insertInReg(quickAdmissionVO);
			}
			return (insertInStudent && insertInReg);
		}
		return false;
	}

	@Override
	public QuickAdmissionVO loadFormSeellingData(
			QuickAdmissionVO quickAdmissionVO) {
		return quickAdmissionDao.loadDataFromFormSelling(quickAdmissionVO);
	}

}