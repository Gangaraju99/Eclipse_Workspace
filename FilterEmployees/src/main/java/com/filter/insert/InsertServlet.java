package com.filter.insert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.filter.dao.EmployeeDao;
import com.filter.dto.FilterDto;


@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			try {

				FilterDto dto = new FilterDto();
				dto.setName(request.getParameter("Name"));

				dto.setEmail(request.getParameter("email"));
				dto.setGender(request.getParameter("Gender"));
                dto.setDept(request.getParameter("Dept"));
				dto.setEmpExperience(Integer.parseInt(request.getParameter("Experience")));

				EmployeeDao dao =  new EmployeeDao();
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
		        RequestDispatcher reqdis = request. getRequestDispatcher("Insert.jsp");
		        reqdis.include(request, response);
			} catch (Exception e) {	
				e.printStackTrace();
			}
	  
		}



}
