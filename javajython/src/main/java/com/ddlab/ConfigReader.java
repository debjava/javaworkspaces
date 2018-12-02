package com.ddlab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	private String filePath = null;
	private Properties prop = new Properties();
	
	public ConfigReader(String filePath) {
		this.filePath = filePath;
		loadConfig();
	}
	
	
	private void loadConfig() {
		InputStream inStream = null;
		try {
			inStream = new FileInputStream(filePath);
			prop.load(inStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if( inStream != null )
					inStream.close();
			} catch (Exception e2) {
			}
		}
	}
	
	public String getValue(String key) {
		return prop.getProperty(key);
	}
	
	public static void main(String[] args) {
		ConfigReader reader = new ConfigReader("E:/pink-2014/javajython/config.properties");
		String url = reader.getValue("Dis_URL");
		System.out.println(url);
	}

}
