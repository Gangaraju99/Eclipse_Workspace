package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class inserting3 {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";
	private static final String select = " select emp_name from assignment where work_location in ('Hyd' ,'pune') " ;
	public static void main(String[] args)throws Exception {
		Connection con = DriverManager.getConnection(url,user_host,pwd);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(select);
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"---");
		}
		con.close();
	}
}
