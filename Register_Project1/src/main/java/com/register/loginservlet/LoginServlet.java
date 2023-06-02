package com.register.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.dao.RegisterDao;
import com.register.dto.RegisterDTO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String email = req.getParameter("email");
			System.out.println(email);
			String password = req.getParameter("password");

			RegisterDTO dto = new RegisterDTO();
			dto.setEmail(email);
			dto.setPassword(password);

			// call dao method by giving form d
			RegisterDao dao = new RegisterDao();
			boolean status = dao.userlogin(dto);

			// send response to client

			String loginresponse = null;

			if (status) {
				loginresponse = "Login successfully";
            		
			} else {
				loginresponse = " login is failed";
			}

			PrintWriter pw = resp.getWriter();
			pw.append(loginresponse );
		
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
