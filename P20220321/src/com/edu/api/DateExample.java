package com.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date today = new Date("2022/01/01 00:00:00");
		today.setYear(120); // 기준이 1900 년
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초" );
		System.out.println(sdf.format(today));
		
		LocalDate time = LocalDate.now();
		System.out.println(time.getYear() + "년");
		
	}
}
