package com.edu.api;

public class ApiExample {
	public static void main(String[] args) {
		
		IDCheck idcheck = new IDCheck();
 		String result = idcheck.getGender("9908194567890");
		System.out.println(result);
	
		
		
		Math.random(); // new Math();
		long result2 = Math.round(3.5);
		System.out.println("3.5의 반올림: " + result2);
		double r1 = Math.ceil(3.1);
		System.out.println("3.1의 올림: " + r1);
		r1 = Math.floor(3.9);
		System.out.println("3.9의 버림: " + r1);
		Math.abs(-30);
		System.out.println("end of prog");
	}
}
