package com.forget.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.forget.ConnectionPool.ConnectionPool;
import com.forget.dto.ForgetDTO;

public class ForgetDAO {

	public static final String INSERT_QUERY = "INSERT INTO FORGET (FirstName, LastName,Email,Pwd, Gender) values(?,?,?,?,?)";
	public static final String LOGIN_QUERY = "SELECT * FROM FORGET WHERE EMAIL=? AND Pwd= ?";
	public static final String FORGET_QUERY = "SELECT * FROM FORGET WHERE EMAIL =?";
	public static final String RESET_QUERY = " UPDATE FORGET SET Pwd=? WHERE EMAIL=?";

	public static boolean register(ForgetDTO dto) throws Exception {

		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);

		pstmt.setString(1, dto.getFname());
		pstmt.setString(2, dto.getLname());
		pstmt.setString(3, dto.getEmail());
		pstmt.setString(4, dto.getPassword());
		pstmt.setString(5, dto.getGender());

		int count = pstmt.executeUpdate();
		return count > 0;

	}

	public static boolean login(ForgetDTO dto) throws Exception {

		Connection con2 = ConnectionPool.getConnection();
		PreparedStatement pstmt2 = con2.prepareStatement(LOGIN_QUERY);

		pstmt2.setString(1, dto.getEmail());
		pstmt2.setString(2, dto.getPassword());

		ResultSet rs = pstmt2.executeQuery();
		boolean flag = false;
		if (rs.next()) {
			if (rs.getString(4).equals(dto.getEmail()) && rs.getString(5).equals(dto.getPassword())) {

				flag = true;
			} else {
				flag = false;
			}

		}

		return flag;
	}

	public static ForgetDTO forget(ForgetDTO dto) throws Exception {

		Connection con3 = ConnectionPool.getConnection();
		PreparedStatement pstmt3 = con3.prepareStatement(FORGET_QUERY);
		pstmt3.setString(1, dto.getEmail());
		ResultSet rs = pstmt3.executeQuery();
		List<ForgetDTO> list = new ArrayList<>();
		ForgetDTO data = new ForgetDTO();

		while (rs.next()) {
			if (rs.getString(4).equals(dto.getEmail())) {
				data.setEmail(rs.getString(4));

			}
		}

		return data;

	}

	public static boolean reset(ForgetDTO dto) throws Exception {

		Connection con4 = ConnectionPool.getConnection();
		PreparedStatement pstmt4 = con4.prepareStatement(RESET_QUERY);

		pstmt4.setString(1, dto.getPassword());

		pstmt4.setString(2, dto.getEmail());
		int count = pstmt4.executeUpdate();

		return count > 0;
	}

}