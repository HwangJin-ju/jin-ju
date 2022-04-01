package com.edu;

import java.util.Scanner;

public class ScannerExample { // com.edu.ScannerExample 이 풀네임 (패키지 + 클래스)
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //System.in 키보드로 입력한 값을 읽어들인다.
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int val = scn.nextInt(); 
		System.out.println("두번째 숫자를 입력하세요.");
		int val2 = scn.nextInt(); 
		
		int val3 = val + val2;
		
		System.out.println("두 수의 합은 " + val3 + "입니다."); //문자열이 먼저 나오면 뒤에 나오는 것도 문자열로 인식한다. 중간에 나오는 숫자 연산을 먼저 하고 싶으면 (괄호)로 묶어 주면 됨.
//		
//		if (val % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
//		
//		if (val % 2 == 1) {
//			System.out.println("홀수입니다.");
//		}
		scn.close();
	}

}
