package second;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Books")
public class Books extends HttpServlet {

 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		String bookId = req.getParameter("bookId ");
		String bookName = req.getParameter("bookName ");
		String bookPrice = req.getParameter("bookPrice ");
		
		
	
		
		
	}

}
