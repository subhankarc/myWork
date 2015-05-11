package com.iyouth.common.callmanagement.service;

import com.iyouth.common.callmanagement.vo.CallManagementVO;

public interface CallManagementService {

	CallManagementVO searchCallManagementData(CallManagementVO callManagementVO);

	CallManagementVO fetchCallManagementData(CallManagementVO callManagementVO);

}
