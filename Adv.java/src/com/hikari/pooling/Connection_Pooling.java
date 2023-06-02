package com.hikari.pooling;

import java.sql.Connection;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;



public class Connection_Pooling {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
 
	public static void main(String[] args)  throws Exception{
		 
		HikariConfig config  = new HikariConfig();
		
		config.setJdbcUrl(url);
		config.setUsername(user_host);
		config.setPassword(pwd);
		
		config.setMaximumPoolSize(20);
		
		config.setMinimumIdle(5);
		
		HikariDataSource datasource = new HikariDataSource(config);
		
		Connection con =datasource.getConnection();
		
		String sql = "insert into books values (202, 'django',4500.00)";
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate(sql);
		
		System.out.println("record inserted....");
		con.close();
		
		
	
		
	}
}
