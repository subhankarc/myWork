package com.iyouth.common.mastermanager.service;

import java.util.List;

import com.iyouth.common.vo.MasterVO;

public interface MasterManagementService {

	public List<MasterVO> getRelationWithDetails();

	public List<MasterVO> getLocation();

	public List<MasterVO> getQualificationDetails();

	public List<MasterVO> getCourseTypeDetails();

	public List<MasterVO> getStreamDetails();

	public List<MasterVO> getStudentType();

	public List<MasterVO> getSession();
}
