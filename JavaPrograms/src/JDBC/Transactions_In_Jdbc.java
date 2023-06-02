package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Transactions_In_Jdbc {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/raju";

	private static final String DB_UNAME = "root";

	private static final String DB_PWD = "141199";
	
	
	private static final String insert1 = " insert into  employees values(?,?,?,?,?,?)" ;
	
	private static final String insert2 = " insert into  good values(?,?,?,?,?,?)" ;

	
	public static void main(String[] args) throws Exception {
		
		Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
	
		// By Default conn - autoCommit is true
		
		con.setAutoCommit(false);
	try {
		PreparedStatement pstmt = con.prepareStatement(insert1);
		
		pstmt.setInt(1,9);
		pstmt.setString(2, "mary");
		pstmt.setString(3, "abcd@gmail.com");
		pstmt.setInt(4, 896532417);
		pstmt.setInt(5,5698);
		
		pstmt.executeUpdate();
	
		pstmt = con.prepareStatement(insert2);
		pstmt.setInt(1,122);
		pstmt.setString(2, "cherry");
		pstmt.setDouble(3, 19000.0);
		pstmt.setString(4, "maths");
		pstmt.setString(5,"female");
		pstmt.setString(6,"Paderu");
		
		pstmt.executeUpdate();
		
		con.commit();
		System.out.println("Records inserted");
	
	
	} catch (Exception e) {
		System.out.println(" Transcation rolled back..");
		con.rollback();
	}
	con.close();
	
	
	
	
	
	}
		
}
