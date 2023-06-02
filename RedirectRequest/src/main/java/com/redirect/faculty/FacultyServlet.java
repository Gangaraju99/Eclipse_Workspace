package com.redirect.faculty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ WebServlet("/ft")
public class FacultyServlet extends HttpServlet {
	
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
			PrintWriter pw = response.getWriter();
			pw.println("<h1>welcome to the faculty dash board page</h1>");
		
		}

		
		
		
}
