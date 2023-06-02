package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Increment {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private static final String update = " Update  hike set empsalary = ((empsalary *?) /100 )where empdept =? " ;
	private static final String select = " select * from hike";
public static void main(String[] args)throws Exception {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter hike for hr");
	Double hrHike = sc.nextDouble();
	
	System.out.println("Enter security hike");
	double securityHike = sc.nextDouble();
	
	System.out.println("Enter developers hike");
	double developersHike = sc.nextDouble();
	
	Connection con = DriverManager.getConnection(url, user_host, pwd);
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(select);
	PreparedStatement pstmt = con.prepareStatement(update);
	
	pstmt.setDouble(1, hrHike);
	pstmt.setString(2, "HR");
	pstmt.executeUpdate();
	
	
	pstmt.setDouble(1,securityHike);
	pstmt.setString(2, "secutiy");
	pstmt.executeUpdate();
	
	
	pstmt.setDouble(1, developersHike);
	pstmt.setString(2, "developers");
	pstmt.executeUpdate();
	
	
		
	System.out.println("update completed");
	con.close();
	
	
	
}

}
