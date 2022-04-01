package com.prod;

public class MemberExample {
	public static void main(String[] args) {
		// int num1=10;
		// String name = "홍길동";
		// ?? member = "홍길동", 10;
		
		Member mem1 = new Member(); //이 시점에서 name, age 속성의 값은 없음 현재는 null과 0
		mem1.name = "홍길동";
		mem1.age = 20;
		
		System.out.println("mem1의 name 속성: " + mem1.name);
		System.out.println("mem1의 age 속성: " + mem1.age);
		
		Member mem2 = new Member(); // new Member로 초기화 꼭 필요함
		mem2.name = "김민수";
		mem2.age = 25;
		
		Student st1 = new Student(); // 초기화 
		st1.studentNo = "22-1234987";
		st1.studentName = "김영희";
		st1.korScore = 90;
		st1.engScore = 80;
		
		Student st2 = new Student();
		st2.studentNo = "22-2234987";
		st2.studentName = "김철수";
		st2.korScore = 10;
		st2.engScore = 8;
				
		
	}
}
