package com.edu;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		
		System.out.println("초 단위 입력(ex: 150)");
		int inputVal = scn.nextInt();
	    
		int hour = inputVal / 3600;
		int minute = (inputVal % 3600) / 60;
		int second = inputVal % 3600 % 60;
	

	
		System.out.println("초 -> 시/분/초 변경 결과: " + hour + "시 " + minute + "분 " + second + "초 입니다.");
		
		scn.close();
		
		
				
	}

}
