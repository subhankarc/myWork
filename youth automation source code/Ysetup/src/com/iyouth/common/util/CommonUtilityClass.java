package com.iyouth.common.util;

import java.util.Calendar;

public class CommonUtilityClass {

	public String getEnquiryNoSequence(int maxSeq) {
		String maxSerialNo = String.valueOf(maxSeq + 1);
		Integer noOfZeros = IYOUTHConstants.ENQUIRY_ID_LENGTH
				- maxSerialNo.length()
				- IYOUTHConstants.ENQUIRY_ID_PREFIX.length();
		StringBuilder buffer = new StringBuilder();
		buffer.append(IYOUTHConstants.ENQUIRY_ID_PREFIX);
		for (int i = 0; i < noOfZeros; i++) {
			buffer.append("0");
		}
		buffer.append(maxSerialNo);

		return buffer.toString();

	}

	public String getRegId(String courseId, String streamId, String sessionId,
			String studentType, int maxRegSerialNo, int regYear) {

		String maxSerialNo = String.valueOf(maxRegSerialNo + 1);
		String regYearStr = String.valueOf(regYear);
		Integer noOfZeros = IYOUTHConstants.REG_ID_LENGTH
				- maxSerialNo.length();
		StringBuilder buffer = new StringBuilder();
		buffer.append(courseId.toUpperCase());
		buffer.append(streamId.toUpperCase());
		buffer.append("-");
		buffer.append(studentType.toUpperCase());
		buffer.append("-");
		buffer.append(sessionId);
		buffer.append("/");
		buffer.append(regYearStr);
		buffer.append("-");
		for (int i = 0; i < noOfZeros; i++) {
			buffer.append("0");
		}
		buffer.append(maxSerialNo);
		return buffer.toString();

	
	}
	
	public String getFirstCharOf(String string) {
		char firstChar = string.charAt(0);
		StringBuilder builder = new StringBuilder();
		builder.append(firstChar);
		String studentType = 	builder.toString();
		return studentType;
	}

	public int getCurrentYear() {
		Calendar cal=Calendar.getInstance();
		  int year=cal.get(Calendar.YEAR);
		  return year;
	}
	
	public int getCurrentMonth() {
		Calendar cal=Calendar.getInstance();
		  int month=cal.get(Calendar.MONTH);
		  return month + 1;
	}
	
	public int getCurrentDay() {
		Calendar cal=Calendar.getInstance();
		  int date=cal.get(Calendar.DATE);
		  return date;
	}
	
	public int getRegYear(int sessionStartMonth) {
		int currentMonth = getCurrentMonth();
		int currentYear = getCurrentYear();
		if(currentMonth - sessionStartMonth > 2){
			return currentYear + 1;
		}
		return currentYear;
	}

	public String getStudentId(int maxStdSerialNo) {
		String maxSerialNo = String.valueOf(maxStdSerialNo + 1);
		Integer noOfZeros = IYOUTHConstants.STUDENT_ID_LENGTH
				- maxSerialNo.length()
				- IYOUTHConstants.STUDENT_ID_PREFIX.length();
		StringBuilder buffer = new StringBuilder();
		buffer.append(IYOUTHConstants.STUDENT_ID_PREFIX);
		for (int i = 0; i < noOfZeros; i++) {
			buffer.append("0");
		}
		buffer.append(maxSerialNo);

		return buffer.toString();

	
	}



}
