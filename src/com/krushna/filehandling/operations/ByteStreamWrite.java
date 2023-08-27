package com.krushna.filehandling.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) throws IOException {
		File file = new File("Demo.txt");
		if (file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(96);
//			fileOutputStream.write(null);
//			fileOutputStream.write(null, 2, 8);
			System.out.println("Data Written to the file");
			fileOutputStream.close();
		}else {
			
		}

	}

}
