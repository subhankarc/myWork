package com.iyouth.common.fees.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.iyouth.common.action.BaseAction;
import com.iyouth.common.fees.service.FeesCollectionService;
import com.iyouth.common.fees.service.FeesColllectionServiceImpl;
import com.iyouth.common.fees.vo.FeesCollectionVO;
import com.iyouth.common.fees.vo.PaidDetailsVO;
import com.iyouth.common.fees.vo.TransactionDetailsVO;
import com.opensymphony.xwork2.ModelDriven;

public class FeesCollectionAction extends BaseAction implements
		ModelDriven<FeesCollectionVO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FeesCollectionVO feesCollectionVO = new FeesCollectionVO();
	FeesCollectionService feesCollectionService = new FeesColllectionServiceImpl();
	private ArrayList<FeesCollectionVO> studentData;
	private int rowNum = 1;
	private ArrayList<TransactionDetailsVO> dueDetails;

	public FeesCollectionAction() {
		ArrayList<String> searchByArrayList = new ArrayList<String>();
		searchByArrayList.add("Registration Id");
		searchByArrayList.add("Student Id");
		searchByArrayList.add("Name");
		feesCollectionVO.setSearchByList(searchByArrayList);
	}

	@Override
	public FeesCollectionVO getModel() {
		return feesCollectionVO;
	}

	public String loadFeesCollection() {
		System.out.println("Entering into Fees Collection Page");
		return "loadpage";
	}

	public String loadStudentData() {
		studentData = feesCollectionService.getStudentData(feesCollectionVO);
		for (FeesCollectionVO searchVO : studentData) {
			searchVO.setRowNumber(rowNum);
			rowNum++;
		}
		feesCollectionVO.setStudentData(studentData);
		return "loaddata";
	}

	public String loadStudentFeesData() throws ParseException {
		getStudentFeesDetails(feesCollectionVO.getHiddenregid());
		feesCollectionVO.setDueDetails(dueDetails);
		feesCollectionVO.setHiddenregistrationid(feesCollectionVO
				.getHiddenregid());
		return "loaddata";
	}

	public String enterStudentFeesData() throws ParseException {
		getStudentFeesDetails(feesCollectionVO.getHiddenregistrationid());
		ArrayList<PaidDetailsVO> paidDetails = feesCollectionService
				.enterStudentFeesData(feesCollectionVO.getSelectedRow(),
						dueDetails);
		feesCollectionVO.setPaidDetails(paidDetails);
		feesCollectionVO.setReg(paidDetails.get(0).getRegistrationId());
		feesCollectionVO.setStdId(paidDetails.get(0).getStudentId());
		feesCollectionVO.setReceivedBy(paidDetails.get(0).getReceivedBy());
		return "loaddata";
	}

	public void getStudentFeesDetails(String regId) throws ParseException {
		ArrayList<TransactionDetailsVO> feesDetails = feesCollectionService
				.getFeesDetails(regId);
		dueDetails = new ArrayList<TransactionDetailsVO>();

		if (feesDetails != null) {
			for (TransactionDetailsVO transactionDetailsVO : feesDetails) {
				if (transactionDetailsVO.getTransactionId() == null) {
					dueDetails.add(transactionDetailsVO);
				}
			}
			feesDetails.removeAll(dueDetails);
		}
		if (feesDetails != null) {
			feesCollectionVO.setFeesDetails(feesDetails);
		}

		int rowNumber = 1;
		for (TransactionDetailsVO transactionDetailsVO : dueDetails) {
			Calendar mydate = getPayableDate(transactionDetailsVO);
			transactionDetailsVO.setPayableDateInDateFormat(mydate.getTime());
			setFineForDuePayments(transactionDetailsVO, mydate);
			transactionDetailsVO.setRowNumber(rowNumber);
			rowNumber++;
		}
	}

	private void setFineForDuePayments(
			TransactionDetailsVO transactionDetailsVO, Calendar mydate)
			throws ParseException {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		Calendar currentDate = new GregorianCalendar();
		currentDate.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(strDate));
		long difference = currentDate.getTimeInMillis()
				- mydate.getTimeInMillis();
		if (difference > 0) {
			Integer differenceInDays = (int) (difference / 86400000);
			transactionDetailsVO.setFineInInteger(differenceInDays * 5);
		}
	}

	private Calendar getPayableDate(TransactionDetailsVO transactionDetailsVO)
			throws ParseException {
		Calendar mydate = new GregorianCalendar();
		String mystring = transactionDetailsVO.getPayableDate();
		Date thedate = new SimpleDateFormat("yyyy-MM-dd").parse(mystring);
		mydate.setTime(thedate);
		mydate.add(
				Calendar.YEAR,
				Integer.parseInt(transactionDetailsVO.getRegistrationYear()
						.substring(0, 4)) - mydate.get(Calendar.YEAR));
		return mydate;
	}

}
