package com.dto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.datatransfer.DTO;
import com.dto.jdbc.Jdbc;

@WebServlet("/DtoServlet")
public class DtoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// capture data from the form

		try {
			int bookid = Integer.parseInt(req.getParameter("bookid"));
			String bknm = req.getParameter("bookname");
			double bookprice = Double.parseDouble(req.getParameter("bookprice"));

			DTO dto = new DTO();
			dto.setBookId(bookid);
			dto.setBookName(bknm);
			dto.setBookPrice(bookprice);

			// call dao method

			Jdbc jc = new Jdbc();
			boolean flag = jc.insert(dto);

			// send response to client

			String response = null;

			if (flag) {
				response = " your data is successfully inserted";

			} else {
				response = " your data insertion is failed";
			}
			PrintWriter pw = resp.getWriter();
			pw.append(response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}