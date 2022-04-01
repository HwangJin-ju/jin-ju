package com.edu.abstracts;

public abstract class Animal {
	private String name;
	
	public Animal() {
		System.out.println("Aniaml() 생성자 호출.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 추상메소드 정의
	public abstract void eat(); // 구현부분인 {}가 없음 이걸 상속받는 자식 클래스들은 이걸 무조건 구현해야함
	public abstract void speak();
}
