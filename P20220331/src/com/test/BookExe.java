package com.test;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookExe {
	// 1.도서등록 2.도서삭제 3.전체도서목록 4.특정도서정보 5.도서대여 6.도서반납 7.종료
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		Book book = new Book();
		BookDAO dao = new BookDAO();
		int bookYear = 0;
		String bookRent = null;
		int bookPrice = 0;

		while (true) {
			System.out.printf("%75s", "==도서관 통합 관리 시스템에 오신 걸 환영합니다==\r\n");
			System.out.printf("%68s", "관리자 로그인이 필요합니다\r\n"); // 아이디 : rootid 비밀번호 : rootpw
			System.out.println();
			System.out.printf("%60s", "ID>>");
			String id = scn.next();
			System.out.printf("%60s", "PW>>");
			String pw = scn.next();

			Root root = new Root();
			root.setRootId(id);
			root.setRootPw(pw);

			// 사용자가 입력한 값 root와 테이블에 저장된 값을 비교하는 메소드가 필요
			// loginResult true면 통합 정보 시스템 접속 false면 아이디 비번 다시 확인하라고 출력

			Boolean loginResult = dao.logIn(root);

			if (loginResult) {
				while (true) {
					System.out.println();
					System.out.println();
					System.out.printf("%70s", "▼실행할 메뉴를 입력해 주세요▼\r\n");
					System.out.println();
					System.out.printf("%67s", "1.입고된신간등록\r\n");
					System.out.printf("%64s", "2.도서삭제\r\n");
					System.out.printf("%66s", "3.전체도서목록\r\n");
					System.out.printf("%68s", "4.작가이름으로검색\r\n");
					System.out.printf("%64s", "5.도서대여\r\n");
					System.out.printf("%64s", "6.도서반납\r\n");
					System.out.printf("%66s", "7.도서정보수정\r\n");
					System.out.printf("%65s", "9.프로그램종료\r\n");

					while (true) {
						try {
							System.out.println();
							System.out.print("                                                        MENU▶");

							menu = scn.nextInt();
							scn.nextLine(); // 숫자 타이핑하고 엔터친 걸 받아서 없애줌
							break;
						} catch (InputMismatchException e) {
							System.out.println("                                                    숫자만 입력하세요");
							scn.nextLine();
							continue;
						}
					}
					if (menu == 1) { // 등록
						while (true) {
							System.out.println();
							System.out.print(
									"                              등록번호▶ 입고날짜 + 입고순번 ex.2022년 4월 7일 첫 번째 입고 도서 → 202204071");
							int bookNo = scn.nextInt(); // 만약에 이 번호가 이미 있는 번호라면 중복된 번호입니다 출력
							boolean result = dao.checkBookNo(bookNo);
							if (result) {
								scn.nextLine();
								System.out.print("                              제목▶");
								String bookTitle = scn.nextLine();
								System.out.print("                              저자▶");
								String bookWriter = scn.nextLine();
								System.out.print("                              출판사▶");
								String bookCompany = scn.next();
								while (true) {
									try {
										System.out.print("                              출간년도▶");
										bookYear = scn.nextInt();
										break;
									} catch (InputMismatchException e) {
										System.out.println("                              숫자만 입력하세요");
										scn.nextLine();
										continue;
									}
								}

								while (true) {
									try {
										System.out.print("                              가격▶");
										bookPrice = scn.nextInt();
										break;
									} catch (InputMismatchException e) {
										System.out.println("                              숫자만 입력하세요");
										scn.nextLine();
										continue;
									}
								}
								
								while (true) {
									System.out.print(
											"                              대여가능여부▶ (Y/N) 바로 대여 가능한 책이면 Y를 입력해 주세요");
									bookRent = scn.next();
									if (bookRent.equals("Y") || bookRent.equals("N")) {
										book = new Book();
										book.bookNo = bookNo;
										book.bookTitle = bookTitle;
										book.bookWriter = bookWriter;
										book.bookCompany = bookCompany;
										book.bookYear = bookYear;
										book.bookPrice = bookPrice;
										book.bookRent = bookRent;

										dao.insertBook(book);
										System.out.println();
										System.out.println("                                                   등록이 완료되었습니다");

										break;
									} else {
										System.out.println("                              Y나 N만 입력하세요");
										continue;
									}
									
								}

							} else {
								System.out
										.println("                                            중복된 번호입니다. 다시 입력해 주세요.");
							}
							break;
						}
					} else if (menu == 2) { // 삭제
						while (true) {
							System.out.println();
							System.out.print("                                                    삭제할 책의 등록번호▶");
							int bookNum = scn.nextInt();
							boolean result = dao.beforeDeleteBook(bookNum);
							if (result) {
								dao.deleteBook(bookNum);
								System.out.println();
								System.out.println("                                                    삭제가 완료되었습니다.");
								break;
							} else {
								System.out.println();
								System.out
										.println("                                                    올바른 등록번호를 입력하세요");

							}

						}

					} else if (menu == 3) { // 전체도서목록

//						System.out.printf("%14s", "등록번호");
//						System.out.printf("%14s", "제목");
//						System.out.printf("%14s", "작가");
//						System.out.printf("%14s", "출판사");
//						System.out.printf("%10s", "출판년도");
//						System.out.printf("%10s", "가격");
//						System.out.printf("%10s", "대여가능여부");
//						System.out.printf("%10s", "반납예정일");
//						System.out.println();
//						System.out.print("==================================================================================================================================\r\n");
						System.out.println();
						List<Book> list = dao.listBook();
						for (Book l : list) {
							System.out.print(l.toString());
							System.out.println();
						}

					} else if (menu == 4) { // 특정 작가의 독서 정보
						String bookWriter = null;
						boolean result = dao.beforeSearchByWriter(bookWriter);
						while (true) {
							System.out.println();
							System.out.print("                                            작가이름▶ 띄어쓰기까지 정확하게 입력하세요");
							bookWriter = scn.nextLine();
							result = dao.beforeSearchByWriter(bookWriter);

							if (result) {
								List<Book> list = dao.searchByWriter(bookWriter);

								for (Book l : list) {
									System.out.println(l.toString());
								}
								break;
							}

							else {
								System.out.print("                                            올바른 작가 이름을 입력하세요");
								continue;

							}
						}

					} else if (menu == 5) { // 도서대여 빌릴 책이름을 입력하면 그 책이름이 기존에 있는 책인지 확인하고 (title비교) 맞으면 bookRent 메소드 실행
											// 없으면 조회할 수 없는 이름으로 실행
											// 있는 책인데 rentBook 필드가 N이면 대여 불가 문구 출력
						while (true) {

							System.out.println();
							System.out.print("                                            대여할 책의 등록번호▶");

							int bookNum = scn.nextInt();

							Book result = dao.searchBook(bookNum);

							if (result != null) { // null이 아니다 -> 책이 있다
								if (result.getBookRent().equals("Y")) { // 책이 있으면 -> 그 책의 렌트 상태를 가져와서 상태가 Y(대여가능)면 대여가능
																		// 출력
									dao.rentBook(bookNum); // N으로 바꾸는 메소드
									dao.updateDate(bookNum); // 오늘로부터 한달뒤인 반납기한으로 업데이트하는 메소드
									System.out.println("                                            대여가 완료되었습니다."); // 대여
																													// 완료
																													// 띄움
									break;
								} else {
									System.out
											.println("                                            대여할 수 있는 재고가 없습니다.");
									scn.nextLine();
									continue;
								}
							} else {
								System.out.print("                                            조회할 수 없는 번호입니다.");
								continue;
							}

						}

					} else if (menu == 6) { // 도서반납
						while (true) {
							System.out.println();
							System.out.print("                                            반납할 책의 등록번호▶");
							int bookNum = scn.nextInt();

							Book result = dao.searchBook(bookNum); // 반납할 책 목록을 가져와서 변수로 선언

							if (result != null) { // null이 아니다 -> 그 책이 존재한다
								if (result.getBookRent().equals("N")) { // 그 책의 대여상태를 가져와서 'N'면 반납실행
									dao.returnBook(bookNum); // Y로 바꿔주는 메소드
									dao.returnDate(bookNum);
									System.out.println();
									System.out.println("                                            반납되었습니다.");
									break;
								} else {
									System.out.println();
									System.out.print(
											"                                            반납 불가. 이미 보유 중인 서적입니다.");
									continue;
								}
							} else {
								System.out.println();
								System.out.print("                                            조회할 수 없는 번호입니다.");

								continue;

							}

						}

					} else if (menu == 7) { // 입고 중 오타났을 때 정보 수정

						while (true) {
							System.out.println();
							System.out.print("                                                수정할 책의 등록번호▶");
							int num = scn.nextInt();
							boolean result = dao.checkBookNo(num);
							if (result) {
								System.out.println();
								System.out.println(
										"                                                없는 등록번호입니다. 번호를 확인하세요.");
							} else {
								dao.modifyBook(num);
								break;
							}
						}
						System.out.println();
						System.out.println("                                            수정이 완료되었습니다.");
					}

					else if (menu == 9) { // 종료
						break;
					} else {
						System.out.println();
						System.out.println("                                            없는 메뉴입니다. 다시 선택해 주세요.");
					}

				} // 로그인 while문 끝 
				
				break;
			} else {// loginResult가 false
				System.out.println();
				System.out.println("                                                  ID나 PW를 다시 확인해 주세요.");
				System.out.println();
				continue;
			}	
		}
		System.out.println();
		System.out.println("                                                     시스템을 종료합니다");
		System.out.println("                                                    Have a nice day!");
	} // main메소드 끝

}
// 클래스 끝
