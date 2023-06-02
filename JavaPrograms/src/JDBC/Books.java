package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection ;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

import javax.sql.RowSetMetaData;





public class Books {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/raju";

	private static final String DB_UNAME = "root";

	private static final String DB_PWD = "141199";

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Price");
		double price = s.nextDouble();

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		StringBuilder sql = new StringBuilder("SELECT * FROM BOOKS");
		if (price > 0) {
			sql.append(" WHERE BOOK_PRICE <= ?");
		}

		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		if (price > 0) {
			pstmt.setDouble(1, price);
		}

		ResultSet rs = pstmt.executeQuery
				();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getDouble(3));
		}
		
		con.close();

	}

}
