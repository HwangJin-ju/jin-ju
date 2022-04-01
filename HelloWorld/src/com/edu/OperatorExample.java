package com.edu;

public class OperatorExample {
	public static void main(String[] args) {
		int num1, num2, result;

		num1 = 10;
		num2 = 100;

		num1 += 20;
		num2 -= 50;

		num1++; // 31
		num2--; // 49
		num2--; // 48
		num1 >>= 2; // num1 = num1 >> 2;

		result = num1 + num2;
		System.out.println("result=> " + result);

		int myAge = 19;
		//myAge = 29;
		boolean isAdult = myAge > 20;
		System.out.println(isAdult);

		// 논리연산자 (t/f)
		if (isAdult) { // if 구문 안에는 참거짓 판별 가능한 값이 들어간다.
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년입니다.");

		}
	}

}
