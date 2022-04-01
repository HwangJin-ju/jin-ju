package com.edu.except;

import java.util.Calendar;
import java.util.Scanner;

// class String2 extends String{ -> 불가능 class에 final이 붙으면 상속이 불가능함  
	
//}

public class ExceptionExample2 {
	public static void main(String[] args) {
		
		// Object(최상위에 존재하는 클래스)
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		
		obj = new Object();
		System.out.println("obj의 해시코드: " + obj.hashCode());
		
		// Exception 
		try {
			Class.forName("java.lang.String1");
		} catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다");
		}
		
		// RuntimeException
		String str = null; 
		
		
		try {  //try 안에서 오류가 발생하면
			str.charAt(0); 
			System.out.println(str.toString());
		}catch (NullPointerException e) { // catch 안의 구문 실행
			System.out.println("널포인트 예외발생");
			e.printStackTrace(); // 에러 위치와 종류 보여줌
		}
		
		String nums1 = "백"; // 숫자 문자열
		String nums2 = "이백"; // 숫자 문자열
		int num1,num2;
		
		try {
			num1 = Integer.parseInt(nums1); // int 변환. parseInt : 문자를 숫자로 바꿔줌
			num2 = Integer.parseInt(nums2); // int 변환
			
			str.charAt(0);
		}catch (Exception e) {
			num1 = 0;
			num2 = 0;
			
			System.out.println("상위의 예외발생");
		} 
			
		
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		
		try {
			showError ();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
		
		System.out.println("end of prog");
			
	} // end of main()
	
	public static void showError() throws ClassNotFoundException { //예외 떠넘기기
			
		Class.forName("java.lang.Strings");
		}
		
	
		
		
}// end of class

