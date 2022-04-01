package com.edu.interfaces;

public interface RemoteControl { // new 생성자 만들 수 없음, 필드 불가. 구현객체로 기능을 구현
		   // static : 인스턴스 만들어서 값 바꾸지 않음
	public static final int MAX_VOLUME = 10; // 값이 안 바뀐다는 의미의 파이널이 붙음. 인터페이스에서 한번 선언하면 구현클래스에서 그대로 사용하라는 뜻
	public static final int MIN_VOLUME = 0; // 변수가 아닌 상수. 상수 이름은 대문자. 서로 다른 단어일 경우 언더바로 구분.
	
	public void powerOn(); // 추상메소드. 규칙만 제시한다
	public void powerOff();
}
