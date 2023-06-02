package com.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\serialize.txt");
		
		ObjectInputStream inputStream = new ObjectInputStream(fis);
		
		Employee newEmp = 	(Employee) inputStream.readObject();
		 fis.close();
		 inputStream.close();
		 
		 System.out.println(newEmp);
		
		
	}

}


