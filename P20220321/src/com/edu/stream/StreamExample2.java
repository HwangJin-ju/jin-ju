package com.edu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70, 100));
		list.add(new Student("김순희", "여자", 80, 120));
		list.add(new Student("김부식", "남자", 85, 95));
		list.add(new Student("박한나", "여자", 88, 99));

		// 남자, 여자 스코어 + 포인트 > 180이상인 학생들만 출력

		    list.stream() // 리스트 컬렉션으로부터 스트림 메소드 생성하면 컬렉션을 스트림으로 바꿔줌
				.filter(student -> student.score + student.point >= 180)
				.sorted() // Comparable을 구현하는 클래스여야 크기 비교가 가능해진다
				.forEach(student -> System.out.println(student)); // 필터링된 대상을 출력
		    
		    System.out.println();
		    System.out.println("===================================================");
		    System.out.println();
		    
		    list.stream() // 리스트 컬렉션으로부터 스트림 메소드 생성하면 컬렉션을 스트림으로 바꿔줌
				.filter(student -> student.score >=80)
				.filter(student -> student.gender.equals("여자"))
				.forEach(student -> System.out.println(student)); // 필터링된 대상을 출력
	
	}
}
