package com.edu.lambda.consumer;

import java.util.function.IntSupplier;

//Supplier 인터페이스 : 매개값이(x) -> 반환값(o)
public class SupplierExample {
	public static void main(String[] args) {
		// int타입을 리턴하는 인터페이스
		IntSupplier intSup = () -> (int) (Math.random() * 10);
		int result = intSup.getAsInt();
		System.out.println("결과값은 " + result);
	}
}
