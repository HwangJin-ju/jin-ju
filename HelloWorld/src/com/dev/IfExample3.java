package com.dev;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int ranVal = (int) (Math.random() * 3) + 1; //Math.random : 0 ~ 1 사이의 임의의 값을 만들어 준다.
		
		
		
		
		System.out.println("값을 입력해 주세요. (1~3)");
		int num1 = scn.nextInt();
		
		System.out.println(ranVal);
		
//		if(ranVal == num1) {
//			System.out.println("맞혔습니다.");
//		} else {
//			System.out.println("틀렸습니다.");
//		}
		
		String result = (ranVal == num1) ? "맞혔습니다" : "틀렸습니다" ;
		System.out.println(result);
	
		//삼항연산자로 해 볼 것.
		
		
		
		
		
	}

}
