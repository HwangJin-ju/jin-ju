package com.edu.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExample {
	public static void main(String[] args) {
		try {
			OutputStream os2 = new FileOutputStream("second.dat");
			os2.write(10);
			os2.write(20);
			os2.write(30);
			os2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
		
	}
}
