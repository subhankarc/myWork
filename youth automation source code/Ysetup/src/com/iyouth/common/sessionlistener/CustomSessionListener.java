package com.iyouth.common.sessionlistener;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

import com.iyouth.common.login.service.LoginService;
import com.iyouth.common.login.service.LoginServiceImpl;
import com.iyouth.common.login.vo.User;
import com.iyouth.common.util.IYOUTHConstants;

public class CustomSessionListener implements 
		HttpSessionListener {

	private static Logger logger = Logger.getLogger(CustomSessionListener.class);
	private int sessionCount;
	

	public CustomSessionListener() {
		this.sessionCount = 0;
	}

	/**
	 * Record the fact that a session has been created.
	 * 
	 * @param se
	 *            The session event
	 */
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		
		synchronized (this) {
			sessionCount++;
		}
		String id = session.getId();
		Date now = new Date();
		String message = new StringBuffer("New Session created on ").append(
				now.toString()).append("--ID: ").append(id).append("  :---")
				.append("There are now ").append("" + sessionCount).append(
						" live sessions in the application.").toString();

		System.out.println("sessionCreated-->message:--"+message);
		logger.info(message);

	

	}

	/**
	 * Record the fact that a session has been destroyed.
	 * 
	 * @param se
	 *            The session event
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		String id = session.getId();
		
		if(session!=null && (session.getAttribute(IYOUTHConstants.USEROBJ))!=null){
			User userDtls = (User) session.getAttribute(IYOUTHConstants.USEROBJ);
			if(userDtls!=null){
				LoginService loginServ = new LoginServiceImpl();
				loginServ.logoutActionService(userDtls);
			}
			
				
		}
		synchronized (this) {
			--sessionCount;
		}
		String message = new StringBuffer("Session destroyed"
				+ "----:--Value of destroyed session ID is").append("" + id)
				.append(":--:").append("There are now ").append(
						"" + sessionCount).append(
						" live sessions in the application.").toString();

		System.out.println("message:--"+message);
		logger.info(message);

		

	}

	

}
