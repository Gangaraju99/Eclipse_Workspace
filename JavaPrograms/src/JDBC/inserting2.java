package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class inserting2 {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private static final String select = " select emp_name from assignment where joining_date between ? and ? ";
    public static void main(String[] args) throws Exception{
    	Connection con = DriverManager.getConnection(url,user_host,pwd);
    	
    	Scanner sc = new Scanner (System.in);
    	System.out.println(" enter join date");
    	String join = sc.nextLine();
    	
    	System.out.println(" enter end date");
    	String end = sc.nextLine();
    	
    	PreparedStatement pstmt = con.prepareStatement(select);
    	
    	pstmt.setString(1, join);
    	pstmt.setString(2, end);
    	
    	ResultSet rs = pstmt.executeQuery();
    	
    	//System.out.println(" retrieve successfully");
    	
    
    	while(rs.next()) {
    	
    	System.out.println(rs.getDouble(3));
    	}

    	con.close();
	
}

}
