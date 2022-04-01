package com.dev;

//클래스 이름은 항상 대문자로 시작. 두 단어가 조합된 상황이면 대소문자 번갈아서 쓴다. ex. WhichExample - camel case
public class IfExample {
	public static void main(String[] args) {
		// 조건문 if -> 조건을 만족하면 그 블록을 실행한다.
		// 60점 이상이면 Pass

		int score = 83;

		if (score > 60) { // () 안에 조건문, {} 안에 실행할 코드를 넣는다.
			System.out.println("Pass입니다.");
		} else {
			System.out.println("Fail입니다.");
		}

		// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그외는 F

		if (score >= 90) { // if 구문이 하나인 경우
			if (score >= 95) {
				System.out.println("A+ 입니다.");
			} else {
				System.out.println("A 입니다.");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+ 입니다.");
			} else {
				System.out.println("B 입니다.");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+ 입니다.");
			} else {
				System.out.println("C 입니다.");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+ 입니다.");
			} else {
				System.out.println("D 입니다.");
			}
		} else {
			System.out.println("F 입니다.");
		}

		System.out.println("end of program");
	}

}
