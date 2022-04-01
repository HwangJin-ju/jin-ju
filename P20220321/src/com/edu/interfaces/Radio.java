package com.edu.interfaces;

public class Radio implements RemoteControl { // 리모트컨트롤이라는 인터페이스가 가진 기능을 반드시 구현해야 함
	public void turnOn() {
		System.out.println("Radio를 켭니다");
	}
	
	public void turnOff() {
		System.out.println("Radio를 끕니다");
	}

	@Override // 위처럼 각각 클래스마다 메소드를 정하지 말고 이렇게 인터페이스가 만든 규칙을 따라가면 됨
	public void powerOn() {
		System.out.println("Radio를 켭니다");		
	}

	@Override
	public void powerOff() {
		System.out.println("Radio를 끕니다");		
		
	}
	
	
}
