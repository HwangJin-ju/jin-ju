package com.edu.io; //파일에 쓴 내용을 루틴 돌면서 배열에 넣고 list 출력

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.collect.Student;

public class StudentFileExample {
	
	static Scanner scn = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>(); 
	
	public static void main(String[] args) {
//		writeStudent(); //입력
		readStudent(); // 텍스트 형식으로 101 홍길동 30 50 을 가져와서 new Student(101 -> parseInt씀, 홍길동, 30, 50) 을 컬렉션에 넣어서 출력
		
		for(Student student : list) { 
			System.out.println(student.toString());
		}
			
		System.out.println("end of prog");
	}// end of main
	
	public static void readStudent() { // writeStudent로 만든 student.txt 읽어들이는 기능
		try {
			
			FileReader fr = new FileReader("Student.txt");
			BufferedReader br = new BufferedReader(fr);
			String readStr = null;
			
			while((readStr = br.readLine()) != null){  // 파일을 라인단위로 읽어들임
				String[] contents = readStr.split(" "); // 101 Hong 20 30 split이 공백을 기준으로 나눠서 contents라는 문자열 배열에 담아줌
			list.add( new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]) ,Integer.parseInt(contents[3])) ); 
				
			//	System.out.println(readStr); //Student.txt 화면에 출력
			}
			br.close();
			fr.close();
			
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeStudent() { // student.txt에 값을 입력하는 기능 
		try {
			FileWriter fw = new FileWriter("student.txt");
			BufferedWriter bw = new BufferedWriter(fw); // 보조스트림 매개값으로 기본스트림 넣어줌

			while (true) {
				System.out.println("이름을입력>> 101 Hong 20 30");
				String name = scn.nextLine(); // nextLine : 한 라인 전체를 읽어들이는 메소드
				if (name.equals("stop")) {
					break;
				}
				bw.write(name + "\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
