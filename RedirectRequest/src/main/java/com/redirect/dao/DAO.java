package com.redirect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.redirect.connection.ConnectionFactory2;
import com.redirect.dto.RedirectDTO;

public class DAO {

	private static final String login_query = " select * from course where email = ? and password =?";

	public String user(RedirectDTO dto) throws Exception {

		Connection connection = ConnectionFactory2.getConnection();

		PreparedStatement pstmt2 = connection.prepareStatement(login_query);

		pstmt2.setString(1, dto.getEmail());
		pstmt2.setString(2, dto.getPassword());
		ResultSet rs = pstmt2.executeQuery();

		// modify the logic
		String role = "other";
		while (rs.next()) {
			System.out.println(rs.getString(2));
			if (rs.getString(6).equals(dto.getPassword()) && rs.getString(5).equals(dto.getEmail())) {
				role = (rs.getString(7));

			}
		}

		return role;
	}

	

}
