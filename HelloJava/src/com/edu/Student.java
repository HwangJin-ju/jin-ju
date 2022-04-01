package com.edu;

public class Student { //public 클래스
	// 학생번호, 학생이름, 국어점수, 수학점수, 영어점수 <= 필드로 정의
	// private으로 막아놨기 때문에 다른 클래스에서 접근 불가하여 필드에 값을 직접 넣을 수 없다 ->메소드로 구현해야 함
	private int studNo;
	private String studName;
	private int korScore = -1;
	private int mathScore = -1;
	private int engScore = -1;
	
	// 생성자 : 필드의 값을 초기화할 때 사용한다
	Student() {// class 이름과 같기 때문에 반환값이 없어도 생성자로 알아들음
		this.studNo = 1;
		this.studName = "Nobody";
		this.korScore = 0;
		this.engScore = 0;
	} 
	
	
	Student(int studNo) {
		this.studNo = studNo;
	}
	
	public Student(int studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName;
	}
	
	

	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		this.studNo = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	
	// static method
	public static void callStatic() { 
		System.out.println("정적메소드 실행");
	}


	// 영어, 국어, 수학 ==> 값 저장되면 평균
	public double getAvgScore() { //default 접근 -> 앞에 아무것도 안 적으면 디폴트. 특별한 일 없으면 보통 public 쓰면 됨
		return this.getSumScore() / 3.0; // getSumScore는 여러 개가 아니라 하나라서 안 써도 되지만 쓰는 게 더 명확하다 
	}
	
	
	// 영어, 국어, 수학 ==> 합계 점수
	
	int getSumScore() { //-1은 점수를 안 넣었다는 것 (초기값)
		if(this.korScore != -1 && this.engScore != -1 && this.mathScore != -1) {
			return this.korScore + this.engScore + this.mathScore;
		}
		return -1;
	}
	
	
	
	
	// 기능(method) -> 실행이란 의미의 () 가 꼭 있어야 한다. 반환값, 메소드명, (매개변수) { } 의 구성
	public void setStudNo(int studNo) { //set은 값을 설정. 매개값으로 들어온 걸 사용만 하고 반환은 안 함
		this.studNo = studNo; //앞에 있는 studNo은 필드, 뒤에 있는 건 매개 변수. 
	}
	
	public int getStudNo() { //get은 값을 불러오는 메소드
		return this.studNo;
	} //studNo에 대한 get set method

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
	public String getStudInfo() {
		String str = "==================================";
		str += "\n 이름: " + this.getStudName();
		str += "\n 학번: " + this.getStudNo();
		str += "\n 평균: " + String.format ("%.2f", this.getAvgScore());
		str += "\n==================================\n";
		return str;
	}
	
	
	
	
	
	
}
