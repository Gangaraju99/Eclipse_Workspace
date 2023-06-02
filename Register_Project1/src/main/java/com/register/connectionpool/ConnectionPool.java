package com.register.connectionpool;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPool {

	private static HikariDataSource datasource = null;

	public static Connection getConnection() throws Exception {
		if (datasource == null) {
			File file = new File("C:\\Users\\18dam\\eclipse-workspace\\Register_Project1\\src\\data.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties p = new Properties();
			p.load(fis);

			String url = p.getProperty("data.url");
			String uname = p.getProperty("data.username");
			String pwd = p.getProperty("data.pwd");
			String driver = p.getProperty("data.driver");

			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(url);
			config.setUsername(uname);
			config.setPassword(pwd);
			config.setDriverClassName(driver);

			datasource = new HikariDataSource(config);
		}
		return datasource.getConnection();
	}

}
