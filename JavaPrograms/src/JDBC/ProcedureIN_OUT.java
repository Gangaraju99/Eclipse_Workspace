package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class ProcedureIN_OUT {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private final static String procedure = "call getBookNameByPrice(?,?)";
	private static final String Procedure = null;
	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter book price");
		double bookprice = sc.nextDouble();
		
		Connection con = DriverManager.getConnection(url,user_host,pwd);
		
		CallableStatement cstmt = con.prepareCall(Procedure);
		cstmt.setDouble(1, bookprice);
		cstmt.registerOutParameter(2,Types.VARCHAR );
		
		ResultSet rs = cstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		con.close();
	}
}
