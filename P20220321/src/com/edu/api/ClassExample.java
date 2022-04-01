package com.edu.api;

import java.lang.reflect.Method;

public class ClassExample { // 클래스 이름이 class
	// String, System, Member => 관리하는 class :Class
	public static void main(String[] args) {
		Class cls = String.class; // String이라는 클래스의 정보를 cls에 담겠다는 뜻
		try {
			cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		Method[] methods = cls.getMethods();
		for (Method met : methods) { // methods라는 배열에 들어있는 만큼만 반복하겠다 (확장 for문) methods에서 받아온 값을 met에 저장
			System.out.println("메소드 이름: " + met.getName());
		}
		
		cls = Member.class;
		String path = cls.getResource("ClassExample.class").getPath();
		System.out.println(path);
	}
	 
}
