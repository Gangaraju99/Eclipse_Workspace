package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Salary_Hike2 {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private static String select = " select * from hike";
	
	public static void main(String[] args) throws Exception{

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter emp hike");
    double hike = sc.nextDouble();
    
    Connection con = DriverManager.getConnection(url,user_host,pwd);
    
    String updatesql = " Update hike set empsalary = empsalary +(empsalary * ?) /100";
    
    PreparedStatement pstmt = con.prepareStatement(updatesql);
    pstmt.setDouble(1, hike);
    
    pstmt.executeUpdate();
    
    System.out.println("update completed.......");
    con.close();
	}

}
