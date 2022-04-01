package com.edu.collect;

import java.util.List;

public interface StudentService { //기능만 정의함. 얘를 구현하는 클래스에서 실체 구현을 해야 함 여기서는 StudentImpl 클래스
	public void insertStudent(Student student); //컬렉션에 입력할 용도
	public Student getStudent(int sno); //sno(학생번호)를 넣으면 학생정보를 가져옴 한 건만 조회
	public List<Student> studentList(); //전체목록
	public void modifyStudent(Student student); //한 건만 수정
	public void removeStudent(int sno); //한 건만 삭제
	public List<Student> searchStudent(String name); //이름조회 같은 이름이면 다 리턴해야 하기 때문에 리스트
	public void saveToFile();
}
