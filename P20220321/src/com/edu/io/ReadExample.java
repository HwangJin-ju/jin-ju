package com.edu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
	public static void main(String[] args) {
		try {
			//문자 기반 스트림 (한문자씩)
			FileReader fr = new FileReader("second.txt");
			int readChar = -1;
			while((readChar = fr.read()) != -1) {
				System.out.print((char) readChar);
			}
			fr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
