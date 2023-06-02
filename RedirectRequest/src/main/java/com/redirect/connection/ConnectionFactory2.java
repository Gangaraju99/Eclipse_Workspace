package com.redirect.connection;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory2 {

	private static DataSource datasource = null;

	public static Connection getConnection() throws Exception {
		if (datasource == null) {
			File file = new File("C:\\Users\\18dam\\eclipse-workspace\\RedirectRequest\\src\\main\\webapp\\db.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties p = new Properties();
			p.load(fis);

			String url = p.getProperty("db.url");
			String uname = p.getProperty("db.username");
			String pwd = p.getProperty("db.pwd");
			String driver = p.getProperty("db.driver");

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
