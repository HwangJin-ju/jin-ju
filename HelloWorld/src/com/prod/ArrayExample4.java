package com.prod;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		int sum = 0; // 나중에 배열에 몇 개 더 추가해도 따로 수정할 필요 없음
		int cnt = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
				cnt++; // if 구문 돌아갈 때마다 올라감
			}

		}
		System.out.println("짝수의 합은 " + sum + "입니다.");
		System.out.println("짝수의 평균은 " + (sum / (double) cnt) + "입니다.");
	}
}
