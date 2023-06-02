package jar.files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;

public class software {

	 private static final String DB_URL = "jdbc:mysql://localhost:3306/raju";
	 
	 private static final String DB_UNAME ="root";
	 private static final String DB_PWD ="141199";
	 final static String  query = " select * from good ";
	 public static void main (String[] args) throws Exception{
		 

		 // step -1: load driver
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 //step-2: Get Connection 
		 Connection con =DriverManager.getConnection( DB_URL,DB_UNAME,DB_PWD);
		 //step-3: Create statement
		 Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		 //step-4: Execute Query
		 ResultSet rs =stmt.executeQuery(query);
		 //step-5: Process Result
		 Fetchsize(3);
		//System.out.println(rs);
		//step-6: Close Connection
		con.close();
	 }
	
	
}
