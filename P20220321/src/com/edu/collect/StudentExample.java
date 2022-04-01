package com.edu.collect;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		//Student s1 = new Student(); // 기본생성자를 선언했으므로 이것도 가능
		Student s1 = new Student(101, "홍길동", 70, 73);
		Student s2 = new Student(102, ""
				+ "김주환", 80, 85);
		Student s3 = new Student(103, "이재학", 84, 88);
		
		list.add(s1); // 값을 담을 때는 add
		list.add(s2);
		list.add(s3);
		
		Student result = list.get(0); // 첫번째 학생정보를 result 변수에 저장
		System.out.println("첫번째 학생: " + result.toString());
		
		list.set(0, new Student(201,"서현일",90, 92)); //첫번째 학생 정보 바꿈 by 새로운 인스턴스를 만들어서 인스턴스 자체를 변경
		result = list.get(0); //바꾼 정보 다시 가져옴
		
		list.get(0).setKorScore(100);
		list.get(0).setEngScore(100); // 과목별 점수바꾸기 by 첫번째 인스턴스 값을 바꿈
		
		list.remove(0); //삭제처리 배열과는 다르게 첫번째 자리를 비워두지 않고 뒤에 있는 값을 당겨옴 
		
		
		System.out.println("첫번째 학생: " + list.get(0).toString() );
	}
	


}
