package com.register.project1;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.dao.RegisterDao;
import com.register.dto.RegisterDTO;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		try {
			// capture form data
			String fname = request.getParameter("firstname");
			String lname = request.getParameter("lastname");
			String email = request.getParameter("email");
			String pwd = request.getParameter("password");
			String gender = request.getParameter("gender");

			RegisterDTO dto = new RegisterDTO();
			dto.setFirstname(fname);
			dto.setLastname(lname);
			dto.setEmail(email);
			dto.setPassword(pwd);
			dto.setGender(gender);

			// call DAO method

			RegisterDao dao = new RegisterDao();
			boolean registrationStatus = dao.registration(dto);

			// send response to the client

			String reply = null;
			if (registrationStatus) {
				reply = "Your registration is successful";
			} else {
				reply = "Your registraion is not completed";
			}

			
			PrintWriter pw = response.getWriter();
			pw.append(reply);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
