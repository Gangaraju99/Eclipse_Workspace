package com.uploading.dao;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.uploading.connection.Factory;


public class Filedao {

	private static final String get =" select * from file";
	private static final String sql = " insert into file values (?,?)";

	public boolean fileInsertion(InputStream input)throws Exception {
		
		Connection con = Factory.getConnection();
		
			
			// Convert into binary format(blob)
			
		
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString (1, "First");
			pstmt.setBlob(2, input);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(" rows effected:"+ count);
		
			return count >0;
	}


	public ResultSet download() throws Exception{
		
		Connection con = Factory.getConnection();
 
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(get);
		
	     return rs;
		}
		
		
		
	}
		
		

