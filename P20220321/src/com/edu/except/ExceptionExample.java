package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// 오류 : Error, Exception
		// compile error vs runtime error(잘못된 결과가 나오더라도 프로그램 강제 종료 안 하고 에러난 이유 적절하게 처리해주고 정상 종료 시킴)
 		
		try {
		double result = 13 / 0;
		System.out.println("결과: " + result);
		} catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		try {
			int menu = scn.nextInt();	
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력안하셨네요");
		}
		scn.close();
		
		System.out.println("end of prog");
	}
}
