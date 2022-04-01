package com.prod;

public class ReferenceExample {
	public static void main(String[] args) {
		// 참조타입 vs 기본(데이터)타입
		int num1 = 10; // 숫자 리터럴
		int num2 = 10; 
		// int, double, (byte, short, long, float, char, boolean)
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2); //메모리에 10이란 실제값이 저장되어 있으므로 true
		
		String str1 = new String("hello"); 
		String str2 = new String("hello");
		
		System.out.println(str1); 
		System.out.println(str2);
		System.out.println(str1 == str2); //메모리에 가 보면 주소값이 있다 hello가 아님
		System.out.println(str1.equals(str2)); //값을 비교하려면 equals라는 메소드를 써야 한다
	}
}
