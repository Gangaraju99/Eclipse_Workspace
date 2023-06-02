package Project1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/msgServlet")
public class BookDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String bookid = req.getParameter("bookid");
		String bookname = req.getParameter("bookname");
		String bookprice = req.getParameter("bookprice");
		
		System.out.println(bookid);
		System.out.println(bookname);
		
		
		
	}

	
}
