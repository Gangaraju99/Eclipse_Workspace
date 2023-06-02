package com.forget.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.forget.ConnectionPool.ConnectionPool;
import com.forget.Dao.ForgetDAO;
import com.forget.dto.ForgetDTO;

@WebServlet("/ResetServlet")
public class ResetServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			ForgetDTO dto = new ForgetDTO();

			dto.setEmail(request.getParameter("email"));
			dto.setPassword(request.getParameter("pwd"));
			dto.setConfirmPassword(request.getParameter("confirmPwd"));

			boolean status = ForgetDAO.reset(dto);

			if (status) {

				PrintWriter pw = response.getWriter();
				pw.append("<h1> Your password has  changed successfully</h1>");
				response.setContentType("text/html");
				request.getRequestDispatcher("Reset.jsp").include(request, response);

			} else {
				PrintWriter pw = response.getWriter();
				pw.append("<h1>Passwords are mismatched</h1>");
				response.setContentType("text/html");
				request.getRequestDispatcher("Reset.jsp").include(request, response);

			}

			boolean register = ForgetDAO.register(dto);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
