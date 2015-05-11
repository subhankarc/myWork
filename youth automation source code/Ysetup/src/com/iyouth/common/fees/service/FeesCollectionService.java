package com.iyouth.common.fees.service;

import java.util.ArrayList;

import com.iyouth.common.fees.vo.FeesCollectionVO;
import com.iyouth.common.fees.vo.PaidDetailsVO;
import com.iyouth.common.fees.vo.TransactionDetailsVO;

public interface FeesCollectionService {

	ArrayList<FeesCollectionVO> getStudentData(FeesCollectionVO feesCollectionVO);

	ArrayList<TransactionDetailsVO> getFeesDetails(String hiddenregid);

	ArrayList<PaidDetailsVO> enterStudentFeesData(String selectedRow,
			ArrayList<TransactionDetailsVO> dueDetails);

}
