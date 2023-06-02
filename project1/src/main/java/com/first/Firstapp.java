package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Firstapp
 */
@WebServlet("/web")
public class Firstapp extends HttpServlet {
       
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String bookId = req.getParameter("bookId ");
		String bookName = req.getParameter("bookName ");
		String bookPrice = req.getParameter("bookPrice ");
		
		System.out.println(bookId);
		System.out.println(bookName);
		System.out.println(bookPrice);
		
		PrintWriter pw = res.getWriter();
		pw.write("form submitted");
		
	}

}
