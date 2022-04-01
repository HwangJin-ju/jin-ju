package com.prod;

// 클래스의 속성이나 메소드를 정의
public class Calculator {
	
	double PI = 3.14;
		// int 타입의 매개변수 (parameter)
	int add(int n1, int n2) {
		return n1 + n2;
	}
	
	int minus(int v1, int v2) {
		return v1 - v2;
	}
	
	double getRectArea (double x, double y) { 
		return x * y;
	}
	
	double getCircleArea (double radius) {
		return PI * radius * radius; 
	}

}
