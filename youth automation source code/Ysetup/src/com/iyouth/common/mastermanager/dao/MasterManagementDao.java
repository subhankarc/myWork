/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.mastermanager.dao;

import java.util.List;

import com.iyouth.common.vo.MasterVO;

/**
 *
 * @author sumanta
 */
public interface MasterManagementDao {
	public List<MasterVO> getRelationWithDetails( );
	
	public List<MasterVO> getLocation();
	
	public List<MasterVO> getQualificationDetails();
	
	public List<MasterVO> getCourseTypeDetails();
	
	public List<MasterVO> getStreamDetails();
	
	public List<MasterVO> getStudentType();
	
	public List<MasterVO> getSession();
}
