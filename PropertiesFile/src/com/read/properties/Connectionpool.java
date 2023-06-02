package com.read.properties;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connectionpool {

	
	public static void main(String[] args)  throws Exception{
		
		Connection dbConnection = ConnectionFactory.getDbConnection();
		String sql = " select * from good";
		 Statement cstmt = dbConnection.createStatement();
		   ResultSet rs = cstmt.executeQuery(sql);
		   
		   while(rs.next()) {
			   System.out.println();
		   }
		rs.close();
		cstmt.close();
		dbConnection.close();
	}
}
