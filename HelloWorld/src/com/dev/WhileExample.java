package com.dev;

import java.util.Scanner;

public class WhileExample { // 횟수 정해져 있는 건 보통 for문을 사용한다. while은 조건 만족. 증감식이 실행 구문 안에 있다
	public static void main(String[] args) {
		//for
		for(int i = 1; i<= 5; i++) {
			System.out.println("i의 값 => " + i);
		}
		
		//while
		int i = 1; //초기화
		while(i <= 5) { //조건식 조건이 만족하면 블록 안을 실행한다.
			//i++; 위치가 여기라면 2로 시작할 것.
			System.out.println("i의 값 => " + i);
			i++; //증감식 이것의 위치가 어디냐에 따라 값이 달라질 수 있다.
		}
		
		//while
		int num = 0;
		while(true) { //무조건 반복하겠다. 끝나는 조건 없음.
			System.out.println("num의 값 => " + num);
			num++;
			if(num>5) {
				break;  //조건에 걸리면 반복문을 빠져나오겠다.
			}
		}
		//while
		while(true) {
			int rand = (int) (Math.random() * 10) +1 ; //1 ~ 10
			System.out.println("임의의 생성된 값 : " + rand);
			if(rand == 8) {
				break;
			}
		}
		
		// 숫자를 맞힐 때까지 계속 반복
		
		Scanner scn = new Scanner(System.in);

		int randomVal, userVal;
		
		while(true) {
			randomVal = (int) (Math.random() * 5) + 1;
			System.out.println("임의의 값을 입력하세요. (1~5)");
			userVal = scn.nextInt();
			
			if(randomVal == userVal ) {
				System.out.println("생성된 임의의 값과 같습니다.");
				break;
			}
		}
		
	System.out.println("end of prog");	
	
	}
}
