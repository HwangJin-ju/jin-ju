package com.edu.api;

public class SystemExample {
	public static void main(String[] args) {
		
		System.out.println("start");
//		System.exit(0); // 프로그램 강제 종료
		System.out.println("end");
		
		long currentTime = System.currentTimeMillis(); // 현재 시간을 long형으로 만들어 준다 
		System.out.println(currentTime);
		// 24*60*60*1000 = 하루의 총 초를 msec값으로 나타낸 것
		long days = currentTime/(24*60*60*1000);
		System.out.println(days); // 19073 1970년 1월 1일부터 19073일 지났다는 뜻
		long years = days/365;
		System.out.println(years); // 52 1970년부터 52년 지났다는 뜻
		
		currentTime = System.currentTimeMillis();
		long sum = 0;
		for (int i = 0; i< 1000000; i++) {
			sum += i;
		}
		System.out.println("summary: " +sum);
		long endTime = System.currentTimeMillis();
		
		System.out.println("연산에 걸린 시간: " + (endTime - currentTime) + "(msec)");
		
	}
}
