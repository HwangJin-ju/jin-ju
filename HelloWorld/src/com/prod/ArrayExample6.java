package com.prod;

public class ArrayExample6 {
	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		// 배열의 값이 30보다 크고 40보다 작은 값의 합, 평균
		
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]>30 && numbers[i]<40) {
				sum += numbers[i];
				cnt++;
			}
		}
		System.out.println("30보다 크고 40보다 작은 값의 합은 " + sum + "입니다.");
		System.out.println ("이 값의 평균은 " + (sum / (double) cnt) + "입니다.");
	}

}
