package com.insert.details.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.forget.Dao.DetailsDAO;
import com.forget.dto.ForgetDTO;

@WebServlet("/FamilyServlet")
public class FamilyServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			ForgetDTO dto = new ForgetDTO();

			HttpSession session = request.getSession();
			String emailid = (String) session.getAttribute("usermail");

			dto.setEmail(emailid);
			dto.setFatherName(request.getParameter("FatherName"));
			dto.setMotherName(request.getParameter("MotherName"));
			dto.setNoOfSiblings(Integer.parseInt(request.getParameter("Siblings")));

			boolean flag = DetailsDAO.family(dto);

			String message = "";

			if (flag) {
				String status = "submit successfully";
				request.setAttribute("status", status);

				response.setContentType("text/html");
				request.getRequestDispatcher("Family.jsp").forward(request, response);

			} else {
				message = "Submission is failed";

				PrintWriter pw = response.getWriter();
				pw.append(message);
				response.setContentType("text/html");
				request.getRequestDispatcher("Dashboard.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
