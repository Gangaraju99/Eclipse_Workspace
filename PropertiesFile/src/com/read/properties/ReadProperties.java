package com.read.properties;

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;

	public class ReadProperties {

		public static void main(String[] args)throws Exception {
		
			// The File class is Java’s representation of a file or directory pathname.  
			File f  = new File ("C:\\Users\\18dam\\eclipse-workspace\\PropertiesFile\\src\\db.properties");
			
			//FileInputStream class is useful to read data from a file in the form of sequence of bytes(images,audioes)
			//FileReader reader = new FileReader("db.properties");
			FileInputStream fis = new FileInputStream(f);
		
			//It can be used to get property value based on the property key. The Properties class provides methods to 
			//get data from the properties file and store data into the properties file. 
			Properties p = new Properties();
			p.load(fis);
			System.out.println(p.getProperty("username"));
			System.out.println(p.getProperty("password"));
			System.out.println(p.getProperty("url"));
		
		
		}
	}


