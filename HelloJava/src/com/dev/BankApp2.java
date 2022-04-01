package com.dev;

import java.util.Scanner;

// BankApp(main method), Account(계좌번호, 예금주, 잔액)
public class BankApp2 {
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

	// 메뉴: 1.계좌생성(번호, 예금주, 예금액)
	// 2.예금(번호, 예금액) => 최고예금액 100000원
	// 3.출금(번호, 출금액) => 잔액보다 큰 금액 출금 못하도록
	// 4.잔액조회(계좌번호)
	// 5.종료

	public static void main(String[] args) {

		while (true) {
			printMenu();
			int menu = scn.nextInt();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				findAccountMoney();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 9) {
				showList();
			}

		}
		System.out.println("=== End of Prog ===");

	}// end of main()

	// 메뉴 출력 메소드
	public static void printMenu() {
		String menu = "==============================================\r\n" + "    1.계좌생성(번호, 예금주, 예금액) \r\n"
				+ "    2.예금(번호, 예금액) => 최고예금액 100000원\r\n" + "    3.출금(번호, 출금액) => 잔액보다 큰 금액 출금 못하도록\r\n"
				+ "    4.잔액조회(계좌번호)\r\n" + "    5.종료 \r\n" + "==============================================\r\n"
				+ "선택> ";

		System.out.print(menu);
	}

	// 계좌 생성 메소드
	public static void createAccount() {

		String accNo;

		while (true) {
			System.out.print("계좌번호입력>> ");
			accNo = scn.next();
			if (searchAccountNo(accNo) != null) {
				System.out.println("이미 존재하는 계좌번호입니다. 다른 계좌를 입력해 주세요.");
				continue;// 메소드에서 return을 만나면 아래 코드 실행 안 하고 빠져나온다
			}
			break;

		}
		System.out.print("예금주입력>> ");

		String accName = scn.next();
		System.out.print("예금액입력>> ");
		int accMoney = scn.nextInt();

		Account accnt = new Account(accNo, accName, accMoney);

		int checkCnt = 0;
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				checkCnt = 1;
				banks[i] = accnt;
				break;
			}
		}

		if (checkCnt == 1) {
			System.out.println("계좌가 생성되었습니다");
		}

//			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
//				checkCnt = 2;
//				break;
	}

	// 예금 처리 메소드
	public static void deposit() {
		String ano;
		while (true) {
			System.out.print("계좌번호>> ");
			ano = scn.next();
			if (searchAccountNo(ano) == null) {
				System.out.println("없는 계좌입니다.");
				continue;
			}
			break;
		}

		System.out.print("예금액>> ");
		int amt = scn.nextInt();

		Account findAccount = searchAccountNo(ano);
		
		int checkCnt = 0; // 조회가 됐는지 확인하는 변수. 계좌를 찾았으면 1
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(ano)) {
				// 계좌번호 조회됐을 때 실행되는 부분
				checkCnt = 1;
				int currAmt = banks[i].getMoney();

				// 조회는 됐지만 예금액이 10만원을 초과하는 경우
				if (currAmt + amt > 100000) {
					checkCnt = 2;
					break;
				}
				banks[i].setMoney(currAmt + amt); // 기존 잔액 + 입금액
				break;
			}
		}
		if (checkCnt == 1) {
			System.out.println("정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("한도액을 초과하였습니다.");
		} else {
			System.out.println("계좌번호가 없습니다.");
		}

	}

	// 출금 처리 메소드
	
	public static void withdraw() {
		String acc;
		while (true) {
			System.out.print("계좌번호>> ");
			acc = scn.next();
			if(searchAccountNo(acc) == null) {
				System.out.println("없는 계좌입니다");
			}
			break;
		}
		System.out.print("출금액>> ");
		int withdMoney = scn.nextInt();		
//		for (int i=0; i < banks.length; i++) {
//			if (banks[i].getAccNo().equals((searchAccountNo(acc))) {
//				
//			}
//		}
		
		int cnt = 0;
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(acc)) {
				cnt = 1;
				int curAmt = banks[i].getMoney();
				if (curAmt - withdMoney < 0) {
					cnt = 2;
					break;
				}
				banks[i].setMoney(curAmt - withdMoney);
				break;

			}
		}
		if (cnt == 1) {
			System.out.println("정상 출금되었습니다.");
		} else if (cnt == 2) {
			System.out.println("잔액이 모자랍니다.");
		} 

	}

	// 잔액 조회 메소드
	public static void findAccountMoney() {
		System.out.println("조회기능");
		System.out.println("계좌번호");
		String ano = scn.next();
		Account findAccount = searchAccountNo(ano);
		if(findAccount == null) {
			System.out.println("계좌가 존재하지 않습니다");
			return;
		}
		
//		System.out.println("잔액은 " + findAccountMoney());
		
		
//		String accNum;
//		while (true) {
//			System.out.print("계좌 번호>> ");
//			accNum = scn.next();
//			if(searchAccountNo(accNum) == null) {
//				System.out.println("없는 계좌번호입니다.");
//				continue;
//			}
//			break;
//		}
//		
//		
//
//		for (int i = 0; i < banks.length; i++) {
//			if (banks[i] != null && banks[i].getAccNo().equals(accNum)) {
//				int money = banks[i].getMoney();
//				System.out.println("잔액 : " + money);
//			}
//		}

	}

	// 전체 리스트 출력
	public static void showList() {

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}

	}

	// 계좌번호를 입력하면 배열(banks)에서 그 계좌번호를 반환 없으면 null
	// 100개 중에 35개 계좌 저장했으면 36개부터는 null값 -> NullPointerException -> !=null 조건이 들어가야
	// 한다
	public static Account searchAccountNo(String accNo) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
				return banks[i]; // 메소드 안에서 return 만나면 그 다음 작업은 진행 안 함
			}

		}
		return null; // Account 타입을 리턴해 줘야 하는 메소드라서 100개 다 뒤져서 없으면 없다는 의미로 클래스의 초기값인 null이 반환된다.
						// int 타입 메소드라면 0이 반환될 것

	}

}
