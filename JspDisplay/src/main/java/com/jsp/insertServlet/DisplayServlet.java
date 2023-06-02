package com.jsp.insertServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UsersDao;
import com.jsp.dto.DisplayDto;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			DisplayDto dto = new DisplayDto();
			dto.setName(request.getParameter("name"));
			dto.setEmail(request.getParameter("email"));
			dto.setPhone(Integer.parseInt(request.getParameter("phone")));
			UsersDao dao = new UsersDao();
			boolean flag = dao.insert(dto);
			String message = null;
			if(flag) {
			 message = " Data insertion is success";

			}else {
				message =" Insertion is failed";
			}
			PrintWriter pw = response.getWriter();
			pw.append(message);
			response.setContentType("text/html");
	        RequestDispatcher reqdis = request. getRequestDispatcher("Display.jsp");
	        reqdis.include(request, response);
		} catch (Exception e) {	
			e.printStackTrace();
		}
  
	}

}
