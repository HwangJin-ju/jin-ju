package com.test;

import java.util.List;
import java.util.Scanner;

public class BookExe {
	// 1.도서등록 2.도서삭제 3.전체도서목록 4.특정도서정보 5.도서대여 6.도서반납 7.종료
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		Book book = new Book();
		BookDAO dao = new BookDAO();
		
		while(true) {
		System.out.println("             ==도서관 통합 관리 시스템에 오신 걸 환영합니다==");
		System.out.println("                      관리자 로그인이 필요합니다   ");
		System.out.print("ID>>");
		String id = scn.next();
		System.out.print("PW>>");
		String pw = scn.next();

		Root root = new Root();
		root.setRootId(id);
		root.setRootPw(pw);

		// 사용자가 입력한 값 root와 테이블에 저장된 값을 비교하는 메소드가 필요
		// loginResult true면 통합 정보 시스템 접속 false면 아이디 비번 다시 확인하라고 출력

		Boolean loginResult = dao.logIn(root);

		if (loginResult) {
			while (true) {

				System.out.println("                        ==접속하셨습니다==          ");
				System.out.println("                    ▼실행할 메뉴를 입력해 주세요▼");
				System.out.println("1.입고된신간등록 2.도서삭제 3.전체도서목록 4.작가이름으로검색 5.도서대여 6.도서반납 7.종료");
				System.out.print("MENU>>");
				menu = scn.nextInt();

				if (menu == 1) { // 등록
					while (true) {
						System.out.println("등록번호>> ex.입고날짜 + 입고순번 = 201809061");
						int bookNo = scn.nextInt(); // 만약에 이 번호가 이미 있는 번호라면 중복된 번호입니다 출력
						boolean result = dao.checkBookNo(bookNo);
						if (result) {
							scn.nextLine();
							System.out.println("제목>>");
							String bookTitle = scn.nextLine();
							System.out.println("저자>>");
							String bookWriter = scn.nextLine();
							System.out.println("출판사>>");
							String bookCompany = scn.next();
							System.out.println("출간년도>>");
							int bookYear = scn.nextInt();
							System.out.println("가격>>");
							int bookPrice = scn.nextInt();
							System.out.println("입고된 수>> 최대 보유 가능한 재고는 3권입니다.");
							int bookRent = scn.nextInt();

							// 도서등록할 때 재고 권수 입력 -> 대여할 때 != 0 이 아니면 대여해 주고 아니면 대여 가능한 재고가 없습니다

							book = new Book();
							book.bookNo = bookNo;
							book.bookTitle = bookTitle;
							book.bookWriter = bookWriter;
							book.bookCompany = bookCompany;
							book.bookYear = bookYear;
							book.bookPrice = bookPrice;
							book.bookRent = bookRent;

							dao.insertBook(book);
							System.out.println("등록이 완료되었습니다");
							
							break;
						} else {
							System.out.println("중복된 번호입니다. 다시 입력해 주세요.");
						}
					}
				} else if (menu == 2) { // 삭제
					System.out.println("삭제할 책의 등록번호>>");
					int bookNum = scn.nextInt();
					dao.deleteBook(bookNum);
					System.out.println("삭제가 완료되었습니다.");

				} else if (menu == 3) { // 전체도서목록
					List<Book> list = dao.listBook();
					for (Book l : list) {
						System.out.println(l.toString());
					}

				} else if (menu == 4) { // 특정 작가의 독서 정보
					System.out.println("작가이름>> 띄어쓰기까지 정확하게 입력하세요");
					scn.nextLine();
					String bookWriter = scn.nextLine();
					List<Book> list = dao.searchByWriter(bookWriter);
					for (Book l : list) {
						System.out.println(l.toString());
					}

				} else if (menu == 5) { // 도서대여 빌릴 책이름을 입력하면 그 책이름이 기존에 있는 책인지 확인하고 (title비교) 맞으면 rentBook 메소드 실행
										// 없으면 조회할 수 없는 이름으로 실행
										// 있는 책인데 rentBook 필드가 N이면 대여 불가 문구 출력
					System.out.println("대여할 책제목>> 띄어쓰기까지 정확하게 입력하세요");
					scn.nextLine();
					String bookTitle = scn.nextLine();

					Book result = dao.searchBook(bookTitle); // 빌릴 책 제목 한 개 가지고 와서 그걸 변수로 지정

					if (result != null) { // 그 책이 != null이면 (=결과가 나옴 =그 책이 맞음)
						if (result.getBookRent() != 0) { // 그럼 그 책의 재고 가져와서 그 값이 0이 아니라면 빌려주는 메소드를 실행
							dao.rentBook(bookTitle); // 재고 -1 되고
							System.out.println("대여가 완료되었습니다."); // 대여 완료
						} else {
							System.out.println("대여할 수 있는 재고가 없습니다.");
						}
					} else {
						System.out.println("조회할 수 없는 이름입니다."); // 책제목 틀림
					}
				} else if (menu == 6) { // 도서반납
					System.out.println("반납할 책제목>> 띄어쓰기까지 정확하게 입력하세요");
					scn.nextLine();
					String bookTitle = scn.nextLine();

					Book result = dao.searchBook(bookTitle); // 반납할 책 목록을 가져와서 변수로 선언

					if (result.getBookRent() != 3) { // 그 책의 재고권수를 가져와서 최대보유가능재고인 3권이 아니면 반납을 실행
						dao.returnBook(bookTitle);
						System.out.println("반납되었습니다.");
					} else {
						System.out.println("제목을 다시 입력해 주세요."); // 3이면 이미 도서관에 다 있는 책이므로 제목이 틀린거
					}

				} else if (menu == 7) { // 종료
					System.out.println("                        시스템을 종료합니다");
					break;
				} else {
					System.out.println("없는 메뉴입니다. 다시 선택해 주세요.");
				}

			} // while문 끝
			System.out.println("                       Have a nice day!");
			break;
		} else {
			System.out.println("ID나 PW를 다시 확인해 주세요.");
		}
		}
	} // main메소드 끝

} // 클래스 끝
