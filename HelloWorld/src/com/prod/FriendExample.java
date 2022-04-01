package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		// 친구의 정보(이름, 전화번호, 이메일, 키, 몸무게)
		
		Friend f1 = new Friend();
		f1.friendName = "권가희";
		f1.friendNumber = "010-1234-1234";
		f1.email = "kgh@email.com";
		f1.height = 167.5;
		f1.weight = 55.7;
		
		Friend f2 = new Friend();
		f2.friendName = "이유빈";
		f2.friendNumber = "010-2345-2345";
		f2.email = "lyb@email.com";
		f2.height = 156.5;
		f2.weight = 65.7;
				
		Friend f3 = new Friend();
		f3.friendName = "나현주";
		f3.friendNumber = "010-3456-3456";
		f3.email = "nhj@email.com";
		f3.height = 176.5;
		f3.weight = 65.7;
		
		System.out.println(f1); // 실제값이 아니라 물리적 주소값이 나옴
		
		Friend[] friends = { f1, f2, f3 };
		
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].height < 170) {
			System.out.println("이름: " + friends[i].friendName);
			System.out.println("전화번호: " + friends[i].friendNumber);
			System.out.println("키: " + friends[i].height);
			System.out.println("================================");
			}
			}
		
		
			
				
		
	}
		}
		
