package com.prod;

public class User {
	
	// 필드 선언
	private int userId;
	private String userGrade;
	private String phoneNumber;
	private int userPoint;
	
	
	// getter, setter
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}
	
	public String getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getUserPoint() {
		return userPoint;
	}
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	
	//getUserInfo()
	public String getUserInfo() {
		String result = this.userId + "의 등급은 " + this.userGrade + "이고, 핸드폰 번호는 " + this.phoneNumber + "이고, 포인트는 " + this.userPoint + "점이다.";
		return result; 
	}
	
	

}
