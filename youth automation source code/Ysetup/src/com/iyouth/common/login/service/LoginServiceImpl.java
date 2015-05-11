/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.login.service;

import org.apache.log4j.Logger;

import com.iyouth.common.login.dao.LoginDetailsDao;
import com.iyouth.common.login.dao.LoginDetailsDaoImpl;
import com.iyouth.common.login.vo.LoginDetails;
import com.iyouth.common.login.vo.User;


/**
 *
 * @author sumanta
 */
public class LoginServiceImpl implements LoginService{

    private static Logger logger = Logger.getLogger(LoginServiceImpl.class);
    LoginDetailsDao loginDao = new LoginDetailsDaoImpl();

    public User loginActionService(LoginDetails loginUserObj) {
    	logger.info("Enter Into loginActionService");
        User loginObj = null;
        User loginUserDetails = loginDao.getUserDetails(loginUserObj);
        if (loginUserDetails != null) {
            loginObj = new User();
            loginObj.setId(loginUserDetails.getId());
            loginObj.setUserName(loginUserDetails.getUserName());
            loginObj.setUserType(loginUserDetails.getUserType());
            loginObj.setSessionId(loginUserObj.getSessionID());
            loginDao.saveLoginDetails(loginObj);
        }
        return loginObj;
    }
    
    public boolean logoutActionService(User loginUserObj) {
        
    	logger.info("Enter Into logoutActionService");
        return loginDao.saveLogOutDetails(loginUserObj);

    }
}
