package com.edu.interfaces; // 추상클래스는 클래스이므로 필드도 선언가능하고 생성자도 만들 수 있다 추상클래스와 기능은 비슷하지만 보통 인터페이스를 쓴다 
							// 인터페이스는 기능만을 구현하는 용도
							

public interface Dao extends RemoteControl, Run { // 인터페이스는 다중 상속을 허용한다 (클래스는 다중 상속 불가능) 
	public void select(); //추상메소드 구현 부분이 없음 추상의 의미가 포함되어 있어서 abstract 굳이 안 써도 됨 
	public void insert();
	public void update();
	public void delete();
}
