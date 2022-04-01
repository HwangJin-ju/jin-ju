package com.edu;

public class Friend extends Person {
	// 공통 : 이름, 나이, 키, 몸무게
	// 연락처
//		-> 회사 친구 : 회사 이름, 회사 업무
//		-> 학교 친구 : 학교 이름, 전공

	private String phone;
	
	public Friend() {
		
	} // =>super();
	
	public Friend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight);
		this.phone = phone;
	} // 다른 생성자를 만들었으므로 기본 생성자는 자동으로 안 만들어지기 때문에 기본 생성자 필요하면 따로 만들어야 함

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override //annotation 규칙 맞는지 확인해줌
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고\n";
			   str += "나이는 " + super.getAge() + "이고\n";
			   str += "연락처는 " + this.getPhone() + "입니다. \n";
			   return str;
	}
	
	//overriding = > 부모 클래스의 메소드 - 자식 클래스가 새롭게 정의

}
