package com.edu;

import java.util.Scanner;

public class CashExample {
	public static void main(String[] args) {
		// 2개 값을 입력

		Scanner scn = new Scanner(System.in);
		int price, cash;

		// 가격을 입력하세요
		System.out.println("물건의 가격을 입력해 주세요.");
		price = scn.nextInt();

		System.out.println("손님이 낸 금액을 입력해 주세요.");
		cash = scn.nextInt();

		System.out.println("물건의 부가세는 " + (price * 1 / 11) + "입니다.");
		System.out.println("거스름 돈은 " + (cash - price) + "입니다.");

//	    price = ???.nextInt(); //5500원은 10% 포함된 금액
//		
//		// 손님이 낸 금액
//		cash = ???.nextInt();
//		
//		// 계산해야 할 값 중 하나는 상품의 부가세, 하나는 거스름돈
	}

}
