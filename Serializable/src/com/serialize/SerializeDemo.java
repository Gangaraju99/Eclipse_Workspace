package com.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
public static void main(String[] args) throws Exception {
	
	Employee e = new Employee(7878,"Allen",5000.0);
	FileOutputStream fos = new FileOutputStream("D:\\serialize.txt");
	
	ObjectOutputStream outputStream = new ObjectOutputStream(fos);
	
	outputStream.writeObject(e);
	System.out.println("object is serialized");
	fos.close();
	outputStream.close();
	
	
	
	
	
	
	
	
	
	
	
}

}
