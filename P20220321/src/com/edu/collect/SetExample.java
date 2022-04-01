package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>(); //Set => 중복값은 허용하지 않는다 순서없이 저장이 되므로 인덱스 값으로 불러올 수 없다
		set.add("Hello");
		set.add("World");
		set.add("Good");
		set.add("World"); //중복된 요소는 추가 불가
		
		set.remove("Good");
		
		System.out.println("set 크기: " + set.size());
		
		Iterator<String> iter = set.iterator(); //반복자 : 요소를 하나씩 선택해 오는 기능
		while (iter.hasNext()) { //반복자를 개수만큼 꺼내올 요소가 있는지 -> t/f를 반환한다
			String result = iter.next();
			System.out.println(result);
		}
		System.out.println("end of prog");
	}
}
