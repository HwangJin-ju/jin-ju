package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 기본 생성자
	public StudentApp() {

	}

	// 멤버클래스
	class StudentServiceImpl implements StudentService { // StudentService라는 인터페이스 구현하는 클래스 추상메소드의 실체를 만든다

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
		}

		@Override
		public Student getStudent(int sno) {
			for (int i = 0; i < list.size(); i++) { // list 컬렉션 안에서 매개값으로 받은 학생 번호 한 건만 조회
				if (list.get(i).getStudentNumber() == sno) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() { // 전체 학생 리스트
			return list;
		}

		@Override
		public void modifyStudent(Student student) { // 수정
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNumber() == student.getStudentNumber()) {
					list.get(i).setEngScore(student.getEngScore()); // 영어 점수 수정
					list.get(i).setKorScore(student.getKorScore()); // 국어 점수 수정
				}

			}

		}

		@Override
		public void removeStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNumber() == sno) {
					list.remove(i);
				}

			}

		}

		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchList = new ArrayList<Student>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentName().equals(name)) {
					searchList.add(list.get(i));
				}
			}
			return searchList;
		}

		@Override
		public void saveToFile() {
			System.exit(0);
		}
	} // end of StudentServiceImpl

	// 메인 기능 담당하는 execute()
	public void execute() {
		// 메뉴 : 1.추가 2.리스트 3.한건조회 4.수정 9.종료

		StudentService service = new StudentServiceOracle(); // 구현클래스는 인터페이스의 변수가 될 수 있다
		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 5.삭제 6.이름으로 조회 9.종료");
			System.out.print("선택>>");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 학생정보 추가입력 : 학생 번호, 이름, 영어 점수, 국어 점수
				System.out.println("학생번호입력>>");
				int stuNo = scn.nextInt();
				System.out.println("학생이름입력>>");
				String name = scn.next();
				System.out.println("영어점수입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어점수입력>>");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, name, engScore, korScore);
				service.insertStudent(s1);

				System.out.println("저장되었습니다");

			} else if (menu == 2) {

				List<Student> list = service.studentList();
				for (Student s : list) { // list에 담겨있는 건수만큼 반복
					System.out.println(s.toString());
				}

			} else if (menu == 3) { // 한건 조회
				System.out.println("조회할 학생번호 입력>>");
				int studNo = scn.nextInt();
				Student student = service.getStudent(studNo);
				if (student == null) {
					System.out.println("조회된 결과가 없습니다.");
				} else {
					System.out.println(student.toString());
				}

			} else if (menu == 4) {

				System.out.println("수정할 학생번호입력>>");
				int stuNo = scn.nextInt();
				System.out.println("영어점수입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어점수입력>>");
				int korScore = scn.nextInt();

				Student stu = new Student();
				stu.setEngScore(engScore);
				stu.setKorScore(korScore);
				stu.setStudentNumber(stuNo);

				service.modifyStudent(stu);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) {

				System.out.println("삭제할 학생번호입력>>");
				int stuNo = scn.nextInt();
				Student student = new Student ();
				if( student.getStudentNumber() == stuNo) {
					service.removeStudent(stuNo);
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("없는 번호입니다.");
				}
				

			} else if (menu == 6) {

				System.out.println("조회할 학생이름입력>>");
				String studName = scn.next();
				List<Student> list = service.searchStudent(studName);
				
				for( Student l : list) {
					System.out.println(l);
				}
				
			}

			else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				service.saveToFile();
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println("end of program");

	}

}
