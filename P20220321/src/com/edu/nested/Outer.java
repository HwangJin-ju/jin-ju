package com.edu.nested;

public class Outer {
	private String field1;
	private int field2;
	
	class Inner { //내부 클래스 중에서 멤버 클래스 클래스 안에 선언되는 필드, 메소드 등을 멤버라고 한다. 클래스 안에 선언된 클래스도 멤버 클래스
		String field3;
		int field4;
		
		void method2() {
			System.out.println("Inner.method2()");
		}
	}
	//함수적 인터페이스 : 구현해야 할 메소드가 하나인 것 ->람다표현식(함수적 프로그래밍)으로 표현가능 (람다표현식 책에 없음 ㅠㅠ)
	interface Runnable {
		void run();
	}
	
	class Bus implements Runnable {

		@Override
		public void run() {
			System.out.println("Bus가 달립니다");
		}
		
	}
	
	public String getField1() {
		return field1;
	}
	
	public void method1() {
		System.out.println("Outer.method1()");
		Inner inner = new Inner();
		inner.method2();
	}
	
	public void method3() {
		System.out.println("Outer.method3()"); 
		
		class Local { // 내부 클래스 중 로컬 클래스 (메소드 안에 선언된 클래스)
			
			void method4() {
				System.out.println("Local.method4()");
			}
		}
		Local local = new Local();
		local.method4();
	}
	public void method4() {
		Runnable runnable = new Bus(); // Bus가 Runnable 인터페이스의 구현객체라서 가능 
		runnable.run(); // Bus라는 구현객체를 담았음
		
		runnable = new Runnable() {
			//익명구현객체. Bus처럼 클래스 안 만들고 씀. 한 번 쓰고 버리는 용도 
			//Runnable 인터페이스는 new 생성자를 못 만드는데 이렇게 만들면 구현객체를 바로 만들게 되는 것
			//매번 실행 기능이 다르면 익명구현객체 쓰고 버리면 됨 -> 필요없이 만드는 코드가 많아짐 ->나중에 람다표현식으로 해결 (but 인터페이스 안에 구현해야 하는 게 하나만 있을 때만 씀)
			//Runnable 인터페이스를 구현하기 때문에 무조건 run()메소드 실행해야 함

			@Override
			public void run() {
				System.out.println("임의의 객체를 실행합니다");
			} 
		
		};
		
		runnable.run(); // Runnable 인터페이스 실행하는 익명구현객체를 담았음
	}
}
