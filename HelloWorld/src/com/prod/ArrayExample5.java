package com.prod;

public class ArrayExample5 {
	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		// 1,3,5,7번째 위치에 있는 값만 다 더하고, 그 평균 구하기
		
		int sum = 0;
		int cnt = 0;
	
		for(int i = 0; i < numbers.length; i++) {
			if((i+1) % 2 == 1) { // i % 2 == 0
				sum += numbers[i];
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(sum / (double) cnt);
	}
}
