package com.dev;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {              //1vs2 1vs3 2vs3
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		
		
//		 123 132 213 231 312 321
		

		System.out.println("첫 번째 값을 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("두 번째 값을 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("세 번째 값을 입력하세요.");
		num3 = scn.nextInt();
		

		if(num1<num2 && num2<num3) {
			System.out.println(num1 + "<" + num2 + "<" + num3);
		} else if (num1<num3 && num3<num2) {
			System.out.println(num1 + "<" + num3 + "<" + num2);
		} else if (num2<num1 && num1<num3) {
			System.out.println(num2 + "<" + num1 + "<" + num3);
		} else if (num2<num3 && num3<num1) {
			System.out.println(num2 + "<" + num3 + "<" + num1);
		} else if (num3<num1 && num1<num2) {
			System.out.println(num3 + "<" + num1 + "<" + num2);
		}else {
			System.out.println(num3 + "<" + num2 + "<" + num1);
		}
		
		
	}

}
