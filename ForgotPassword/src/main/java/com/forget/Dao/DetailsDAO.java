package com.forget.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.forget.ConnectionPool.ConnectionPool;
import com.forget.dto.ForgetDTO;

public class DetailsDAO {

	private static final String ADDRESS_QUERY = " INSERT INTO ADDRESS (CITY,STATE,COUNTRY,EMAIL) VALUES(?,?,?,?)";
	private static final String EDUCATION_QUERY = " INSERT INTO EDUCATION (HighestQualification,PassedOutYear,percentageInHighestQualification,EMAIL) VALUES(?,?,?,?)";
	private static final String FAMILY_QUERY = " INSERT INTO FAMILY (FatherName,MotherName,NoOfSiblings,EMAIL) VALUES(?,?,?,?)";

	public static boolean address(ForgetDTO dto) throws Exception {

		Connection con1 = ConnectionPool.getConnection();

		PreparedStatement pstmt1 = con1.prepareStatement(ADDRESS_QUERY);

		pstmt1.setString(1, dto.getCity());
		pstmt1.setString(2, dto.getState());
		pstmt1.setString(3, dto.getCountry());
		pstmt1.setString(4, dto.getEmail());

		int count1 = pstmt1.executeUpdate();

		return count1 > 0;

	
	}

	public static boolean education (ForgetDTO dto) throws Exception{
		
		Connection con2 = ConnectionPool.getConnection();
		PreparedStatement pstmt2 = con2.prepareStatement(EDUCATION_QUERY);
		
		pstmt2.setString(1,dto.getHighestQualification());
		pstmt2.setInt(2, dto.getPassoutYear());
		pstmt2.setDouble(3, dto.getPercentageInHighestQualification());
		pstmt2.setString(4, dto.getEmail());
		
		int count2 = pstmt2.executeUpdate();
		return count2>0;
	}


	public static boolean family(ForgetDTO dto) throws Exception{
		
		
		Connection con3 = ConnectionPool.getConnection();
		PreparedStatement pstmt3 = con3.prepareStatement(FAMILY_QUERY);
		
		pstmt3.setString(1,dto.getFatherName());
		pstmt3.setString(2, dto.getMotherName());
		pstmt3.setInt(3, dto.getNoOfSiblings());
		pstmt3.setString(4, dto.getEmail());
		
		int count3 = pstmt3.executeUpdate();
		return count3>0;
		
	}
		
		
		
	}













