package com.oracle.system;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveImage {
	private final static String url ="jdbc:oracle:thin:@localhost:1521/XE";
    private final static String host = "system";
	private final static String pwd ="141199";
	private static final String query = " select * from image";
	public static void main(String[] args) throws Exception {
		
		Connection con = DriverManager.getConnection(url,host,pwd);
		Statement cstmt = con.createStatement();
		ResultSet rs = cstmt.executeQuery(query);
	
		 
		//If you have to write primitive values into a file, use FileOutputStream class. You can write byte-oriented
		 FileOutputStream fos = new FileOutputStream("D:\\JDBC\\kushi.mp3");
		 
		 
		 if(rs.next()) {

		   fos.write(rs.getBytes(1));
		   System.out.println("success");
		 }else {
			 System.out.println("unsuccess");
		 }
		 fos.close();
		 con.close();
	
	}
}
