package com.iyouth.common.login.action;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.iyouth.common.action.BaseAction;
import com.iyouth.common.login.service.LoginService;
import com.iyouth.common.login.service.LoginServiceImpl;
import com.iyouth.common.login.vo.User;
import com.iyouth.common.util.IYOUTHConstants;


public class LogOutCustomizationAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(LogOutCustomizationAction.class);
	

	
	public String logoutAction() {
		logger.info("Enter in Logout");
		addActionMessage("Thank you for using the application.");
		User userDtls = (User) sessionMap.get(IYOUTHConstants.USEROBJ);
		if(userDtls!=null){
			LoginService loginServ = new LoginServiceImpl();
			loginServ.logoutActionService(userDtls);
		}
		sessionMap.put(IYOUTHConstants.USEROBJ,null);
		HttpSession sess = ServletActionContext.getRequest().getSession(false);
		sess.invalidate();
	
		return "logoutreq";
	}

	
}
