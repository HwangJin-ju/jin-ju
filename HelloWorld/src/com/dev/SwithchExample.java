package com.dev;

public class SwithchExample {
	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)
		int randVal = (int) (Math.random() * 3) + 1;
		
//		if(randVal == 1) {
//			System.out.println("가위입니다.");
//		} else if (randVal == 2) {
//			System.out.println("바위입니다.");
//		} else {
//			System.out.println("보입니다.");
//		}
		
		switch(randVal) {
		case 1: // 값이 문자면 "" 넣어 줘야 함.
			System.out.println("가위입니다.");
			break; // 아래 구문 실행하지 말고 빠져나오는 명령.
		case 2:
			System.out.println("바위입니다.");
			break;
		case 3:
			System.out.println("보입니다.");
		}
		
		System.out.println("end of prog");
	}

}
