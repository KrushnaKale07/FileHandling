package com.krushna.filehandling.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) throws IOException {
		File file = new File("Demo.txt");
		if (file.exists()) {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Demo from the java Program");
			System.out.println("Data written in to the file");
			fileWriter.close();
		}
		else {
			file.createNewFile();
			System.out.println("File is created");
		}

	}

}
