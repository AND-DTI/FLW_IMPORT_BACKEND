package com.flw_import.api.configs.history;

import java.util.Map;

import javax.activation.DataSource;
//import javax.xml.crypto.Data;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class AbstractRoutingDataSourceImpl extends AbstractRoutingDataSource {

	private static final ThreadLocal<String> DATABASE_NAME = new ThreadLocal<>(); 
	

	public AbstractRoutingDataSourceImpl(DataSource defaulTargetDataSource, Map<Object, Object> targetDatasources) {
		
		super.setDefaultTargetDataSource(defaulTargetDataSource);
		super.setTargetDataSources(targetDatasources);
		super.afterPropertiesSet();
		
	}
	
	public static void setDatabaseName(String key) {
		DATABASE_NAME.set(key);
	}
	
	public static String getDadabaseName() {
		return DATABASE_NAME.get();
	}
	
	public static void removeDatabaseName() {
		DATABASE_NAME.remove();
	}
	
	
	@Override
	protected Object determineCurrentLookupKey() {
		
		return DATABASE_NAME.get();
		
	}

}
