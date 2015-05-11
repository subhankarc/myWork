/**
 * 
 */
package com.iyouth.common.action;

/**
 * @author Don2
 *
 */
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
 
public abstract class BaseAction extends ActionSupport  implements SessionAware, ServletRequestAware,ServletResponseAware
{
	            private static Logger logger = Logger.getLogger(BaseAction.class);
                private static final long serialVersionUID = 1L;
                @SuppressWarnings("rawtypes")
				protected Map sessionMap;
                protected HttpServletRequest request;
                protected HttpServletResponse response;
                private String successMessage;
                private String backButton;
               
                
                
                public String getBackButton()
                {
                                return backButton;
                }
 
                public void setBackButton(String backButton)
                {
                                this.backButton = backButton;
                }
                
                public String getSuccessMessage()
                {
                                return successMessage;
                }
 
                public void setSuccessMessage(String successMessage)
                {
                                this.successMessage = successMessage;
                }
 
                public String execute() throws Exception 
                {
                	            logger.debug("inside the base action execute");
                                return "";
                }
 
                public void setSession(Map arg0) {
                                sessionMap = arg0;
                }
                
                public Map getSession() {
                     return sessionMap ;
    }
                //public abstract String perform();
                public void setServletRequest(HttpServletRequest arg0) {
                                request = arg0;
                }
                public void setServletResponse(HttpServletResponse response) {
                                this.response = response;
                }
 
                
               
 
}
