package com.dto.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dto.connection.ConnectionFactory1;
import com.dto.datatransfer.DTO;

public class Jdbc {

	private static final String query = " insert into bookData values(?,?,?)";

	public boolean insert(DTO dto) throws Exception {

		Connection con = ConnectionFactory1.getConnection();

		PreparedStatement pstmt = con.prepareStatement(query);

		pstmt.setInt(1, dto.getBookId());
		pstmt.setString(2, dto.getBookName());
		pstmt.setDouble(3, dto.getBookPrice());

		int count = pstmt.executeUpdate();
		return count > 0;
	}

}
