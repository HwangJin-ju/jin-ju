package com.edu;

public class VariableExample {
	public static void main(String[] args) {
		// 변수의 타입
		int num1 = 100;  // int : 정수 4bytes
		double num2 = 100.5; // double : 실수 (소수점까지 표현) 8bytes
		double result = num1 * num2 ; // 큰 것 기준으로 result 변수를 정해야 함 (int < double) num1도 자동으로 형변환을 시켜준다. 자동형변환(promotion) : 작은 범위의 변수 -> 큰 범위의 변수 
		System.out.println("결과: " + result);

		//강제형변환(casting) : 큰 범위의 변수 > 작은 범위의 변수
		int val1 = 100;
		double val2 = 20.5; // 강제형변환으로 20이 됨
		int sum = val1 + (int) val2;
		System.out.println("결과: " + sum);
		
		int n1 = 11;
		int n2 = 4;
		
		double n3 = (double) n1 / n2; // 10/4=2.5 -> n1, n2가 정수형이므로 정수형으로 나온 값에 double이므로 2.0 이 됨 연산하는 시점에 n1이나 n2를 double로 지정해야 한다.
		System.out.println("나눈 결과: " + n3);
		
		// 나머지 10을 3으로 나눈 나머지 => 1
		int n4 = n1 % n2;
		System.out.println("나머지: " + n4);
		
		// 짝수, 홀수 판별 ( if %2 )참이면 if 안의 구문 실행
		if (n1 % 2 == 1) {
			System.out.println(n1 +"은 홀수입니다.");
		}

	}

}
