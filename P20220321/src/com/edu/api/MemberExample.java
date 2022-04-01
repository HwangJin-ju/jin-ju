package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue", "abc");
		Member obj2 = new Member("blue", "abc");
		Member obj3 = new Member("red", "abc2");
		
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		// 배열 -> 컬렉션(ArrayList, HashSet, HashMap) : 여러 개의 값을 저장. 배열과 같은 기능인데 기능이 더 좋음
		Member[] memberAry = new Member[5]; // Member의 인스턴스 최대 5개 저장
		//크기가 초과하면 새로운 배열 선언하고 원래 있던 배열을 복사 새로운 값 추가 또 크기 초과하면 반복해야 함 -> 번거로움 -> ArrayList 사용
		
		ArrayList<Member> memList = new ArrayList<Member>(); //똑같은 값이 들어와도 index로 관리하기 때문에 다른 주소값이 찍힌다
		memList.add(new Member("obj1", "blue"));
		memList.add(new Member("obj1", "blue"));
		
		for (int i=0; i <memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		
		HashSet<Member> memSet = new HashSet<Member>(); // set타입의 컬렉션은 같은 값이면 ArrayList와 다르게 저장 안 함
		memSet.add(new Member("obj1", "blue")); // 논리적으로 같은 값인지 아닌지 hashCode(), equals()가 관여함 
		memSet.add(new Member("obj1", "blue"));
		
		System.out.println(memSet.size());
		
		
//		if(obj1.equals(obj3)) {
//			System.out.println("obj1과 obj3는 동등합니다.");
//		} else {
//			System.out.println("obj1과 obj3는 동등하지 않습니다.");
//		}
		
	}
}
