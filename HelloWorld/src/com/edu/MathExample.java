package com.edu;

import java.util.Scanner;

public class MathExample {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		

		int num1, num2; //변수 쓰려면 그전에 타입부터 명시해야 함
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		num1 = scn.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		num2 = scn.nextInt();
		
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");
		
		System.out.println("두 수의 차는 " + (num1 - num2) + "입니다.");
		
		System.out.println("두 수의 곱은 " + (num1 * num2) + "입니다.");
		
		System.out.println("두 수를 나눈 몫은 " + (num1 / num2) + "입니다.");
		
		System.out.println("두 수를 나누고 남은 나머지는 " + (num1 % num2) + "입니다.");
		
		scn.close();

	}

}
