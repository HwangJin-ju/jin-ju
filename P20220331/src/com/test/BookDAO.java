package com.test;

import java.awt.Container;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookDAO extends DAO {

	Scanner scn = new Scanner(System.in);

	public void insertBook(Book book) {
		conn = getConnect();
		String sql = "INSERT INTO book_tble (book_no, book_title, book_writer, book_company, book_year, book_price, book_rent, book_date) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBookNo());
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getBookWriter());
			psmt.setString(4, book.getBookCompany());
			psmt.setInt(5, book.getBookYear());
			psmt.setInt(6, book.getBookPrice());
			psmt.setString(7, book.getBookRent());
			psmt.setString(8, book.getBookDate());

			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void deleteBook(int bookNo) {
		conn = getConnect();
		String sql = "DELETE FROM book_tble\r\n" + "WHERE book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookNo);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public List<Book> listBook() {
		List<Book> bookList = new ArrayList<Book>();
		conn = getConnect();
		String sql = "SELECT book_no, book_title, book_writer, book_company, book_year, book_price, book_rent, NVL(to_char(book_date, 'yyyy-mm-dd'), '대여되지않음') as book_date\r\n"
				+ "FROM book_tble\r\n" + "ORDER BY book_no";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookNo(rs.getInt("book_no"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookCompany(rs.getString("book_company"));
				book.setBookYear(rs.getInt("book_year"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setBookRent(rs.getString("book_rent"));
				book.setBookDate(rs.getString("book_date"));

				bookList.add(book);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return bookList;
	}

	public List<Book> searchByWriter(String writer) {
		conn = getConnect();
		List<Book> list = new ArrayList<Book>();
		Book book = null;
		String sql = "SELECT book_no, book_title, book_writer, book_company, book_year, book_price, book_rent, NVL(to_char(book_date, 'yyyy-mm-dd'), '대여되지않음') as book_date\r\n"
				+ "FROM book_tble\r\n"
				+ "WHERE book_writer LIKE ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%"+ writer+"%");
			rs = psmt.executeQuery();

			while (rs.next()) {
				book = new Book();
				book.setBookNo(rs.getInt("book_no"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookCompany(rs.getString("book_company"));
				book.setBookYear(rs.getInt("book_year"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setBookRent(rs.getString("book_rent"));
				book.setBookDate(rs.getString("book_date"));

				list.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public void rentBook(int bookNo) { // Y를 N로 바꾸는 메소드
		conn = getConnect();
		String sql = "UPDATE book_tble\r\n" + "SET book_rent = 'N'\r\n" + "WHERE book_no = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookNo);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	} // 책이름 쳐서 그 책 대출일자 반납일자(대출일자+13) 확인 -> 대출된 책의 db가 저장된 테이블의 값을 조회
		// ㄴ ??????

	public void returnBook(int bookNum) { // N을 Y로 바꾸는 메소드
		conn = getConnect();
		String sql = "UPDATE book_tble\r\n" + "SET book_rent= 'Y'\r\n" + "WHERE book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookNum);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public Book searchBook(int bookNum) {
		conn = getConnect();
		Book book = null;
		String sql = "select * from book_tble where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookNum);
			rs = psmt.executeQuery();

			if (rs.next()) {
				book = new Book();
				book.setBookNo(rs.getInt("book_no"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookCompany(rs.getString("book_company"));
				book.setBookYear(rs.getInt("book_year"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setBookRent(rs.getString("book_rent"));
				book.setBookDate(rs.getString("book_date"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return book;
	}

	public boolean logIn(Root root) { // 관리자가 입력한 값을 담은 root와 로그인 테이블에 담긴 값을 비교하는 메소드
		conn = getConnect();
		String sql = "SELECT *\r\n" + "FROM log_in\r\n" + "WHERE root_id = ? \r\n" + "AND root_pw = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, root.rootId);
			psmt.setString(2, root.rootPw); // 이 값이 != null 로그인 성공
			rs = psmt.executeQuery();

			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public boolean checkBookNo(int BookNo) { // 등록번호로 그 책이 리스트에 등록된 책인지 아닌지 찾는 메소드
		conn = getConnect();
		String sql = "SELECT *\r\n" + "FROM book_tble\r\n" + "WHERE book_no = ? \r\n";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, BookNo);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return false; // 중복
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return true;
	}

	public boolean beforeDeleteBook(int BookNo) { // 삭제전에 등록번호로 그책이 있는지 없는지 찾는 메소드
		conn = getConnect();
		String sql = "SELECT *\r\n" + "FROM book_tble\r\n" + "WHERE book_no = ? \r\n";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, BookNo);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return true; // 삭제
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public boolean beforeSearchByWriter(String BookWriter) { // 작가 이름으로 리스트에 그 작가가 있는지 없는지 찾는 메소드
		conn = getConnect();
		String sql = "SELECT *\r\n" + "FROM book_tble\r\n" + "WHERE book_writer = ? \r\n";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, BookWriter);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return true; // 있으면 리스트 출력
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public void updateDate(int bookNum) { // 대여했을 때 반납기한 메소드
		conn = getConnect();
		String sql = "UPDATE book_tble\r\n" + "SET book_date = ADD_MONTHS(SYSDATE, 1)\r\n" + "WHERE book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookNum);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public void returnDate(int bookNum) { // 반납했을 때 반납기한을 다시 null로 돌리는 메소드
		conn = getConnect();
		String sql = "UPDATE book_tble\r\n" + "SET book_date = null\r\n" + "WHERE book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookNum);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public void modifyBook(int num) { // 수정할 책의 정보를 담은 새로운 인스턴스를 이 메소드의 매개값으로 받음
		conn = getConnect();
		String sql = "UPDATE book_tble\r\n" + "SET book_no = ?, \r\n" + "     book_title = ?, \r\n"
				+ "     book_writer = ?, \r\n" + "     book_company = ?,\r\n" + "     book_year = ?,\r\n"
				+ "     book_price = ?,\r\n" + "     book_rent = ?\r\n" + "WHERE book_no = ?     ";
		try {
			psmt = conn.prepareStatement(sql);
			System.out.println();
			System.out.println("                                                새로운 정보들을 입력하세요.");
			System.out.println("                                                기존 정보를 유지하는 항목도 재입력이 필요합니다.");
			System.out.println();
			int bookNum = 0;
			int bookYear = 0;
			int bookPrice = 0;
			while (true) {
				try {
					System.out.print("                                                등록번호▶");
					bookNum = scn.nextInt();
					break;
				}catch (InputMismatchException e) {
					System.out.println("                                                숫자만 입력하세요");
					scn.nextLine();
					continue;
				}
			}
			
			scn.nextLine();
			System.out.print("                                                제목▶");
			String bookTitle = scn.nextLine();
			
			System.out.print("                                                작가 이름▶");
			String bookWriter = scn.nextLine();
			
			System.out.print("                                                출판사▶");
			String bookCompany = scn.next();
			
			while(true) {
				try {
					System.out.print("                                                출판년도▶");
					bookYear = scn.nextInt();
					break;
				}catch(InputMismatchException e) {
					System.out.println("                                                숫자만 입력하세요");
					scn.nextLine();
					continue;
				}
			}
			
			while(true) {
				try {
					System.out.print("                                                가격▶");
					bookPrice = scn.nextInt();
					break;
				}catch (InputMismatchException e) {
					System.out.println("                                                숫자만 입력하세요");
					scn.nextLine();
					continue;
				}
			}
			System.out.print("                                                대여가능여부▶");
			String bookRent = scn.next();

			Book bookMod = new Book(); // bookMod 수정된 정보를 담을 책 변수
			bookMod.setBookNo(bookNum);
			bookMod.setBookTitle(bookTitle);
			bookMod.setBookWriter(bookWriter);
			bookMod.setBookCompany(bookCompany);
			bookMod.setBookYear(bookYear);
			bookMod.setBookPrice(bookPrice);
			bookMod.setBookRent(bookRent);

			psmt.setInt(1, bookMod.getBookNo());
			psmt.setString(2, bookMod.getBookTitle());
			psmt.setString(3, bookMod.getBookWriter());
			psmt.setString(4, bookMod.getBookCompany());
			psmt.setInt(5, bookMod.getBookYear());
			psmt.setInt(6, bookMod.getBookPrice());
			psmt.setString(7, bookMod.getBookRent());
			psmt.setInt(8, num);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
