package com.dev;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		
		week today = week.MONDAY;
		
		Calendar day = Calendar.getInstance();
		System.out.println(day.get(Calendar.DAY_OF_WEEK));
		
		switch(day.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println(week.SUNDAY); break;
		case 2:
			System.out.println(week.MONDAY); break;
		case 3:
			System.out.println(week.TUESDAY); break;
		case 4:
			System.out.println(week.WEDNESDAY); break;
		case 5:
			System.out.println(week.THURSDAY); break;
		case 6:
			System.out.println(week.FRIDAY); break;
		case 7:
			System.out.println(week.SATURDAY); break;
		}
	}
}
