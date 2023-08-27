package com.krushna.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		try {
			file.createNewFile();
			System.out.println("File is created");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File is not created");
		}
		

	}

}
