package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class StudentEx {
	public static void main(String[] args) {
		// Scanner배열을 5개 선언, 입력, 리스트 출력.
		
		Scanner scn = new Scanner(System.in);
		Student[] students = new Student[5];
		
		while(true) {
			System.out.println("1.입력 2.리스트 3.종료");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			if (menu == 1) {
				// 입력기능구현
				System.out.print("학번을 입력해 주세요> ");
				int snum = scn.nextInt();
				System.out.print("이름을 입력해 주세요> ");
				String sname = scn.next();
				System.out.print("영어 점수를 입력해 주세요> ");
				int escore = scn.nextInt();
				System.out.print("국어 점수를 입력해 주세요> ");
				int kscore = scn.nextInt();
				System.out.print("수학 점수를 입력해 주세요> ");
				int mscore = scn.nextInt();
				
				Student s1 = new Student(snum, sname, kscore, mscore, escore);
				
				for(int i = 0; i < students.length; i++) {
					if (students[i] == null) {
						students[i] = s1;
						break;
					}
				
				}
				
				System.out.println("저장 완료.");
				
			} else if (menu == 2) {
				// 리스트
				for (int i = 0; i < students.length; i++) {
					if (students[i] != null) {
						System.out.println(students[i].getStudInfo());
					}
				}
				System.out.println("조회 완료.");
//			} else if (menu == 3) {
//				// 디테일한 리스트
//				for (int i = 0; i < students.length; i++) {
//					if (students[i] != null) {
//						System.out.println(students[i].getDetailInfo());
//					}
//				}	
				
		    } else if (menu == 3) {
				// 종료
				System.out.println("프로그램 종료합니다.");
				break;
			} else {
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
			
		}

	System.out.println("end of program");

}

}
