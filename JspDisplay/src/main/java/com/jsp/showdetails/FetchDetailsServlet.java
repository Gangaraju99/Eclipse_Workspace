package com.jsp.showdetails;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.dao.UsersDao;
import com.jsp.dto.DisplayDto;


@WebServlet("/FetchDetailsServlet")
public class FetchDetailsServlet extends HttpServlet {
	
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	try {
		
		UsersDao dao = new UsersDao();
		List<DisplayDto> data =  dao.showDetails();
		
	//	HttpSession session = request.getSession();
		request.setAttribute("list",data);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Details.jsp");
		requestDispatcher.forward(request, response);
	}catch(Exception e ) {
		e.printStackTrace();
	}
	
	}

	

}
