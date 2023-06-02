package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingData {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private static final String insert = " insert into assignment values (?,?,?,?,?,?,?) ";
public static void main(String[] args) throws SQLException {
		
	Connection con = DriverManager.getConnection(url,user_host,pwd);
	//Statement stmt = con.createStatement();
	PreparedStatement pstmt = con.prepareStatement(insert);
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter emp id");
	int empid = Integer.parseInt(sc.nextLine());
	
	System.out.println("Enter emp name");
	String empname =  sc.nextLine();
	
	System.out.println("Enter emp salary ");
	double empsal = Double.parseDouble(sc.nextLine());
	
	System.out.println("Enter employee gender");
	String empGender = sc.nextLine();
	
	System.out.println("Enter emp department");
   String empdept = sc.nextLine();
   
   System.out.println("Enter work location");
   String workloc = sc.nextLine();
   
   System.out.println("Enter joining data");
   String date = sc.nextLine();
   
   
  
   pstmt.setInt(1,empid);
   pstmt.setString(2,empname);
   pstmt.setDouble(3, empsal);
   pstmt.setString(4, empGender);
   pstmt.setString(5, empdept);
   pstmt.setString(6,workloc);
   pstmt.setString(7,date);
   
   System.out.println("inserted successfully");
   int count = pstmt.executeUpdate();
   con.close();
}
}
