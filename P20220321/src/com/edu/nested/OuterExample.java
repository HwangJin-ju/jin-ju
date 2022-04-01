package com.edu.nested;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
//		outer.method1();
//		outer.method3();
		outer.method4();
		
		
		
//		System.out.println("-----Inner-----");
		Outer.Inner inner = outer.new Inner(); // 호출하는 방식이 다름 Outer 클래스가 가진 참조 변수에 new 연산자를 사용해서 인스턴스 생성 
		//Inner 클래스의 인스턴스
//		inner.method2();
	}
}
