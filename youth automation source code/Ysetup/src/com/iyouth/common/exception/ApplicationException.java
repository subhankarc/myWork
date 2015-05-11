package com.iyouth.common.exception;

import org.apache.log4j.Logger;

public class ApplicationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6993280861585561723L;
	private static Logger logger = Logger.getLogger(ApplicationException.class);

	public ApplicationException(String msg) {
		super(msg);
		logger.error(msg, this);
	}

	public ApplicationException(String msg, Throwable t) {
		super(msg, t);
		logger.error(msg, this);
	}

}
