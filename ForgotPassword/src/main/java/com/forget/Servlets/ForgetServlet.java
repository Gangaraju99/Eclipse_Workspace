package com.forget.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.forget.ConnectionPool.ConnectionPool;
import com.forget.Dao.ForgetDAO;
import com.forget.dto.ForgetDTO;

@WebServlet("/ForgetServlet")
public class ForgetServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			ForgetDTO dto = new ForgetDTO();

			String mailid = request.getParameter("email");
			dto.setEmail(mailid);

			String mail = null;

			mail = (ForgetDAO.forget(dto).getEmail());

			if (mail.equals(dto.getEmail())) {
				HttpSession session = request.getSession();
				session.setAttribute("usermail", mail);

				response.setContentType("text/html");
				request.getRequestDispatcher("Reset.jsp").forward(request, response);

			} else {
				PrintWriter pw = response.getWriter();
				pw.append("<h1>  Invalid email id</h1>");
				response.setContentType("text/html");
				request.getRequestDispatcher("Forgetpwd.jsp").include(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
