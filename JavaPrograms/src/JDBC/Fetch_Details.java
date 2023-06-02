package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Fetch_Details {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee department");
		String dept = sc.nextLine();
		System.out.println("Enter Employee worklocation ");
		String worklocation = sc.nextLine();
		System.out.println("Enter Employee gender");
		String gender = sc.nextLine();

		StringBuilder sql = new StringBuilder("select * from employee Where 1=1");

		if (dept != null && !dept.equals("null")) {
			sql.append(" AND emp_dept = ?");
		}
		if (worklocation != null && !worklocation.equals("null")) {
			sql.append(" AND work_location =?");
		}
		if (gender != null && !gender.equals("null")) {
			sql.append(" AND emp_gender =? ");
		}

		Connection con = DriverManager.getConnection(url, user_host, pwd);

		PreparedStatement pstmt = con.prepareStatement(sql.toString());

		int index = 1;

		if (dept != null && !dept.equals("null")) {
			pstmt.setString(index, dept);
			index++;
		}
		if (worklocation != null && !worklocation.equals("null")) {
			pstmt.setString(index, worklocation);
			index++;
		}
		if (gender != null && !gender.equals("null")) {
			pstmt.setString(index, gender);
			index++;
		}

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3) + "--" + rs.getNString(4)
					+ "--" + rs.getString(5) + "--" + rs.getString(6));
		}

		con.close();

	}

}
