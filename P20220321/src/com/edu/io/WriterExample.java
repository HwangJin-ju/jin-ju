package com.edu.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) {
		// 출력스트림을 문자 기반으로 second.txt
		try {
			FileWriter fw = new FileWriter("second.txt");
			fw.write("Hello\n");
			fw.write("World\n");
			fw.close(); // 다 쓴 건 반환해 줘야 함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end of prog");
	}
}
