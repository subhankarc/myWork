package com.iyouth.common.login.action;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.iyouth.common.action.BaseAction;
import com.iyouth.common.login.service.LoginService;
import com.iyouth.common.login.service.LoginServiceImpl;
import com.iyouth.common.login.vo.LoginDetails;
import com.iyouth.common.login.vo.User;
import com.iyouth.common.util.IYOUTHConstants;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;


public class LoginCustomizationAction extends BaseAction implements ModelDriven<LoginDetails>{

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(LoginCustomizationAction.class);
	private LoginDetails loginUser= new LoginDetails();

	public String login() {
		System.out.println("LoginCustomizationAction::---login method" );
		logger.info("Inside login method.........................");
		return "loginreq";
	}

	public String reLogin() {
		addActionMessage("User Session has expired. Please login");
		return "loginreq";
	}

	public String actionLogin() {
		HttpSession sess = ServletActionContext.getRequest().getSession(false);
		if (loginUser.getUserName() != null
				&& loginUser.getUserName().trim().length() > 0
				&& loginUser.getPass() != null
				&& loginUser.getPass().length() > 0) {
			logger
					.info("Enter for Login Action-------------------------------------------------");
			LoginService loginServ = new LoginServiceImpl();
			loginUser.setSessionID(sess.getId());
			User loginUserObj = loginServ.loginActionService(loginUser);
			sess.setAttribute(IYOUTHConstants.USEROBJ, loginUserObj);
			if (loginUserObj == null) {
				logger.info("Login Faliure-------------------------------------------------");
				System.out.println("Login Faliure-------------------------------------------------");
				addActionError("YERR001");
				return "failure";
			}
		} else {
			logger
					.info("Login Faliure-------------------------------------------------");
			addActionError("YERR001");
			return "failure";
		}
		//CustomizationSessionContext.initialize(loginUser.getUserName());
		return Action.SUCCESS;
	}

	
	@Override
	public void validate() {

		if (loginUser == null) {
			addFieldError("loginUser.userName", "User name is required.");
			addFieldError("loginUser.pass", "Password is required.");
		} else {
			try {
				if (loginUser.getUserName().trim().length() == 0) {

					addFieldError("loginUser.userName",
							"User name is required.");

				}
				if (loginUser.getPass().trim().length() == 0) {

					addFieldError("loginUser.pass", "Password is required.");

				}
			} catch (Exception ex) {
				logger.info("UserName/Password not present" + ex.getMessage());
			}
		}

	}

	public LoginDetails getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginDetails loginUser) {
		this.loginUser = loginUser;
	}

	
	@Override
	public LoginDetails getModel() {
		// TODO Auto-generated method stub
		return loginUser;
	}
}
