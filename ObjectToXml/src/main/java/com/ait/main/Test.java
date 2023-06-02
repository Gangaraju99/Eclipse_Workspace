package com.ait.main;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import com.ait.entity.Employee;

public class Test {

	public static void main(String[] args) throws Exception {

		
		/*
		Employee e = new Employee();

		e.setEmpid(110);
		e.setEmpname("Ravi");
		e.setSalary(2300.00);

		// convert the object to XML and write it to a file
		try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("D:\\imp\\file.xml")))) {
			encoder.writeObject(e);
			System.out.println("data is inserted into the file");
		} catch (IOException k) {
			k.printStackTrace();

		}
		*/
		
		  // read the XML file and convert it back into a Java object
		 
		  try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new
		  FileInputStream("D:\\imp\\file.xml")))) { 
			  Employee e= (Employee)
		        decoder.readObject();
			    System.out.println(e.toString()); 
			  } catch (IOException e) {
				  e.printStackTrace(); 
				  }
		 
	}

}
