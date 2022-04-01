package com.dev;

import com.edu.Student;

public class GugudanEx {
	public static void main(String[] args) {

		int result = sum(sum(10,20), sum(5,7));
		int[] newAry = {10,20,30};
		result = sum(newAry);
		
		System.out.println("결과는 " + result);
		System.out.println(divide(15,4));
		
		

	} // end of main()
	
	public static int sum(int[] ary) {
		//배열매개변수의 각 요소의 합을 구하는 메소드
		int sum = 0;
		for(int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	
	//나누기 메소드 매개변수는 int 두 개
	
	public static double divide(int num1, int num2) {
		if (num2 == 0 ) {
			return 0;
		}
		return (double) num1 / num2 ;
		
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void gugudan(int dan) {
		for (int i = 1; i <=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	

	public static void printStar(int runCnt, String shape) {
		for (int i = 0; i < runCnt; i++) {
			System.out.print(shape);
		}
	}

	public static void printGugudan() {
		// 원래는 메소드 실행하려면 new 클래스 이름(); 으로 인스턴스 생성했어야 사용 가능했음 ex) Student s1 = new
		// Student();
		// static 키워드가 있으면 클래스를 실행하는 시점에 메모리에 준비돼서 바로 실행가능
		
		for (int n = 2; n < 10; n++) {
			System.out.print("[" + n + "단]     ");
		
		}
		
		for (int j = 1; j < 10; j++) {
			int cnt = j;
			System.out.println("");
			for (int i = 2; i < 10; i++) {
				System.out.printf("%2d * %2d = %2d ", i, cnt, (i * cnt));
			}
			 System.out.println();
			///
		}
	} // end of printGugudan()

} // end of GugudanEx.
