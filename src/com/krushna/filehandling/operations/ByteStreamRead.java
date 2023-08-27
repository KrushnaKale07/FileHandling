package com.krushna.filehandling.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\J2EE WEJA2\\FileFolder\\Demo.txt");
		if (file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			System.out.println(fileInputStream.read());
			System.out.println("Data fetched from the file");
			fileInputStream.close();
		} else {
			System.out.println("File does not exist");
		}

	}

}
