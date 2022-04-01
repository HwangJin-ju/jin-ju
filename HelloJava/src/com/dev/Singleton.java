package com.dev;

public class Singleton {
	private static Singleton instance = new Singleton(); //싱글톤 타입의 필드 선언
			//Singleton이라는 클래스를 통해 쓰기 위해 static 선언했지만 private이라 접근이 불가.
	private Singleton() {
	} //생성자를 private으로 막아버림 -> 다른 클래스에서 사용 불가
	
	public static Singleton getInstance() {
		return instance; //private이라 instance에 접근이 불가해서 instance값 받아올 수 있는 유일한 방법
	}
}
