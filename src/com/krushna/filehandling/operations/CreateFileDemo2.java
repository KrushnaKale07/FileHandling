package com.krushna.filehandling.operations;

import java.io.File;

public class CreateFileDemo2 {

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		if (file.exists()) {
			System.out.println("File already exist");
		} else {
			try {
				file.createNewFile();
				System.out.println("File is created");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("File is not created");
			}
		}

	}

}
