package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
		conn = getConnect();
		String sql = "INSERT INTO student_info (student_no, student_name, eng_score, kor_score) "
				+ "VALUES(?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getStudentNumber());
			psmt.setString(2, student.getStudentName());
			psmt.setInt(3, student.getEngScore());
			psmt.setInt(4, student.getKorScore());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		

	}

	

	@Override
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>(); // 조회된 결과값을 담기위한 컬렉션
		conn = getConnect();
		String sql = "SELECT * FROM student_info ORDER BY student_no";
		try {
			psmt = conn.prepareStatement(sql); // sql을 실행하기 위한 인스턴스를 prepareStatement로 만들어줌 psmt는 prepareStatement 의 변수
			rs = psmt.executeQuery(); // 실행 건수만큼 반복자 executeQuery 결과값을 rs에 저장
			while (rs.next()) { // next메소드가 rs에 담긴 게 있으면 하나씩 꺼내옴
				Student student = new Student(); // list 컬렉션에 student를 하나씩 담아줌
				student.setStudentNumber(rs.getInt("student_no"));
				student.setStudentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));

				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;

	}

	@Override
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "UPDATE student_info " 
		+ "SET eng_score = ? , " 
	    + "kor_score = ? "
		+ "WHERE student_no = ?"; 
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getEngScore());
			psmt.setInt(2, student.getKorScore());
			psmt.setInt(3, student.getStudentNumber());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		

	}

	@Override
	public void removeStudent(int sno) {
		conn = getConnect();
		
		String sql = "DELETE FROM student_info " + "WHERE student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public List<Student> searchStudent(String name) {
		conn = getConnect();
		List<Student> list = new ArrayList<Student>();
		
		String sql = "SELECT * "
				+ "FROM student_info "
				+ "WHERE student_name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
		Student student = null;
			while(rs.next()) {
				student = new Student();
				student.setStudentNumber(rs.getInt("student_no"));
				student.setStudentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
			
				list.add(student);
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public void saveToFile() {

	}

	@Override
	public Student getStudent(int sno) {
		// TODO Auto-generated method stub
		return null;
	}

}
