package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// Map: {key:value}, {key2:value2} 키와 밸류가 쌍으로 저장됨 제네릭 타입은 각각 설정해 줘야 함  
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("전민욱", 80);
		map.put("김형민", 82);
		map.put("김영민", 85); //키는 밸류를 구분해주기 위한 요소이므로 중복돼선 안됨 중복으로 들어오면 이전 값이 없어지고 새로운 값으로 덮어씌워짐
		map.put("김영민", 88); 
		
		// 컬렉션 : 여러 값을 저장
		
		Integer val = map.get("김영민");
		System.out.println(val);
		
		Set<String> keySet = map.keySet(); //map 컬렉션에 저장된 요소들의 키에 해당하는 값만 뽑아서 Set 컬렉션에 담아줌
		
		// 1)반복자 이용
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key : %5s, value : %5d \n", key, value);
		
		}
		
		// 2) for( : ) 이용 - 확장 for
		for(String key : keySet) { //set컬렉션(keySet)에 들어있는 만큼 반복 -> 횟수가 정해져 있음 그후 key에 담아준다
			Integer value = map.get(key);
			System.out.printf("key : %5s, value : %5d \n", key, value);
		}
		
		
		
		
		System.out.println("end of prog");
	
	}
}
