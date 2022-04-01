package com.edu.api;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		
		// 기본 타입 (int, long, double, boolean 등)
		// 참조 타입 (Integer, Long, Double, Boolean 등)
		
		// 정수 타입인데 클래스로 변형해서 처리해야 할 때 씀 ex. ArrayList 
		// 정수를 담고 싶다고 해서 ArrayList<int> 불가능
		
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(100); // 내부에서 int <-> Integer 가 일어남 int -> Integer (boxing), Integer -> int (unboxing)
		ary.add(new Integer(200)) ; // 에러는 아니지만 Deprecated 향후 자바에서 제거할 예정이라 웬만하면 쓰지 말라는 표시 
		
		new Integer(100).floatValue(); //클래스라서 메소드 불러오는 게 가능하기 때문에 floatValue 메소드 사용. 100.0으로 표현해 줌 
	}
}
