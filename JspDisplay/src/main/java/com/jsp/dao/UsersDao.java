package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.connection.ConnectionFactory;
import com.jsp.dto.DisplayDto;

public class UsersDao {

	private static final String insert = " insert into display values(?,?,?)";
	private static final String select = " select * from display";
	private static final String DELETE_QUERY =" delete from display where email=?";
	private static final String UPDATE_QUERY = "update display set email=?,phone=? where name=?";

	public boolean insert(DisplayDto dto) throws Exception {

		Connection connection = ConnectionFactory.getConnection();

		PreparedStatement pstmt = connection.prepareStatement(insert);

		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getEmail());
		pstmt.setInt(3, dto.getPhone());
		int count = pstmt.executeUpdate();
		return count > 0;

	}

	public List<DisplayDto> showDetails() throws Exception {

		Connection con = ConnectionFactory.getConnection();

		Statement cstmt = con.createStatement();
		ResultSet rs = cstmt.executeQuery(select);
		DisplayDto dto = new DisplayDto();
		List<DisplayDto> employee = new ArrayList<>();
		while (rs.next()) {
			dto = new DisplayDto();
			dto.setName(rs.getString(1));
			dto.setEmail(rs.getString(2));
			dto.setPhone(rs.getInt(3));
			employee.add(dto);
		}
	return employee;
	}


public boolean deleteUser(DisplayDto dto) throws Exception{
	
	Connection con = ConnectionFactory.getConnection();
	PreparedStatement pstmt2 = con.prepareStatement(DELETE_QUERY);
	pstmt2.setString(1, dto.getEmail());
	int count = pstmt2.executeUpdate();
	return count>0;
}





}
