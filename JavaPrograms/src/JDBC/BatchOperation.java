package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchOperation {
	final static String url = "jdbc:mysql://localhost:3306/raju";
	final static String user_host = "root";
	final static String pwd = "141199";

	public static void main(String[] args) throws Exception{
		
		Connection con = DriverManager.getConnection(url,user_host,pwd);
		Statement stmt = con.createStatement();
		
		stmt.addBatch("insert into books values(6,'HTML',799.00)");
		
		stmt.addBatch("insert into books values(7,'JAVASCRIPT',999.00)");

		stmt.addBatch("insert into books values(8,'CSS',899.00)");


		int[] count = stmt.executeBatch();
		
		System.out.println("Records effected::"+ count.length);
		con.close();
		System.out.println("Execution Completed");
		
		
		
		
		
		
		
	}
	
}
