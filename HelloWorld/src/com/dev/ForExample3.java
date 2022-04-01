package com.dev;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		//입력받는 두 수를 num1, num2
		//두 수 사이의 값을 더한 값을 출력

		Scanner scn = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("1번 값을 입력해 주세요.");
		num1 = scn.nextInt();
		
		System.out.println("2번 값을 입력해 주세요.");
		num2 = scn.nextInt();
		
		int sum = 0; 
		for(int i=num1; i<=num2; i++) {
			sum = sum + i; //sum += i
		}
		
		System.out.println(num1 + "부터 " + num2 + "까지 더한 값은 " + sum + "입니다.");
		

	}
}
