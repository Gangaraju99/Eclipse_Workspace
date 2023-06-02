package ArrayPractise;

public class ExtendArray {
	public static void main(String[] args) {
		int [] numbers = {1,2,3};
		int [] numbers2 = new int [5];
		numbers2 [3] = 4;
		numbers2 [4] = 5;
		System.arraycopy(numbers,0,numbers2,0,numbers.length);
		for(int str : numbers2) {
			System.out.println(str);
		}
	}

}


package com.wishes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Greetings extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		String greet = null;
		Date date = new Date(0);
		int hour = date.getHours();
		if ((hour >= 6) && (hour < 12)) {
			greet = "good morning";
		} else if (hour >= 12 && hour < 16) {
			greet = "good afternoon";
		} else {
			greet = " good night";
		}

		PrintWriter writer = response.getWriter();
		writer.append("<h1>" + greet + "</h1>");

	}
}