package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
		
	 
		// Animal animal = new Animal(); -> 불가 추상클래스는 인스턴스를 생성할 수 없다
		Animal animal = null;
		animal = new Dog();
		animal.setName("백구"); //부모 클래스 기능을 그대로 쓴다
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("두부");
		animal.eat();
		animal.speak();
		
	}
}
