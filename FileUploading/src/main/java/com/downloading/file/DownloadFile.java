package com.downloading.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uploading.dao.Filedao;

@WebServlet("/DownloadFile")
public class DownloadFile extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		Filedao filedao = new Filedao();
		ResultSet result =filedao.download();
		String text ="";
		while(result.next()) {
			Blob blob =result.getBlob(2);
			byte [] bytedata = blob.getBytes(1, (int) blob.length());
	        text = new String(bytedata);
		
		}

		FileOutputStream fis = new FileOutputStream (text);

		
		
		
		PrintWriter pw = response.getWriter();
        response.setContentType("text/plain");
        
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
