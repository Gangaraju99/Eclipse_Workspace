package com.read.properties;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {


	
	private static DataSource datasource = null;
	
	
	static {
		
	try {
		
		File f = new File("");
		FileInputStream fis = new FileInputStream (f);
		 
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		String uname = p.getProperty("username");
		String upwd = p.getProperty("password");
		String poolsize = p.getProperty("poolsize");

		
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl(url);
		config.setUsername(uname);
		config.setPassword(upwd);
		config.setMaximumPoolSize(Integer.parseInt(poolsize));
		
		datasource  = new HikariDataSource(config);
		
	}
	
	catch(Exception e) {
		e.printStackTrace();
	} 
	
}
	
	
	public static Connection getDbConnection()throws Exception{
		return datasource.getConnection();
	}



}
