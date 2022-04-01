package com.edu.generic;

import java.util.ArrayList;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj("Hello");
//		String result = (String) box.getObj(); // String 타입 Hello -> 리턴되는 타입이 object라서 캐스팅
//		System.out.println(result);
//		
//		Integer result1 = (Integer) box.getObj(); // String 타입을 Integer로 바꿀 수는 없다
//		System.out.println(result1);
		
		Box<String> stringBox = new Box<String>();
		stringBox.setObj("Hello");
		String result = stringBox.getObj();
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.setObj(100);
		Integer result1 = intBox.getObj();
		
		ArrayList<Integer> intAry = new ArrayList<Integer>();
		
	}
}
