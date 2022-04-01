package com.dev;

import java.util.Scanner;

public class ForExample5 {
	public static void main(String[] args) {
		int num = 48; // 약수의 모든 숫자를 구하는 프로그램.

		System.out.print("48의 약수는 ");
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				System.out.print(" " + i); // print는 옆으로 계속 출력할 수 있게 함. println은 다음 구문이 다음 줄로 감.
			}
		}

		System.out.println(" 입니다.");

		Scanner scn = new Scanner(System.in);

		System.out.println("첫 번째 수를 입력하세요.");
		int num1, num2, maxVal = 0;
		num1 = scn.nextInt();

		System.out.println("두 번째 수를 입력하세요.");
		num2 = scn.nextInt();

		for (int i = 1; i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				maxVal = i;
			}

		}
		System.out.println("최대공약수는 " + maxVal + "입니다.");
		
	}

}
