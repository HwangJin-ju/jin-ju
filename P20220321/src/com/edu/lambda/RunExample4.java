package com.edu.lambda;
interface Runnable4 {
	public int run();
}
public class RunExample4 { //매개변수는 없고 반환타입은 있음
	public static void main(String[] args) {
		
		Runnable4 runnable = () -> { 
			return (int) (Math.random() * 10); //0부터 9까지 랜덤
		};
		
		int result = runnable.run();
		System.out.println(result);
		
		// result 변수에 또 다른 기능 선언하면 다른 기능 실행 가능 -> 함수적인 프로그램 작성 (이걸 간단하게 표현하고 싶으면 람다표현식)
		
		runnable = () -> {
			return (int) (Math.random() * 100);
		};
		result = runnable.run();
		System.out.println(result);
	}
}
