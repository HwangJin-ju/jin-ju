package com.edu.collect;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

// StudentServiceImpl(중첩 클래스의 기능 대체)
// 입력, 수정, 삭제 => 파일에 저장이 되도록

public class StudentServiceFile implements StudentService {

	// 필드
	List<Student> list = new ArrayList<Student>();
	File file;

	// 생성자
	// 파일에 저장되어있던 정보를 읽어서 기본생성자에 list값을 담아준다
	public StudentServiceFile() {
		try {
			FileReader fr = new FileReader("studentList.data"); // 읽기 용도로 생성된 스트림
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) { // 데이터의 한 라인을 읽어들이는 메소드 두 줄이 있으면 두 번 읽어들이고 세 번째에서 null
				String[] contents = readBuffer.split(","); // 101,홍길동,80,90 -> ,를 기준으로 이 값을 하나씩 분리하여 ArrayList에 저장
			//	contents[0] <= 101, contents[1] <= 홍길동, contents[2] <=80, contents[3] <=90
				
				//list에 담을 생성자를 만듦                //여기 들어있는 정보는 데이터 파일에 저장되어있던 값을 읽어들인 것
			list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]), Integer.parseInt(contents[3])));
				          // 101이 contents[0] 이라는 문자타입으로 담겨 있기 때문에 정수형으로 바꿔줌
				
			}
			br.close();
			fr.close();
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 메소드
	@Override
	public void insertStudent(Student student) {
		list.add(student);
	}

	@Override
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNumber() == sno) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Student> studentList() {
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
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
		// 작성했던 ArrayList<Student> list => 파일에다 저장
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw); // 보조스트림의 생성자의 매개값에 기본스트림

			for (Student stud : list) {
				bw.write(stud.getStudentNumber() + "," + stud.getStudentName() + "," + stud.getEngScore() + ","
						+ stud.getKorScore() + "\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
