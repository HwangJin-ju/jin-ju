package com.dev;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		// 물건 가격이 50000원 이상이면 배송비 0,
		// 그외에는 배송비 3000원.
		// 결제할 금액이 얼마인지 보여주는 코드 작성하기.
		
		Scanner scn = new Scanner(System.in);
		
		int price, shippingFee;
		
		System.out.println("물건 가격을 입력해 주세요.");
		price = scn.nextInt();
		shippingFee = 3000;
		
		if(price >= 50000) {
			System.out.println("결제할 금액은 " + price + "원입니다.");
		} else {
			System.out.println("결제할 금액은 " + (price + shippingFee) + "원입니다.");
		}
		
		scn.close();
		
		if(price >= 50000) {
			price = price;
		} else {
			price = price + shippingFee;
		}
		
		price = (price >= 50000) ? price : price + shippingFee; //삼항연산자. 조건을 만족하면 : 앞의 값을, 만족하지 못하면 : 뒤의 값을 실행한다.
		
		System.out.println("결제할 금액은 " + price + "원입니다.");
		
		
		
	
	}

}
