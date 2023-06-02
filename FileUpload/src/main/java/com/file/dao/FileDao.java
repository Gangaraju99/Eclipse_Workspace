package com.file.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.Part;

import com.file.connection.ConnectionFactory;

public class FileDao {
	 private static final String sql = " insert into file values (?,?)";

public boolean fileInsertion(InputStream input) throws Exception {
	
	Connection con = ConnectionFactory.getConnection();
	
		
		// Convert into binary format(blob)
		
	
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString (1, "First");
		pstmt.setBlob(2, input);
		
		int count = pstmt.executeUpdate();
		
		System.out.println(" rows effected:"+ count);
	
		return count >0;
}


	
	}
