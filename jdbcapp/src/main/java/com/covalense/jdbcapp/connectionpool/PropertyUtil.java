package com.covalense.jdbcapp.connectionpool;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
	
	private static PropertyUtil propUtil=null;
	private Properties properties=null;
	
	
	private PropertyUtil() throws Exception {
		properties=new Properties();
		properties.load(new FileInputStream("ConnectionDetails.properties" ));
	}
	
	public static PropertyUtil getPropertyUtil() throws Exception {
		if(propUtil==null) {
			return new PropertyUtil();
		}
		return propUtil;
	}
	
	public String getProperty(String key) {
	return properties.getProperty(key);
	}
}
