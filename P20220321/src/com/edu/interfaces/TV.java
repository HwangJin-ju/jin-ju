package com.edu.interfaces;

public class TV implements RemoteControl { //리모트컨트롤이 만든 규칙을 따르세요
	public void powerOn() {
		System.out.println("TV를 켭니다");
	}
	
	public void powerOff() {
		System.out.println("TV를 끕니다");
	}
}
