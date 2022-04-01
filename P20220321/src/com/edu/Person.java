package com.edu;

public class Person extends Object {
	
	// field
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
	// constructor 필드 값 초기화
	// overloading 중복선언 
	
	public Person() {
		
	}
	public Person(String name) {
		
	}
	public Person(String name, int age, double height, double weight) {
		super(); // 부모 클래스 생성자를 상속하겠다는 뜻
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
//클래스의 멤버 : 필드, 생성자, 메소드

}
