package com.edu.api;

import java.util.Calendar;

public class CalendarExample {
	
	public static void createCalendar(int year, int month) {
		
		Calendar today = Calendar.getInstance();
		today.set(year, month-1, 1);
		
		System.out.println("올해는 : " + today.get(Calendar.YEAR));
		System.out.println("이번 달은 : " + (today.get(Calendar.MONTH) + 1)); // 1월 : 0 2월 : 1 3월 : 2
		System.out.println("오늘은 : " + today.get(Calendar.DATE));
		System.out.println("요일정보 : " + today.get(Calendar.DAY_OF_WEEK)); // 일 : 0
		System.out.println("마지막날의 정보 : " + today.getActualMaximum(Calendar.DATE));
		
		int lastDate = today.getActualMaximum(Calendar.DATE);
		int gapDay = today.get(Calendar.DAY_OF_WEEK);
		
		
		//요일 정보 출력
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0 ; i <days.length; i++) {
			System.out.printf("%4s", days[i]); // 뒤에 오는 글자를 4개 칸에 걸쳐서 표현하겠다
		}
		System.out.println();
		
		//1일의 위치 지정
		for (int i = 1; i <gapDay; i++) { // gapDay로 언제가 1일인지 가져와서 거기부터 시작
			System.out.printf("%4s", ""); // 괄호안에는 날짜 간격
		}
		
		//날짜 출력
		for(int i=1 ; i<= today.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d", i); //뒤에 오는 값이 정수면 d 문자열이면 s
			if((i+gapDay-1)%7 ==0) {
				System.out.println();
			}
		}
		//프로그램의 끝부분
		System.out.println();
		System.out.println("end of prog");
	}
	
	public static void main(String[] args) {
		
		int year = 2022;
		int month = 10; // 5월
		
		
		createCalendar(year, month);
		
		
	}
	
	
}
