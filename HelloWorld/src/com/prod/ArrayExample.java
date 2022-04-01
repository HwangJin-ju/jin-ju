package com.prod;

public class ArrayExample {
	public static void main(String[] args) {
		int i1 = 100; // 4byte만큼 데이터를 담을 수 있다
		byte b1 = 127; // 1byte만큼 데이터를 담을 수 있다 -128~-1까지 총 128개 0~127까지 총 128개
		b1++;
		b1++;
		short s1 = 100; // 2byte -32768~-1 / 0~32767
		long l1 = 12343548690384590L; // 8byte L 붙이는 이유는 long형 타입의 정수라는 것을 알려주기 위함
		System.out.println(Short.MIN_VALUE);

		int sum = 0;
		int score1 = 80;
		int score2 = 90;
		int score3 = 85;
		int score4 = 95;
		int score5 = 88;

		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;

		double avg = sum / (double) 5;

		int[] scores = new int[5];
		// scores는 int형 데이터 5개를 담을 수 있는 변수라고 선언
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 95;
		scores[4] = 88;

//		System.out.println(scores[0] + scores[1]);
		// 배열을 활용해서 sum => avg
		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += scores[i];
//			System.out.println(scores[i]); //scores[0],[1],[2] ...
		} // sysout score[0]~[4]까지 5번하는 것과 같음
		avg = sum / (double) 5;
		System.out.println("평균은 " + avg);
	}
}
