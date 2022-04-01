package com.edu.collect;

public class Student {
	// 학생번호(int), 이름(홍길동), 영어(80), 국어(70).
	
	private int studentNumber;
	private String studentName;
	private int engScore;
	private int korScore;
	
	

	public Student(int studentNumber, String studentName, int engScore, int korScore) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.engScore = engScore;
		this.korScore = korScore;
	} 

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	@Override // toString 메소드를 재정의
	public String toString() {
		return "학생 정보 [ 학생번호 : " + studentNumber + ", 이름 : " + studentName + ", 영어점수 : " + engScore + ", 국어점수 : " + korScore + "]"; 
		
	}
	
	
	
}
