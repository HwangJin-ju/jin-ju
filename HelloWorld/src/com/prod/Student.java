package com.prod;

public class Student {
	// 속성=필드(field)
	String studentNo;
	String studentName;
	int korScore;
	int engScore;
	

	// 기능을 수행하는 함수를 자바에서 method라고 한다. 뒤에 ()가 붙음
	void study(String subject) { //void:반환값이 없음
		System.out.println(subject + "를(을) 공부합니다.");

	}
			// eat의 매개변수 문자열 타입의 매개값을 갖는다는 정의 (파라미터) 
	        // 한글로 쓸 수도 있지만 추천하지 않음
	void eat(String food) {
		System.out.println(food + "을 먹습니다.");
	}
	
	int getKorScore() { 
		return korScore; //korScore에 담긴 int 값을 돌려주겠다는 뜻
	}
	
	int getEngScore() {
		return engScore;
	}

}
