package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProcedureCall {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private static final String procedure = " call getBooksData() ";
	public static void main(String[] args)  throws Exception{
		Connection con = DriverManager.getConnection(url,user_host,pwd);
		
		CallableStatement cstmt = con.prepareCall(procedure);
		ResultSet rs = cstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"--"+rs.getString(2));
		}
		con.close();
		
	}

}
