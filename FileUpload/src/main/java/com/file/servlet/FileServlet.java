package com.file.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.file.dao.FileDao;
@WebServlet("upload")
@MultipartConfig
public class FileServlet  extends HttpServlet{
	
	public void doPost (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		try {
		
		
		// to store or get the file data from the from by using part
		Part part = request.getPart("select");
		//Gets the file name specified by the client and content of that file
		InputStream filecontent = part.getInputStream();
		
		
		
		// send to the dao class
		FileDao fileDao = new FileDao();
		boolean status = fileDao.fileInsertion(filecontent);

        String results = null;
		
		if(status) {
			results = " File upload is success";
		}else {
			results =" File upload is failed";
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
