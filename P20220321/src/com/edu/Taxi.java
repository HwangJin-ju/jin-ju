package com.edu;

public class Taxi extends Vehicle {

	public Taxi() {
		super.setMaxSpeed(120);
	}
	
	@Override
	public void run() { // 부모 클래스가 가진 메소드를 재정의
		System.out.println("Taxi가 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Taxi가 멈춥니다.");
	}

	@Override
	public String toString() {
		return "택시의 최고 속도는 " + getMaxSpeed() + "입니다.";
	}

	
	
	
}
