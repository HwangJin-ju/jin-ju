package com.edu;

public class ArraySort {
	// int[] intAry => {34, 25, 48, 12}

	public static void sorting(int[] ary) {

		int loopCnt = ary.length - 1; // 마지막 값이 제일 처음 위치로 이동하려면 배열크기-1;
		for (int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = ary[0]; // 첫번째 값으로 temp 값을 지정
			for (int i = 0; i < loopCnt; i++) {
				if (ary[i] > ary[i + 1]) {
					temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;
				}

			}

		}
	}

	public static void main(String[] args) {

		int[] intAry = { 34, 25, 48, 12, 8 };
		int[] intAry2 = { 22, 56, 99, 12 };
		int[] intAry3 = { 22, 56, 99, 12 };

		sorting(intAry);

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");
		}
		System.out.println();

		sorting(intAry2);

		for (int i = 0; i < intAry2.length; i++) {
			System.out.println(intAry2[i] + " ");
		}
		System.out.println();

		sorting(intAry3);

		for (int i = 0; i < intAry3.length; i++) {
			System.out.println(intAry3[i] + " ");
		}
		System.out.println();
		System.out.println("\nend of prog");

	}
}
