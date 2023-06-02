package com.jsp.delete.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UsersDao;
import com.jsp.dto.DisplayDto;
@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet  extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	
		
		try {
			
		DisplayDto dto = new DisplayDto();
		 dto.setEmail(request.getParameter("email"));
		 
		 UsersDao dao = new UsersDao();
		 boolean status= dao.deleteUser(dto);
		 String result = null;
		 if(status) {
			 result = "You deleted the one user";
		 }else {
			 result=" Not deleted the user details";
		 }
		 
		 request.setAttribute("status", result);
		 request.getRequestDispatcher("details.jsp");
		 
		}catch(Exception e) {
			e.printStackTrace();
		}
		

}
}