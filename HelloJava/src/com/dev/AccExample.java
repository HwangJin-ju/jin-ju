package com.dev;

public class AccExample {
	public static void main(String[] args) {
		
		// Account a1 = new Account(); ->실체 (인스턴스) 생성 
		//쉐어하우스에서 주방, 거실 vs 개인적인 용도의 방들
		//           (static)     (instance)
		//   클래스에서 하나만 만들어서 씀  각각 용도를 줌
		
		Calculator.sum(10, 20);
		 //         || 
		Calculator c1 = new Calculator();
		c1.sum(10, 20); // sum은 color와는 달리 클래스 공통에서 쓸 수 있는 값이니까 static 메소드 불러서 쓰는 게 편함
		
		Calculator.getAre(10); 
		
		// static 활용
		

	}

}
