package com.edu.collect;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		String[] strings = new String[10]; // 문자열을 담을 수 있는 배열
		for(int i = 0; i<strings.length; i++) {
			if(strings[i] == null) {
				strings[i] = "hello";
				break;
			}
		}
		
				//제너릭
		ArrayList<String> strAry = new ArrayList<String>(); // 문자열을 담을 수 있는 배열 공간
		strAry.add("hello"); //추가 : 간단하게 add라는 메소드를 이용해서 값을 넣으면 됨
		strAry.add("world");
		
		strAry.get(1); //해당되는 인덱스 값 가져오기
		strAry.set(1, "월드"); //수정 : 두 번째에 있는 world를 월드로 바꿈
		strAry.remove("hello"); //삭제 : 간단하게 remove라는 메소드를 이용해서 값을 지움 인덱스 값이나 값을 넣으면 됨 ex. 0, hello
		strAry.clear(); //다 삭제
		System.out.println("strAry.size() => " + strAry.size());
		
		for(int i = 0; i<strAry.size(); i++) {
			String result = strAry.get(i);
			System.out.println(result);

		}
		
		
		
				
//		ArrayList<Integer> numAry = new ArrayList<Integer>();
//		for(int i = 0; i<numAry.size(); i++) {
//			int result = numAry.get(i);
//		}
		
		
	}
}
