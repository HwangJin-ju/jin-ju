package com.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedExample {
	public static void main(String[] args) { //리소스 쓸 때 try 구문 안에 쓰면 close 해줄필요없이 알아서 반환해줌
		try (FileInputStream fis = new FileInputStream("C:/temp/svitlana-sAu3x9_Mg68-unsplash.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);

				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/temp/copy3.jpg"));) {

			// 기본스트림을 보조스트림의 매개값으로 주면 더 간단

			int readByte = -1;
			while ((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
