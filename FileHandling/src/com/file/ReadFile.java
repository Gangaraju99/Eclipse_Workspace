package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\18dam\\eclipse-workspace\\FileHandling\\Practice.txt");

		// one way to read
		/*
		 * try { Scanner sc = new Scanner(f); while(sc.hasNext()) { String line =
		 * sc.nextLine(); System.out.println(line); } }catch(FileNotFoundException e ) {
		 * System.out.println(e.getMessage()); }
		 */

		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				 line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
