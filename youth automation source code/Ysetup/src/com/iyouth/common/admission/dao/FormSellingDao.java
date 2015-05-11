/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.admission.dao;

import java.util.List;

import com.iyouth.common.admission.vo.FormSellingVO;

/**
 * 
 * @author sumanta
 */
public interface FormSellingDao {
	public boolean generateTokenNo(FormSellingVO formSellingVO);

	public boolean enquiryIdExists(FormSellingVO formSellingVO);

	public boolean sellFormWithUpdate(FormSellingVO formSellingVO);

	// public boolean searchWithEnqiryId(FormSellingVO formSellingVO);

	public int getMaxSerialNo(FormSellingVO formSellingVO);
}
