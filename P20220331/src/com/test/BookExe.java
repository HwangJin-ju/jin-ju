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

		while (true) {

			System.out.println("==도서관 통합 정보 시스템에 접속하셨습니다==");
			System.out.println("원하는 메뉴를 선택해 주세요.");
			System.out.println("1.도서등록 2.도서삭제 3.전체도서목록 4.작가이름으로검색 5.도서대여 6.도서반납 7.종료");
			menu = scn.nextInt();

			if (menu == 1) { // 등록
				System.out.println("등록번호>> ex.입고날짜 + 입고순번 = 201809061");
				int bookNo = scn.nextInt();
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
				System.out.println("대여가능여부>> Y or N");
				String bookRent = scn.next();
				
				
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

			} else if (menu == 2) { // 삭제
				System.out.println("삭제할 책의 등록번호>>");
				int bookNo = scn.nextInt();
				dao.deleteBook(bookNo);
				System.out.println("삭제가 완료되었습니다.");

			} else if (menu == 3) { // 전체도서목록
				List<Book> list = dao.listBook();
				for (Book l : list) {
					System.out.println(l.toString());
				}

			} else if (menu == 4) { // 특정 작가의 독서 정보
				System.out.println("이름>> 띄어쓰기까지 정확하게 입력하세요");
				String bookWriter = scn.next();
				List<Book> list = dao.searchByWriter(bookWriter);
				for (Book l : list) {
					System.out.println(l.toString());
				}

			} else if (menu == 5) { // 도서대여 빌릴 책이름을 입력하면 그 책이름이 기존에 있는 책인지 확인하고 (title비교) 맞으면 rentBook 메소드 실행
									// 없으면 조회할 수 없는 이름으로 실행
									// 있는 책인데 rentBook 필드가 N이면 대여 불가 문구 출력
				System.out.println("책제목>> 띄어쓰기까지 정확하게 입력하세요");
				scn.nextLine();
				String bookTitle = scn.nextLine();
				
				Book result = dao.searchBook(bookTitle); 
				
				if (result != null) {
					if (result.getBookRent().equals("Y")) {
						System.out.println("대여 완료되었습니다.");
						dao.rentBook(bookTitle);
					} else {
						System.out.println("대여할 수 없는 도서입니다.");
					}
				} else {
					System.out.println("조회할 수 없는 이름입니다.");
				}
			} else if (menu == 6) { // 도서반납
				System.out.println("책제목>> 띄어쓰기까지 정확하게 입력하세요");
				scn.nextLine();
				String bookTitle = scn.nextLine();
				
				Book result = dao.searchBook(bookTitle);
				
				if (result.getBookRent().equals("N")) {
					dao.returnBook(bookTitle);
					System.out.println("반납되었습니다.");
				} else {
					System.out.println("제목을 다시 입력해 주세요.");
				}

			} else if (menu == 7) { // 종료
				System.out.println("시스템을 종료합니다");
				break;
			} else {
				System.out.println("없는 메뉴입니다. 다시 선택해 주세요.");
			}

		} // while문 끝
		System.out.println("end of prog");
	} // main메소드 끝

} // 클래스 끝
