package com.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.register.connectionpool.ConnectionPool;
import com.register.dto.RegisterDTO;

public class RegisterDao {

	private static final String register_query = " insert into register values(?,?,?,?)";
	private static final String login_query = "select * from register where email =? and password=?";

	public boolean registration(RegisterDTO dto) throws Exception {
		

		Connection con = ConnectionPool.getConnection();
                                                                                                                                         
		PreparedStatement pstmt = con.prepareStatement(register_query);
		pstmt.setString(1, (dto.getFirstname())); //+ "dto.getLastname()"
		pstmt.setString(2, dto.getEmail());
		pstmt.setString(3, dto.getPassword() );
		pstmt.setString(4, dto.getGender());

		int count = pstmt.executeUpdate();

		return count > 0;

	}

	public boolean userlogin(RegisterDTO dto) throws Exception {

		Connection con = ConnectionPool.getConnection();

		PreparedStatement pstmt2 = con.prepareStatement(login_query);

		pstmt2.setString(1, dto.getEmail());
		pstmt2.setString(2, dto.getPassword());
		ResultSet rs = pstmt2.executeQuery();

		// modify the logic
		boolean flag = true;
		while (rs.next()) {
			System.out.println(rs.getString(2));
			if (rs.getString(3).equals("dto.getPassword()")) {
				flag = true;
			}
		}

		return flag;

	}

}
