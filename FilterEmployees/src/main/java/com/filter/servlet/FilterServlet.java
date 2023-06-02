package com.filter.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.filter.dao.EmployeeDao;
import com.filter.dto.FilterDto;
@WebServlet("/FilterServlet")
public class FilterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			FilterDto dto = new FilterDto();
			dto.setDept(request.getParameter("dept"));
			dto.setGender(request.getParameter("r"));
			dto.setEmpExperience(Integer.parseInt(request.getParameter("exp")));
	        
			
		//	EmployeeDao dao = new EmployeeDao();
List<FilterDto> list =	EmployeeDao.filterEmployees(dto);
	request.setAttribute("empdata", list);
	request.getRequestDispatcher("filter.jsp").forward(request, response);
	

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
