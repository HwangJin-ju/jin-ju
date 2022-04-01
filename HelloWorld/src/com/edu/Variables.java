package com.edu;

public class Variables {
	public static void main(String[] args) {
//		변수 : 메모리 공간에 이름을 지정하고 그 이름에 값을 할당한다.
		int age = 20; // 20 == 30
		int num1 = 60;
		int num2 = 50;
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.println("age변수: " + age);
		System.out.println("20 + 10 = 30");
		
		String name = "홍길동"; // 문자열
		name = "최민규";
		System.out.println(name + "의 나이는 " + age + "입니다." );
		
		final String myName = "황진주"; // 상수
//		myName = "진주황";
		
		// 전화번호, 이메일 값을 담을 수 있는 변수
		
		String myNumber = "010-9505-4079";
		String myMail = "hjj3343@gmail.com";
				
		
		System.out.println("황진주의 전화번호는 " + myNumber + "이고 " + "황진주의 이메일은 " + myMail + "입니다.");
		
	}

}
