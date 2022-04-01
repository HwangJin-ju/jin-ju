package com.edu;
// Object(객체) -> Class(객체의 특징을 모아놓은 틀이나 도면 ex.붕어빵 틀) -> 인스턴스 생성 (Class를 바탕으로 실체를 만듦 ex.재료(속성=인스턴스)에 따라 달라지는 실제 빵(계란빵, 붕어빵))
// 절차프로그램(데이터, 함수로 나눠져 있음) -> 데이터와 함수를 하나에 묶으려는 필요에 의해 만들어진 게 객체 지향. (데이터, 기능(함수)) 
// 학생(객체:Object) -> Class Student -> instance(new Student())
public class ObjectExample {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 12.34;
		double num3 = 20; // 자동형변환(Promotion)
		int num4 = (int) 23.4; // 강제형변환(Casting)
		
		String str1 = "Hello"; // 인스턴스가 heap 영역에 생성. Hello가 아니라 Hello의 주소값을 가짐. 그래서 값 비교할 때 equals로 해야.
		
		Car car1 = new Car(); // 초기화. 인스턴스 생성. Car가 가진 기능을 갖고 있는 실체인 car1을 만듦.
		car1.setModel("Sonata");
		car1.setPrice(10000000);
		
		
		Student s1 = new Student(); //int는 0, String은 null로 초기화된 상태 if double이라면 0.0
		s1.setStudNo(100);			//초기화하는 시점에 필드 값을 지정할 수도 있다.
		s1.setStudName("김형민");
		s1.setKorScore(90);
		s1.setEngScore(80);
		s1.setMathScore(85);
		
		
		System.out.println("영어점수 초기값 : " + s1.getEngScore());
		System.out.println("이름의 초기값 : " + s1.getStudName());
		System.out.println(s1.getStudName() + "의 점수 합계는 " + s1.getSumScore());
		System.out.println(s1.getStudName() + "의 점수 평균은 " + s1.getAvgScore());
		
		
		
		
	}

}
