package com.prod;

//정의한 걸 호출
public class CalExample1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.PI);
		
		int number1 = 10;
		int number2 = 20;
								//매개값(argument) 바로 실제 값 10, 20 등 넣어도 됨
		int result = cal.add(number1, number2);
		System.out.println(number1 + "과 " + number2 + "의 합은 " + result + "입니다.");
		
		result = cal.minus(number1, number2);
		System.out.println(number1 + "과 " + number2 + "의 차는 " + result + "입니다.");
			
		double area = cal.getRectArea(number1, number2);
		System.out.println("가로 길이 " + number1 + ", 세로 길이" + number2 + "인 사각형 넓이는 " + area + "입니다.");
		
		double r = 4.5;
		area = cal.getCircleArea(r);
		System.out.println("반지름 넓이가 " + r + "인 원의 넓이는 " + area + "입니다.");
	}

}
