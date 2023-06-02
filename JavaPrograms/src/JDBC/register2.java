package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class Registration{
	
	 
	 final static String url = "jdbc:mysql://localhost:3306/raju";
		final static String user_host = "root";
		final static String pwd = "141199";
		

	public  static void userDetails() throws Exception{
		 Scanner sc = new Scanner (System.in);
		System.out.println("Enter your details for registration");
		System.out.println("Employee id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter your name");
        String username = sc.nextLine();
		System.out.println("Enter your email");
		String email = sc.nextLine();
		System.out.println("enter your mobile number");
		String mobileNumber =sc.nextLine();
		System.out.println("enter your password");
		String password = sc.nextLine();
		System.out.println("please re enter your password");
		String confirmPwd = sc.nextLine();
		// step-1 : load the driver class
	   Class.forName("com.mysql.cj.jdbc.Driver");
		// step-2 : get the connection
	Connection con1 = DriverManager.getConnection(url, user_host, pwd);
		// step-3: create statement

		String adding = "insert into  good values('" + id + "','" + username + "','" + email + "','" + mobileNumber
				+ "','" + password + "')";
		Statement stmt1 = con1.createStatement();
		// step-4: Execute the query
		int rowsEffected = stmt1.executeUpdate(adding);
		// step-5: result
		System.out.println("rowsEffected:" + rowsEffected);
      System.out.println("do you want ot login 1, or 2");
      int b = sc.nextInt();
      if(b==1) {
    	  Submit.loginUser();
      }else {
    	  System.out.println("thank u for registration");
      }
	}
}
 class Submit{
	
		final static  String url = "jdbc:mysql://localhost:3306/raju";
		final static String user_host = "root";
		final static String pwd = "141199";

	 public  static void loginUser() throws ClassNotFoundException, SQLException {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter Your email address");
			String input1 = sc.nextLine();

			System.out.println("Enter Your Password");
			String input2 = sc.nextLine();
			// step-1 : load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 : get the connection
			Connection con2 = DriverManager.getConnection(url, user_host, pwd);
			String retrieve = "select * from   good where email = ?";
		//	String retrieve2 = "select * from   good where password = '"+input2+"'";
			// step-3: create statement
			Statement stmt2 = con2.createStatement();
			// step-4: Execute the query
			ResultSet rs = stmt2.executeQuery(retrieve);
			
			
			if (rs.next() ) {
				
				if(rs.getString("password").equals(input2)) {

				System.out.println("you are successfully login ");
				}else {
					System.out.println("invalid password");
				}
			}
			 else {
				System.out.println("invalid emial id");
			}

		}
	 }
 







public class register2 {
	public static void main(String[] args)  throws Exception {

		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.println("Please Enter 1 for registration or 2 for login");
		
		
		int register = sc.nextInt();
		if(register ==1) {
			 Registration.userDetails();
		}else {
			Submit.loginUser();
		}
			
			
		
		
	
		
	
	}
}
