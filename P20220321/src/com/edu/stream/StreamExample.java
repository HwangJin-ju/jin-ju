package com.edu.stream;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	String name;
	String gender;
	int score;
	int point;

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	@Override
	public String toString() {
		return  "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point + "]";
	   }

	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}

@Override
public int compareTo(Student student) {
	// this 와 student 비교 : this, student => 음수. 내림차순 : 양수.
//	if(this.score < student.score) {
//		return -1;
//	} else {
//		return 1;
//	}
	return (this.score + this.point) - (student.point + student.score); // 60, 70  => 음수 오름차순
}

	
}

public class StreamExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70));
		list.add(new Student("김순희", "여자", 80));
		list.add(new Student("김부식", "남자", 85));
		list.add(new Student("박한나", "여자", 88));

		
		// 평균구하기 by 컬렉션
		int sum = 0, cnt = 0;
		double avg = 0;
		for (Student student : list) {
			if (student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}
		}
		avg = sum / (double) cnt;
		System.out.println("컬렉션으로 가져온 평균 : " + avg);
			
		// 평균구하기 by 스트림
		Stream<Student> stream = list.stream(); // 집계 처리를 위한 스트림 생성
		OptionalDouble od = stream.filter((s) -> s.gender.equals("남자")).mapToInt((s) -> s.score).average();
		avg = od.getAsDouble(); //OptionalDouble은 값 바로 출력 안되고 메소드로 가져와서 함
		System.out.println("스트림으로 가져온 평균 : " + avg);
		
		
//		stream.forEach((Student t) -> {
//				System.out.println("이름: " + t.name + " 성별: " + t.gender + " 점수: " + t.score);
//		});
	}

	
}
