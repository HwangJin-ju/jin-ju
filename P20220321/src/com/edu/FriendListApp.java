package com.edu;

public class FriendListApp {

	public static void main(String[] args) {
		Friend[] friends = new Friend[10];

		Friend f1 = new Friend();
		f1.setName("진휘용");
		f1.setAge(25);
		f1.setHeight(178.3);
		f1.setWeight(68.9);
		f1.setPhone("010-2323-9845");

		UnivFriend f2 = new UnivFriend("서현일", 29, 178.3, 69.2, "010-1111-2222");
		f2.setUniversity("대구대학교");
		f2.setMajor("컴퓨터공학과");

		ComFriend f3 = new ComFriend("최규완", 29, 179.3, 75.2, "010-1111-2222", "네이버", "지도app개발연구원");
		
		Friend f4 = new Friend();
		f4.setName("김철수");
		f4.setAge(26);
		f4.setHeight(178.3);
		f4.setWeight(68.9);
		f4.setPhone("010-2323-9845");

		UnivFriend f5 = new UnivFriend("홍길동", 29, 178.3, 69.2, "010-1111-2222");
		f5.setUniversity("대구대학교");
		f5.setMajor("컴퓨터공학과");

		ComFriend f6 = new ComFriend("황진주", 29, 179.3, 75.2, "010-1111-2222", "네이버", "지도app개발연구원");


		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		friends[4] = f5;
		friends[5] = f6;

		for (int i = 0; i < friends.length; i++) {     // 동일한 toString 메소드가 인스턴스 종류에 따라 다른 결과를 내는 것을 다형성이라고 한다
			if (friends[i] != null && friends[i] instanceof UnivFriend)
				System.out.println(friends[i].toString()); // toString 메소드: friend는 person을 상속받고 person은 object클래스를
		}												   // 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드 입니다
		 												   // object 클래스는 최상위 클래스
														   // toString은 object에 있음
														   				

		Friend friend = (Friend) f2; // UnivFriend클래스의 인스턴스 getUniversity, getMajor를 갖고 있다
		friend = f1;
		UnivFriend uni = null;
		if (friend instanceof UnivFriend)  {//friend변수값이 UnivFriend의 인스턴스인지 확인
			uni = (UnivFriend) friend; // Casting 해야 함.
			uni.getUniversity(); // 부모 클래스의 참조변수 => 자식 클래스의 참조변수에 할당가능
		}
	
		
		
		


	}
		
}

