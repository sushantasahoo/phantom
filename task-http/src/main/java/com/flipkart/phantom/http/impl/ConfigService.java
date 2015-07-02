package com.flipkart.phantom.http.impl;

import java.util.Map;

public interface ConfigService {
	
	/**
	 * Get config version from external configuration service
	 * @return int config version
	 * @throws ConfigServiceException 
	 */
	public int getConfigVersion(String projectId) throws ConfigServiceException;
	
	
	/**
	 * Returns the max connection configurated value from external configuration service
	 * @return int config value
	 * @throws ConfigServiceException 
	 */
	public int getMaxConnections(String projectId) throws ConfigServiceException;
	
	/**
	 * Returns request queue size for semaphore definition from external configuration service
	 * @throws ConfigServiceException
	 * @return int config value
	 */
    public int getRequestQueueSize(String projectId) throws ConfigServiceException;

    /**
     * Returns the proxy map from external configuration service
     * @throws ConfigServiceException
     * @return Map config value
     */
	public Map<String, String> getProxyMap(String projectId) throws ConfigServiceException;
	
    
    
}
