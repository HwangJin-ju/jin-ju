package com.dev;

import java.util.Scanner;

import com.edu.Student;

//public 클래스는 다른 패키지에서 접근 가능 (import는 해 줘야 함)

public class ObjectExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // Student처럼 우리가 만든 클래스가 아니라 자바에서 제공하는 클래스. 많이 쓰는 기능을 구현해둠.

		Student s1 = new Student(100, "이가영");
//		System.out.println(s1.getStudNo());
//		System.out.println(s1.getStudName()); // set method 안 써도 값이 나오는 걸 알 수 있다 인스턴스 생성할 때 값을 지정해 줬기 때문
		s1.setKorScore(100);
		s1.setEngScore(60); // set method로 값을 지정한 경우
		s1.setMathScore(80);

		Student s2 = new Student(101, "이혜린", 80, 82, 85); // 생성자를 통해서 필드값을 지정한 경우
//		System.out.printf(s2.getStudName() + "의 평균: %.2f", s2.getAvgScore());

		Student s3 = new Student(102, "서현일", 70, 80, 90);
		Student s4 = new Student(103, "최규완", 77, 82, 83);

		Student[] students = { s1, s2, s3, s4 };

		while (true) {
			System.out.println("조회하려는 학생의 이름 (ex.홍길동) : ");
			String searchName = scn.next();
			if(searchName.equals("종료")) {
				break;
			}

			for (int i = 0; i < students.length; i++) {
				if (students[i].getStudName().equals(searchName)) {
					System.out.println(students[i].getStudInfo());
				}
			}
		}
		System.out.println("end of program");
	}
	

}
