package com.dev;

public class ForExample {
	public static void main(String[] args) {
		// 1~100까지 출력할 때 sysout 100번 쓰려면 힘듦 -> 실행하는 기능이 같을 때 반복문 사용.
		    // 초기값   조건식     증감식  : 이 조건을 만족하는 동안 계속 반복
//		for(int i = 1; i <= 3; i++) {
//			System.out.println(i);
//		}
		
		// 1 ~ 10까지 더하는 방법
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			sum = sum + i; // sum = 0, i = 1 -> sum = 1
		}
		System.out.println("합계:" + sum);
		
		
		
	}

}
