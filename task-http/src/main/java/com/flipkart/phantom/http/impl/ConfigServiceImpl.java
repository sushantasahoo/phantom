package com.flipkart.phantom.http.impl;

import java.util.HashMap;
import java.util.Map;

public class ConfigServiceImpl implements ConfigService {

	// injectable external service client
	// @autowired
	// SomeExternalService extService;

	/** max number of connections allowed */
	private int maxConnections;

	/** max size of request queue */
	private int requestQueueSize;

	/** The HTTP proxy handler map */
	private Map<String, String> proxyMap = new HashMap<String, String>();

	@Override
	public int getMaxConnections(String projectId) throws ConfigServiceException {
		// TODO Make external configuration service call to get max connection
		// settings
		// Key configKey = buildKey(projectId, configParamName);
		// try{
		// maxConnections = getExtConfigValue(configKey);
		// }catch (Exception e){
		// throw new ConfigServiceException("SomeCode", e.getMessage());
		// }
		return maxConnections;
	}

	@Override
	public int getRequestQueueSize(String projectId) {
		// TODO Make external configuration service call to get max connection
		// settings
		// Key configKey = buildKey(projectId, configParamName);
		// try{
		// requestQueueSize = getExtConfigValue(configKey);
		// }catch (Exception e){
		// throw new ConfigServiceException("SomeCode", e.getMessage());
		// }
		return requestQueueSize;
	}

	@Override
	public Map<String, String> getProxyMap(String projectId) {
		// TODO Make external configuration service call to get max connection
		// settings
		// Key configKey = buildKey(projectId, configParamName);
		// try{
		// proxyMap = getExtConfigValue(configKey);
		// }catch (Exception e){
		// throw new ConfigServiceException("SomeCode", e.getMessage());
		// }
		return proxyMap;
	}

	private String getKey(String projectId, String paramName) {

		Key key = new BaseKeyImpl(projectId, paramName);
		return key.getKeyString();
	}

	private String getExtConfigValue(String configKey) throws Exception{
		String configValue = "";
		// Make external call to the injected client
		// configValue = extService.getConfig(configKey);
		return configValue;
	}

	@Override
	public int getConfigVersion(String projectId) throws ConfigServiceException {
		// TODO Make external call to the injected client
		return 0;
	}

}
