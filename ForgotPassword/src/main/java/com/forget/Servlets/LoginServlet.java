package com.forget.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.forget.Dao.ForgetDAO;
import com.forget.dto.ForgetDTO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			ForgetDTO dto = new ForgetDTO();

			dto.setEmail(request.getParameter("email"));
			dto.setPassword(request.getParameter("pwd"));

			boolean status = ForgetDAO.login(dto);
			String message = "";
			if (status) {

				String saveMail = dto.getEmail();

				HttpSession session = request.getSession();
				session.setAttribute("usermail", saveMail);
				// sending data from login servlet to address servlet

				// request.setAttribute("email", saveMail);
				request.getRequestDispatcher("Dashboard.jsp").forward(request, response);

			} else {
				message = "Login failed";
			}
			PrintWriter pw = response.getWriter();
			pw.append(message);
			response.setContentType("text/html");
			request.getRequestDispatcher("Login.jsp").include(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
