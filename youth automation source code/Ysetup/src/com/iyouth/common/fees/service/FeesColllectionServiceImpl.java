package com.iyouth.common.fees.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.iyouth.common.fees.dao.FeesCollectionDao;
import com.iyouth.common.fees.dao.FeesCollectionDaoImpl;
import com.iyouth.common.fees.vo.FeesCollectionVO;
import com.iyouth.common.fees.vo.PaidDetailsVO;
import com.iyouth.common.fees.vo.TransactionDetailsVO;
import com.iyouth.common.util.IYOUTHConstants;

public class FeesColllectionServiceImpl implements FeesCollectionService {

	FeesCollectionDao feesCollectionDao = new FeesCollectionDaoImpl();

	@Override
	public ArrayList<FeesCollectionVO> getStudentData(
			FeesCollectionVO feesCollectionVO) {
		return feesCollectionDao.getStudentInfo(feesCollectionVO);
	}

	@Override
	public ArrayList<TransactionDetailsVO> getFeesDetails(String hiddenregid) {
		ArrayList<TransactionDetailsVO> feesDetails = feesCollectionDao
				.getFeesDetails(hiddenregid);
		ArrayList<TransactionDetailsVO> removedList = new ArrayList<TransactionDetailsVO>();
		for (TransactionDetailsVO transactionDetailsVO : feesDetails) {
			if (Double.parseDouble(transactionDetailsVO.getAmount()) == 0) {
				removedList.add(transactionDetailsVO);
			}
		}

		feesDetails.removeAll(removedList);
		int rowNumber = 1;
		for (TransactionDetailsVO transactionDetailsVO : feesDetails) {
			transactionDetailsVO.setRegistrationId(hiddenregid);
			transactionDetailsVO.setRowNumber(rowNumber);
			rowNumber++;
		}

		return feesDetails;
	}

	@Override
	public ArrayList<PaidDetailsVO> enterStudentFeesData(String selectedRow,
			ArrayList<TransactionDetailsVO> dueDetails) {
		ArrayList<PaidDetailsVO> paidDetails = new ArrayList<PaidDetailsVO>();
		// transaction id for each transaction has to be generated.
		// reg-id has to be set
		// std-id has to be set
		// scsp-id already there
		// amount aready there
		// date is the current date
		// bill-no should be generated
		// received_by is the user name
		// payment seq_no is needed for fine only.
		int maxTransactionId = feesCollectionDao.getMaxTransactionId();
		int serialNo = 1;
		for (int i = 0; i < selectedRow.length(); i++) {
			if (!(selectedRow.charAt(i) == '-')) {
				int row = Character.getNumericValue(selectedRow.charAt(i)) - 1;
				TransactionDetailsVO transactionDetailsVO = dueDetails.get(row);

				SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
				Date now = new Date();
				String date = sdfDate.format(now);
				String receivedBy = null;
				PaidDetailsVO paidDetailsVO = new PaidDetailsVO();
				paidDetailsVO.setTransactionId(String
						.valueOf(maxTransactionId + 1));
				paidDetailsVO.setRegistrationId(transactionDetailsVO
						.getRegistrationId());
				paidDetailsVO.setStudentId(transactionDetailsVO.getStudentId());
				paidDetailsVO.setScspId(transactionDetailsVO.getScspId());
				paidDetailsVO.setAmount(transactionDetailsVO.getAmount());
				paidDetailsVO.setDate(date);
				paidDetailsVO.setBillNo(IYOUTHConstants.BILL_NO_PREFIX
						+ String.valueOf(maxTransactionId + 1));
				paidDetailsVO.setReceivedBy(receivedBy);
				paidDetailsVO.setPaymentSeqNo(null);
				paidDetailsVO.setSerialNo(serialNo);
				serialNo ++;
				paidDetailsVO.setPaymentType(IYOUTHConstants.PAYMENT_TYPE_INSTALLMENT);
				feesCollectionDao.enterTransaction(paidDetailsVO);
				paidDetails.add(paidDetailsVO);
				maxTransactionId++;
				if (transactionDetailsVO.getFineInInteger() > 0) {
					PaidDetailsVO paidDetailsVO1 = new PaidDetailsVO();
					paidDetailsVO1.setTransactionId(String
							.valueOf(maxTransactionId + 1));
					paidDetailsVO1.setRegistrationId(transactionDetailsVO
							.getRegistrationId());
					paidDetailsVO1.setStudentId(transactionDetailsVO
							.getStudentId());
					paidDetailsVO1.setScspId(String.valueOf(0));
					paidDetailsVO1.setAmount(String
							.valueOf(transactionDetailsVO.getFineInInteger()));
					paidDetailsVO1.setDate(date);
					paidDetailsVO1.setBillNo(IYOUTHConstants.BILL_NO_PREFIX
							+ String.valueOf(maxTransactionId + 1));
					paidDetailsVO1.setReceivedBy(receivedBy);
					paidDetailsVO1.setPaymentSeqNo(transactionDetailsVO
							.getPaymentSeqNo());
					paidDetailsVO1.setSerialNo(serialNo);
					serialNo ++;
					paidDetailsVO1.setPaymentType(IYOUTHConstants.PAYMENT_TYPE_FINE);
					feesCollectionDao.enterTransaction(paidDetailsVO1);
					paidDetails.add(paidDetailsVO1);
					maxTransactionId++;
				}
			}
		}
		return paidDetails;
	}

}
