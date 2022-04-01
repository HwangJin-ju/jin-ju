package com.edu;

public class BitExample {
	public static void main(String[] args) {
		int num = 10;
		int result = num << 3;
		System.out.println(result);
		
		int val = 100;
		val = val + 10;
		System.out.println(val);
		val += 20;
		
		System.out.println(val);
		
		val = val - 5;
		val -= 10; 
		
		val = val *2;
		val *= 2;
		
		String message = "반갑습니다.";
		System.out.println(message);
		
		message = message + " 황진주입니다.";
		System.out.println(message);
		
		message += " 좋은 하루 되세요!"; //문자라서 *는 안 됨.
		System.out.println(message);
		
		int cnt = 0;
		cnt = cnt + 1;
		cnt += 1;
		cnt ++;
		cnt --;
		System.out.println(cnt);
		
	
		
		
	}

}
