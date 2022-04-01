package com.edu;

import java.util.Scanner;

public class RectangleExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("가로 길이: ");
		int xLength = scn.nextInt(); 
		
		System.out.println("세로 길이: ");
		int yLength = scn.nextInt(); 
		
		int area = xLength* yLength;
				
		System.out.println("계산(너비) 결과 : " + area + "입니다.");
		
		scn.close();
	}

}
