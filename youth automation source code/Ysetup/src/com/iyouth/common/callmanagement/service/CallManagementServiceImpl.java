package com.iyouth.common.callmanagement.service;

import com.iyouth.common.callmanagement.dao.CallManagementDAO;
import com.iyouth.common.callmanagement.dao.CallManagementDAOImpl;
import com.iyouth.common.callmanagement.vo.CallManagementVO;

public class CallManagementServiceImpl implements CallManagementService {

	CallManagementDAO callManagementDAO = new CallManagementDAOImpl();

	@Override
	public CallManagementVO searchCallManagementData(
			CallManagementVO callManagementVO) {
		String searchString = null;
		boolean firstCriteria = true;
		if (callManagementVO.getCourseTypeId().equalsIgnoreCase("-1")
				&& callManagementVO.getSessionId().equalsIgnoreCase("-1")
				&& callManagementVO.getStatusId().equalsIgnoreCase("-1")
				&& callManagementVO.getStreamId().equalsIgnoreCase("-1")
				&& callManagementVO.getYear().equalsIgnoreCase("-1")
				) {
			searchString = "select * from form_selling";
		} else {
			searchString = "select * from form_selling where ";
			if (!callManagementVO.getCourseTypeId().equalsIgnoreCase("-1")) {
				searchString = searchString + "course_type_id = ? ";
				firstCriteria = false;
			}
			if (!callManagementVO.getSessionId().equalsIgnoreCase("-1")) {
				if (firstCriteria) {
					searchString = searchString + "session_id = ? ";
				} else {
					searchString = searchString + "&& session_id = ? ";
				}
				firstCriteria = false;
			}

			if (!callManagementVO.getStatusId().equalsIgnoreCase("-1")) {
				if (firstCriteria) {
					searchString = searchString + "status = ? ";
				} else {
					searchString = searchString + "&& status = ? ";
				}
				firstCriteria = false;
			}
			if (!callManagementVO.getStreamId().equalsIgnoreCase("-1")) {
				if (firstCriteria) {
					searchString = searchString + "stream_id = ? ";
				} else {
					searchString = searchString + "&& stream_id = ? ";
				}
				firstCriteria = false;
			}
			if (!callManagementVO.getYear().equalsIgnoreCase("-1")) {
				if (firstCriteria) {
					searchString = searchString + "year = ? ";
				} else {
					searchString = searchString + "&& year = ?";
				}
			}
		}
		callManagementVO.setSearchString(searchString);
		return callManagementDAO.searchCallManagementData(callManagementVO);
	}

	@Override
	public CallManagementVO fetchCallManagementData(
			CallManagementVO callManagementVO) {
		return callManagementDAO.fetchCallManagementData(callManagementVO);
	}

}
