/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.mastermanager.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.iyouth.common.mastermanager.dao.MasterManagementDao;
import com.iyouth.common.mastermanager.dao.MasterManagementDaoImpl;
import com.iyouth.common.vo.MasterVO;

/**
 *
 * @author sumanta
 */
public class MasterManagementServiceImpl implements MasterManagementService{

    private static Logger logger = Logger.getLogger(MasterManagementServiceImpl.class);
    MasterManagementDao masterManagementDao=new MasterManagementDaoImpl();

	@Override
	public List<MasterVO> getRelationWithDetails() {
		logger.info("Enter into the MasterManagementServiceImpl:::--getRelationWithDetails");
		// TODO Auto-generated method stub
		return masterManagementDao.getRelationWithDetails();
	}

	@Override
	public List<MasterVO> getLocation() {
		// TODO Auto-generated method stub
		return masterManagementDao.getLocation();
	}

	@Override
	public List<MasterVO> getQualificationDetails() {
		// TODO Auto-generated method stub
		return masterManagementDao.getQualificationDetails();
	}

	@Override
	public List<MasterVO> getCourseTypeDetails() {
		// TODO Auto-generated method stub
		return masterManagementDao.getCourseTypeDetails();
	}

	@Override
	public List<MasterVO> getStreamDetails() {
		// TODO Auto-generated method stub
		return masterManagementDao.getStreamDetails();
	}

	@Override
	public List<MasterVO> getStudentType() {
		// TODO Auto-generated method stub
		return masterManagementDao.getStudentType();
	}

	@Override
	public List<MasterVO> getSession() {
		// TODO Auto-generated method stub
		return masterManagementDao.getSession();
	}
    	

    
}
