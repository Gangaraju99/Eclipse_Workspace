package com.file;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\18dam\\eclipse-workspace\\FileHandling\\Practice.txt");
		
		if(f.delete()) {
			System.out.println("i have deleted:"+ f.getName());
		}else {
			System.out.println("problem occured");
		}
		
		
		
		
	}

}
