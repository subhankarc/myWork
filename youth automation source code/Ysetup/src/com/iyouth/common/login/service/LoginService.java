package com.iyouth.common.login.service;

import com.iyouth.common.login.vo.LoginDetails;
import com.iyouth.common.login.vo.User;

public interface LoginService {

	public User loginActionService(LoginDetails loginUserObj);
	public boolean logoutActionService(User loginUserObj);
}
