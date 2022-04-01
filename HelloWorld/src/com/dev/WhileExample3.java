package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 숫자 입력을 계속 할 수 있도록
		// 계속 입력하다가 -1 입력하면 멈추겠다는 의미
		// sum 값에 계속 누적

		Scanner scn = new Scanner(System.in);

		int inputVal, sum = 0;

		while (true) {

			System.out.println("값을 입력하세요");
			inputVal = scn.nextInt();
			if (inputVal == -1) {
				break;
			} else {
				sum += inputVal;
			}
		}
		
		System.out.println("합계는 " + sum + "입니다.");
	}

}
