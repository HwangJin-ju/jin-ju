package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1:입금, 2:출금, 3: 종료
		// 입급일 경우: 입금액을 입력하세요 account 변수에 값을 누적
		// 출금일 경우: 출금액을 입력하세요 account 값을 차감
		// 종료일 경우: 프로그램 종료

		Scanner scn = new Scanner(System.in);
		int account = 0;

		while (true) {
			System.out.println("1:입금, 2:출금, 3:종료");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("입금액을 입력하세요.");
				int inputVal = scn.nextInt();
				account += inputVal;
				System.out.println("현재 잔액은 " + account + "원입니다.");
			}

			else if (menu == 2) {
				System.out.println("출금액을 입력하세요.");
				int outputVal = scn.nextInt();
				
				if (outputVal <= account) { //비정상을 걸러내는 게 더 좋은 방식임
					account -= outputVal;
					System.out.println("현재 잔액은 " + account + "원입니다.");
				} else {
					System.out.println("잔액이 모자랍니다.");
				}
				
				// 아래처럼 비정상을 걸러내는 게 더 좋은 방식임
				// if (outputVal > account) {
				//		System.out.println("잔액을 초과합니다.");
				//		continue; 그다음으로 넘어가자.
			    //    }
				//	account -= outputVal;
				//	System.out.println("현재 잔액은 " + account + "원입니다.");
			}

			else if (menu ==3) {
				break;
			}
			

		}
		System.out.println("end of program");

	}
}
