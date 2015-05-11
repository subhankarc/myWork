package com.iyouth.common.callmanagement.dao;

import com.iyouth.common.callmanagement.vo.CallManagementVO;

public interface CallManagementDAO {

	CallManagementVO searchCallManagementData(CallManagementVO callManagementVO);

	CallManagementVO fetchCallManagementData(CallManagementVO callManagementVO);

}
