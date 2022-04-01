package com.dev;

public class Account {
	// 계좌정보, 예금주, 예금액
	
	//field
	private String accNo;
	private String accName;
	private int money;
	
	public static String bankName; //static -> 인스턴스 안 만들어도 바로 사용 가능. 클래스가 메모리에 올라오는 시점에 값을 가지고 있음 (클래스이름.메소드이름)으로 호출. 
	static {
		bankName = "한일은행";
	} 
	
	public static void showBankName() {
		System.out.println("한일은행입니다.");
	}
	
	//constructor : 생성자. 목적은 필드의 초기값을 지정.
	
	public Account() { //생성자는 필요에 따라 여러 개 만들 수 있음 똑같은 생성자를 여러 개 만드는 걸 overloading 이라고 한다 메소드 오버로딩도 있음
 		System.out.println("기본생성자 호출");
	}
	
	
	public Account(String accNo, int money) {
		super();
		this.accNo = accNo;
		this.money = money;
	}

				 //String accName, String accNo 도 같은 String, String이라 불가능
	public Account(String accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
	}


	public Account(String accNo, String accName, int money) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.money = money;
	}
	
	
	
	//method
	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}



	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", money=" + money + "]";
	}
	
	
	

}
