package com.flipkart.phantom.http.impl;

public class ConfigServiceException extends Exception {

	/**
	 * Error code
	 */

	private String errCode;

	/**
	 * Error message
	 */
	private String msg;

	public ConfigServiceException(String errCode, String msg) {

		this.errCode = errCode;
		this.msg = msg;
	}

}
