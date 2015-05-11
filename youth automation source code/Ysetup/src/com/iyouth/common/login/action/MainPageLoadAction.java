package com.iyouth.common.login.action;

import org.apache.log4j.Logger;

import com.iyouth.common.action.BaseAction;
import com.opensymphony.xwork2.Action;


public class MainPageLoadAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(MainPageLoadAction.class);
	private String reqPage;

	
	public String loadMainPageAction() {
		logger.info("Enter in MainPageLoadAction");
		
		return Action.SUCCESS;
	}

	
	public String pageFlowAction() {
		logger.info("Enter in pageFlowAction");
		System.out.println("pageFlowAction::::+reqPage>>>>"+reqPage);
		
		return reqPage;
	}


	/**
	 * @return the reqPage
	 */
	public String getReqPage() {
		return reqPage;
	}


	/**
	 * @param reqPage the reqPage to set
	 */
	public void setReqPage(String reqPage) {
		this.reqPage = reqPage;
	}
	
}
