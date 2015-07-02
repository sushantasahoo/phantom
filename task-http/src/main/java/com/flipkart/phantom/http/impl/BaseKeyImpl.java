package com.flipkart.phantom.http.impl;

public class BaseKeyImpl implements Key {

	/**
	 * The project id
	 */
	private String projectId;

	/**
	 * The param name
	 */
	private String paramName;

	public BaseKeyImpl(String projectId, String paramName) {
		super();
		this.projectId = projectId;
		this.paramName = paramName;
	}

	@Override
	public String getKeyString() {
		// Some key generation logic
		String key = projectId + "." + paramName;
		return key;
	}

}
