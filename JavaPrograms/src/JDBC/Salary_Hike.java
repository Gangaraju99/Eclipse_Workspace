package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Salary_Hike {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private static String select = " select * from hike";
	private static String update = " Update hike set empsalary =? Where empid =?";
    
	public static void main(String[] args) throws Exception {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter emp hike");
	double hike = sc.nextDouble();

	Connection con = DriverManager.getConnection(url, user_host, pwd);
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(select);
	PreparedStatement pstmt = con.prepareStatement(update);
	
	while (rs.next()) {
		int empId = rs.getInt("empid");
		double existingSal = rs.getDouble("empsalary");
		double newSal = existingSal + (existingSal * hike)/100 ;
		pstmt.setDouble(1, newSal);
		pstmt.setInt(2, empId);
		pstmt.executeUpdate();
	}
	System.out.println(" update completed........");
	con.close();
	
	
	
	
	
	
}

}
