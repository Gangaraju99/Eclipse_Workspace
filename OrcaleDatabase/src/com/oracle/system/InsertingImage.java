-package com.oracle.system;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertingImage {
	final static String url ="jdbc:oracle:thin:@localhost:1521/XE";
	final static String host = "system";
	final static String pwd ="141199";

	public static void main(String[] args) throws Exception {
		
		Connection con = DriverManager.getConnection(url,host,pwd);
		// Give the path of the file
		File file = new File ("C:\\Users\\18dam\\Downloads\\song.MP3");
		
		// Convert into binary format(blob)
		FileInputStream fis = new FileInputStream(file);
		
		String sql = " insert into image values (?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString (1, "song");
		pstmt.setBlob(2, fis);
		
		int count = pstmt.executeUpdate();
		
		System.out.println(" rows effected:"+ count);
		
		
		
		
	}
	
	
	
	
}
