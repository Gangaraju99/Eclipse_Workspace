package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProcedureIn {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private static final String  procedure = "call getBook(?)";
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter book id");
		int bookId = sc.nextInt();
		Connection con = DriverManager.getConnection(url,user_host,pwd);
		CallableStatement cstmt = con.prepareCall(procedure);
		cstmt.setInt(1, bookId);
		ResultSet rs = cstmt.executeQuery();
		 while (rs.next()) {
			 System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getDouble(3));
			 
		 }
		
		con.close();
	}
}
