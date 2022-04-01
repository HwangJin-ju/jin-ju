package com.edu.lambda;

interface Runnable { // 인터페이스에는 추상메소드 정의
	public void run();
}

class RunImpl implements Runnable {// Runnable 인터페이스를 구현하는 클래스

	@Override
	public void run() {
		System.out.println("run..."); // 클래스를 선언하는 이유는 거기에서 정해진 규칙을 여기저기서 쓰기위함임
	} // 근데 매번 기능이 바뀌면 굳이 클래스 만드는 의미가 없음 -> 익명구현객체로 해결

}

public class RunExample { //매개변수 반환타입 다 없음
	public static void main(String[] args) {
		// 람다표현식 ( 매개변수 ) -> { 구현코드 };

		Runnable runnable = new RunImpl(); // 구현클래스라서 인터페이스에 담김
		runnable.run(); // run의 기능이 고정적이지 않고 그때그때 다르다면? -> 클래스 만들 필요없이 익명객체를 만들어서 해결

		runnable = new Runnable() { // Runnable은 인터페이스 근데 인터페이스는 new로 생성이 안됨 runnable이란 인스턴스를 사용하기위함??

			@Override
			public void run() {
				System.out.println("호랑이가 달립니다.");
			}

		}; // 익명구현객체

		runnable.run();
				//매개변수     //실행블럭
 		runnable = () -> {
			System.out.println("사자가 달립니다.");
		}; //람다식은 알 수 있는 부분은 다 제거한다
		runnable.run();
	}
}
