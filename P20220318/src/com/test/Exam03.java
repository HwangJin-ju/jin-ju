package com.test;

import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성.
public class Exam03 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] array = new int[3];
		array[0] = scn.nextInt();
		array[1] = scn.nextInt();
		array[2] = scn.nextInt();
  
		int max = array[0];
		for (int i = 0; i< array.length; i++) {
			if(array[i] > max) {
				max = array [i];
			}
			System.out.println(array[i]);
		}
		System.out.println("최대값 : " + max);
	}
}
