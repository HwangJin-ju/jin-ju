package com.prod;

public class UserExample {
	
	public static void main(String[] args) {
		//데이터 넣기
		User user1 = new User();
		
		user1.setUserId(900906);
		user1.setUserGrade("A");
		user1.setPhoneNumber("010-9505-4079");
		user1.setUserPoint(8000);
		
		User user2 = new User();
		
		user2.setUserId(980819);
		user2.setUserGrade("B");
		user2.setPhoneNumber("010-1234-1234");
		user2.setUserPoint(1700);
		
		User user3 = new User();
		
		user3.setUserId(950101);
		user3.setUserGrade("A");
		user3.setPhoneNumber("010-5678-5678");
		user3.setUserPoint(1500);
		
		//배열넣기
		User[] user = { user1, user2, user3 };
		//기준에 맞는 유저 출력하기
		for(int i=0; i<user.length; i++) {
			if(user[i].getUserGrade() == "A" && user[i].getUserPoint() >= 1000) {
				System.out.println(user[i].getUserInfo());
				System.out.println("================================================================");
						
			}
		}
		
		

		
	
	
	}
	
		
	

}
