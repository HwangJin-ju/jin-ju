package com.edu;

import java.util.Scanner;

// 이름을 입력받도록 (String) -> scn.nextLine();
// 연락처 입력 (String) -> scn.nextLine();
// 나이 입력 (int) -> scn.nextInt(); 사용자가 입력한 값을 정수 형태로 읽어드리겠습니다
// 키 입력 (double) -> scn.nextDouble();

// 이름은 : ???
// 연락처 : 010-2345-8456
// 나이 : 26 
// 키 : 167.4
// 몸무게 : 63.4
// 적정몸무게 : (키 - 100) *0.9 -> 60.3 보다 크면 과체중 작으면 저체중
public class TodayExample {
	public static void main(String[] args) {
//		double weight = 67.5; // 72.5 ~ 62.5 사이에 적정
//		double realWeight = 69.3;
//		
//		if(weight+5>realWeight && weight - 5<realWeight) {
//		 System.out.println("적정몸무게입니다");
//		} else {
//			System.out.println("비정상입니다.");
//		}
//			
//		
		
		
		
		
		
		Scanner scn = new Scanner(System.in);
		String name, number;
		int age;
		double height, weight;
		
		System.out.println("이름은 :");
		name = scn.nextLine();
		
		
		System.out.println("연락처는 :");
		number = scn.nextLine();
		
		System.out.println("나이는 :");
		age = scn.nextInt();
		
		System.out.println("키는 :");
		height = scn.nextDouble();
		
		System.out.println("키를 입력해 주세요");
		height = scn.nextDouble();
		weight = (height - 100) * 0.9;
		
		if (weight > 60.3) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("저체중입니다");
		}
		
		double realWeight;
		realWeight=55;
		
		if (weight +5 > realWeight && weight - 5<realWeight) {
			System.out.println("적정 몸무게입니다.");
		} else {
			System.out.println("비정상입니다.");
	
		
		
	
		
		
		scn.close();
	}

	
		
	}

}
