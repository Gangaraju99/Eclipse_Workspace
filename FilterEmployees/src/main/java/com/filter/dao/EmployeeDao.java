package com.filter.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.filter.connectionpool.ConnectionFactory;
import com.filter.dto.FilterDto;

public class EmployeeDao {
	private static final String INSERT_QUERY = "insert into filter(empName,empEmail,Gender,Dept,Experience) values(?,?,?,?,?)";

	public static List<FilterDto> filterEmployees(FilterDto dto) throws Exception {

		Connection con1 = ConnectionFactory.getConnection();

		StringBuilder filter_Query = new StringBuilder("select * from filter Where 1=1");

		if (dto.getDept() != null && !dto.getDept().equalsIgnoreCase("null")) {
			filter_Query.append(" AND Dept = ?");
		}
		if (dto.getGender() != null && !dto.getGender().equalsIgnoreCase("null")) {
			filter_Query.append(" AND Gender =?");
		}
		if (dto.getEmpExperience() != 0) {
			filter_Query.append(" AND Experience =? ");
		}

		PreparedStatement pstmt = con1.prepareStatement(filter_Query.toString());

		int index = 1;

		if (dto.getDept() != null && !dto.getDept().equalsIgnoreCase("null")) {
			pstmt.setString(index, dto.getDept());
			index++;
		}
		if (dto.getGender() != null && !dto.getGender().equalsIgnoreCase("null")) {
			pstmt.setString(index, dto.getGender());
			index++;
		}
		if (dto.getEmpExperience() != 0) {
			pstmt.setDouble(index, dto.getEmpExperience());
			index++;
		}

		ResultSet rs = pstmt.executeQuery();
		List<FilterDto> employees = new ArrayList<>();
		FilterDto dto3 ;
		while (rs.next()) {

			dto3= new FilterDto();
			dto3.setId(rs.getInt(1));
        	dto3.setName(rs.getString(2));
			dto3.setEmail(rs.getString(3));
			dto3.setDept(rs.getString(4));
			dto3.setGender(rs.getString(5));
			dto3.setEmpExperience(rs.getInt(6));
			employees.add(dto3);

		}
		return employees;
	}

	public boolean insert(FilterDto dto) throws Exception {

		Connection con2 = ConnectionFactory.getConnection();

		PreparedStatement pstmt2 = con2.prepareStatement(INSERT_QUERY);

		FilterDto dto1 = new FilterDto();
		pstmt2.setString(1, dto.getName());
		pstmt2.setString(2, dto.getEmail());
		pstmt2.setString(3, dto.getGender());
		pstmt2.setString(4, dto.getDept());
		pstmt2.setDouble(5, dto.getEmpExperience());

		int count = pstmt2.executeUpdate();

		return count > 0;

	}

}
