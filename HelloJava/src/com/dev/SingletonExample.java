package com.dev;

public class SingletonExample {
	public static void main(String[] args) {
		//Singleton s1 = Singleton();
		//Singleton s2 = Singleton(); // 힙 영역에 인스턴스 생성됨
		
		//System.out.println(s1);
		//System.out.println(s2); // 출력해보면 주소값이 다름 -> 서로 다른 인스턴스가 생성되었다는 것을 알 수 있다
		
		
		// private으로 막음
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	
		System.out.println(s1 == s2); // true가 나옴 인스턴스를 계속 생성하지 않고 클래스에 소속된 하나로 계속 쓰겠다는 뜻
		
		
	}
}
