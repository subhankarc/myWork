/**
 * 
 */
package com.iyouth.common.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;

import com.iyouth.common.login.vo.User;
import com.iyouth.common.util.IYOUTHConstants;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author Don2
 * 
 */
public class LoginAuthenticationInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7784617643577412115L;
	protected Map sessionMap;
	protected HttpServletRequest request;
	private String sessionId;
	private User userDtls = null;
	private Logger logger = Logger
			.getLogger(LoginAuthenticationInterceptor.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com
	 * .opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation actionInvo) {
		// TODO Auto-generated method stub

		String forwardTo = "";
		final ActionContext context = actionInvo.getInvocationContext();
		HttpServletResponse response = (HttpServletResponse) context
				.get(StrutsStatics.HTTP_RESPONSE);
		if (response != null) {
			response.setHeader("Cache-Control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setDateHeader("Expires", -1);
		}

		try {
			request = ServletActionContext.getRequest();
			//String contextPath = request.getContextPath();
			// String loadLoginUrl = contextPath +
			// Constants.FUNCTION_LOAD_LOGIN;
			// String authenticateLoginUrl = contextPath +
			// Constants.FUNCTION_AUTHENTICATE_LOGIN;
			String requestURI = request.getRequestURI();

			logger.debug("uri=" + requestURI);
			System.out.println("URL::---" + requestURI);

			// Check if the user object is there in the session. If it is not
			// there, then treat the session as invalid, and throw the user to
			// login page
			ActionContext contextInfo = actionInvo.getInvocationContext();
			
			String actionName=ActionContext.getContext().getName();
			System.out.println("ActionName:"+actionName);
			sessionMap = (Map) contextInfo.get(context.SESSION);
			if (sessionMap.get("sessionId") == null) {
				sessionId = request.getSession(true).getId();
				// System.out.println("sessionId in interceptor (if) = "+sessionId);
				sessionMap.put("sessionId", sessionId);
			} else {
				sessionId = (String) sessionMap.get("sessionId");
				// System.out.println("sessionId in interceptor (else) = "+sessionId);
			}

			userDtls = (User) sessionMap.get(IYOUTHConstants.USEROBJ);
			if (userDtls == null) {

				if (actionName.equals(IYOUTHConstants.LOGIN_SUBMIT)
						|| actionName.equals(IYOUTHConstants.LOGIN_LOAD)) {
					System.out.println("LOGIN REQUIRED URL::---" + requestURI);
					forwardTo = actionInvo.invoke();
				} else {
					forwardTo = "sessionNotFound";
				}
			} else if (userDtls != null
					&& actionName.equals(IYOUTHConstants.LOGIN_SUBMIT)) {
				System.out.println("GLOBALMAINPAGE_LOAD ::-URL::---" + requestURI);
				forwardTo = IYOUTHConstants.GLOBALMAINPAGE_LOAD;
			} else {
				forwardTo = actionInvo.invoke();
			}
		} catch (Throwable t) {
			t.printStackTrace();
			forwardTo = "error";
		}
		return forwardTo;
	}

	public void destroy() {
		System.out.println("Destroying LoginAuthenticationInterceptor...");
	}

	public void init() {
		System.out.println("Initializing LoginAuthenticationInterceptor...");
	}

}
