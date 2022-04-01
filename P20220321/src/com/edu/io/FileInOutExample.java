package com.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/temp/svitlana-sAu3x9_Mg68-unsplash.jpg");
			FileOutputStream fos = new FileOutputStream("C:/temp/copy2.jpg");
			
			int readByte = -1;
			byte[] readBytes = new byte[100];
			while((readByte = fis.read(readBytes)) != -1) {
				//fos.write(readBytes); // 읽고 쓰고 여러번 반복하지 않고 100바이트 차면 읽고 쓰기 때문에 속도가 더 빠름
				  fos.write(readBytes, 0 , readByte); // 매개값으로 주어진 배열 readBytes부터 readByte까지 읽어줌 
			}
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
