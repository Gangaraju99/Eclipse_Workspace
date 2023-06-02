package com.redirect.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.redirect.dao.DAO;
import com.redirect.dto.RedirectDTO;



@WebServlet("/LoginServlet")
public class RedirectServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		try {
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			RedirectDTO  dto = new RedirectDTO ();
			dto.setEmail(email);
			dto.setPassword(password);

			// call dao method by giving form d
	        DAO dao = new DAO();
			String role1 = dao.user(dto);

			// send response to client


			if (role1.equalsIgnoreCase("Student")) {
	        RequestDispatcher reqdis = request. getRequestDispatcher("/st");
	        reqdis.forward(request, response);
	                  		
			} else  if(role1.equalsIgnoreCase("Faculty")) {
		        RequestDispatcher reqdis = request. getRequestDispatcher("/ft");
		        reqdis.forward(request, response);

				
			}else {
				PrintWriter pw = response.getWriter();
				pw.write("<h1><b>Invalid email or password</b></h1>");
				response.setContentType("text/html");
		        RequestDispatcher reqdis = request. getRequestDispatcher("/sign.html");
		        reqdis.include(request, response);
			}

			
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	
	}


