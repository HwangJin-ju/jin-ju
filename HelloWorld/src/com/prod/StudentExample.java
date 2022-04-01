package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); //속성, 메소드 등 쓰기 위해서는 초기화 필수
		s1.studentName = "홍길동";
		s1.korScore = 80;
		s1.engScore = 85;
		s1.study("영어");
		s1.eat("급식");
		s1.eat("간식");
		s1.eat("초콜릿"); //argument
		
		int v1 = s1.getKorScore();
		int v2 = s1.getEngScore();
		
		System.out.println("국어 점수 : " + v1 + ", 영어 점수 : " + v2);
	}
	
	
}
