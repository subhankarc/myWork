package com.iyouth.common.fees.dao;

import java.util.ArrayList;

import com.iyouth.common.fees.vo.FeesCollectionVO;
import com.iyouth.common.fees.vo.PaidDetailsVO;
import com.iyouth.common.fees.vo.TransactionDetailsVO;

public interface FeesCollectionDao {

	ArrayList<FeesCollectionVO> getStudentInfo(FeesCollectionVO feesCollectionVO);

	ArrayList<TransactionDetailsVO> getFeesDetails(String hiddenregid);

	int getMaxTransactionId();
	
	 void enterTransaction(PaidDetailsVO paidDetailsVO);
}
