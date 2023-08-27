package com.krushna.filehandling.operations;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		if (file.canRead()) {
			System.out.println("File is readable");
		} else {
			System.out.println("File is not readable");
		}
		if (file.canWrite()) {
			System.out.println("File is Writable");
		} else {
			System.out.println("File is not Writable");
		}
		if (file.canExecute()) {
			System.out.println("File is executable");
		} else {
			System.out.println("File is not executable");
		}

	}
}
