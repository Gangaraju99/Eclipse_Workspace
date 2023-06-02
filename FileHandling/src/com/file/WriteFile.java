package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {

		File f = new File("Practice.txt");

		try {

			FileWriter fr = new FileWriter(f);
			fr.write("ashok it....learn here lead anywhere");
			fr.close();
		} catch (IOException e) {
			e.getMessage();
		}

		System.out.println("Done!!!!");

	}
}