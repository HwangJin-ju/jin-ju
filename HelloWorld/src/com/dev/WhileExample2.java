package com.dev;

public class WhileExample2 {
	
	public static void main(String[] args) {
		// 1~10까지의 수 중에서 짝수만 출력
		// while문으로 작성
		
		System.out.print("i의 값은 ");
		int i = 1;
		while (i<=10) {
			if(i % 2 == 0) {
				System.out.print(" " + i );
			}
			i++;
		}
		System.out.println("입니다.");
	}

}
