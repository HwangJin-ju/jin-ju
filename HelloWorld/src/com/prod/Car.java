package com.prod;

public class Car {
	// 모델, 현재속도, 최고속도, 가속(10), 감속(10), 바뀐현재속도()
	private String model;
	private int speed;
	private int maxSpeed;

	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void addSpeed() {
		if (this.speed + 10 > this.maxSpeed) {
			System.out.println("최고 속도를 초과할 수 없습니다");
			return; //아래 구문을 실행하지 않고 메소드 종료하겠다는 의미
		}
		System.out.println("10km 가속합니다.");
		this.speed += 10;
	}

	public void breakSpeed() {
		if (this.speed <= 0) {
			System.out.println("0보다 아래로 내려갈 수 없습니다");
			return;
		}
		System.out.println("10km 감속합니다.");
		this.speed -= 10;
	} // 0키로보다 안 떨어지도록 해 볼 것

	public int getSpeed() {
		return this.speed;
	}
}
