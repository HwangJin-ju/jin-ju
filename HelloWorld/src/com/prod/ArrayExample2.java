package com.prod;

public class ArrayExample2 {
	public static void main(String[] args) {
		// ages -> int
		int[] ages = new int[3];
		ages[0] = 20;
		ages[1] = 23;
		ages[2] = 27;
		
		for(int i = 0; i<3; i++) {
			System.out.println(ages[i] + "살입니다.");
		}
		
		int sumAge=0;
		double avgAge=0;
		
		for(int i = 0; i<3; i++) {
			sumAge += ages[i];
			avgAge = sumAge / 3;
		}
		System.out.println("합은 " + sumAge + "입니다.");
		System.out.println("평균 나이는 "+ avgAge+ "입니다.");
		
		
		
		ages[0] = 30; //변수라서 위에 거 안 지워도 값이 변함
		ages[1] = 32;
		ages[2] = 35;
		
		sumAge = 0;
		avgAge = 0;
		
		for(int i = 0; i<3; i++) {
			sumAge += ages[i];
			avgAge = sumAge / 3;
		}
		
		System.out.println("합은 " + sumAge + "입니다.");
		System.out.printf("평균 나이는 " + avgAge + "입니다.");
	
	
	
	
	
	
	}
}
