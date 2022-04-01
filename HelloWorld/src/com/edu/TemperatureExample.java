package com.edu;

import java.util.Scanner;

public class TemperatureExample {
	public static void main(String[] args) {
		// C = 5/9(F-32) 화씨온도를 섭씨온도로 변경 규칙.
		// 30.0보다 높으면 "오늘은 더운 날씨네요." 그렇지 않은 경우 "살 만하네요."
		
		Scanner scn = new Scanner(System.in);
		double fDeg, cDeg; // 변수 쓰기 전에 타입 지정
		System.out.println("화씨 온도를 입력해주세요");
		fDeg = scn.nextDouble(); // 사용자 입력값을 기다리는 메서드
		cDeg = (double) 5/9 * (fDeg - 32);
		System.out.println(cDeg);
		
		if (cDeg > 30.0) {
			System.out.println("오늘은 더운 날씨네요");
		} else {
			System.out.println("살 만하네요");
		}
		
		scn.close();
		
			
		
		
	}

}
