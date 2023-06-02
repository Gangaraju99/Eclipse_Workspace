package com.forget.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.forget.Dao.ForgetDAO;
import com.forget.dto.ForgetDTO;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			ForgetDTO dto = new ForgetDTO();

			dto.setFname(request.getParameter("Fname"));
			dto.setLname(request.getParameter("Lname"));
			dto.setEmail(request.getParameter("email"));
			dto.setPassword(request.getParameter("pwd"));
			dto.setGender(request.getParameter("Gender"));

			boolean flag = ForgetDAO.register(dto);
			String message = "";

			if (flag) {
				message = "<b><h1>Registration is successful</h1></b>";
			} else {
				message = "Registration is failed";
			}

			PrintWriter pw = response.getWriter();
			pw.append(message);
			response.setContentType("text/html");
			request.getRequestDispatcher("Register.jsp").include(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
