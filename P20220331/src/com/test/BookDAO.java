package com.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends DAO {
	
	public void insertBook(Book book) {
		conn = getConnect();
		String sql = "INSERT INTO book_tbl (book_no, book_title, book_writer, book_company, book_year, book_price, book_rent) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBookNo());
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getBookWriter());
			psmt.setString(4, book.getBookCompany());
			psmt.setInt(5, book.getBookYear());
			psmt.setInt(6, book.getBookPrice());
			psmt.setInt(7, book.getBookRent());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void deleteBook(int bookNo) {
		conn = getConnect();
		String sql = "DELETE FROM book_tbl\r\n"
				+ "WHERE book_no = ?";
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
		String sql = "SELECT *\r\n"
				+ "FROM book_tbl\r\n"
				+ "ORDER BY book_no";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setBookNo(rs.getInt("book_no"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookCompany(rs.getString("book_company"));
				book.setBookYear(rs.getInt("book_year"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setBookRent(rs.getInt("book_rent"));
				
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
		String sql = "SELECT *\r\n"
				+ "FROM book_tbl\r\n"
				+ "WHERE book_writer = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, writer);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				book = new Book();
				book.setBookNo(rs.getInt("book_no"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookCompany(rs.getString("book_company"));
				book.setBookYear(rs.getInt("book_year"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setBookRent(rs.getInt("book_rent"));
				
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
	
	public void rentBook(String bookTitle) {
		conn = getConnect();
		String sql = "UPDATE book_tbl\r\n"
				+ "SET book_rent= book_rent-1\r\n"
				+ "WHERE book_title = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookTitle);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}  // 책이름 쳐서 그 책 대출일자 반납일자(대출일자+13) 확인 -> 대출된 책의 db가 저장된 테이블의 값을 조회   
	//														ㄴ ??????
	public void returnBook(String bookTitle) {
		conn = getConnect();
		String sql = "UPDATE book_tbl\r\n"
				+ "SET book_rent= book_rent+1\r\n"
				+ "WHERE book_title = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookTitle);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public Book searchBook(String bookTitle) {
		conn = getConnect();
		Book book = null;
		String sql = "select * from book_tbl where book_title = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookTitle);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				book = new Book();
				book.setBookNo(rs.getInt("book_no"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookCompany(rs.getString("book_company"));
				book.setBookYear(rs.getInt("book_year"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setBookRent(rs.getInt("book_rent"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return book;
	}

	public boolean logIn(Root root) { //관리자가 입력한 값을 담은 root와 로그인 테이블에 담긴 값을 비교하는 메소드
		conn = getConnect();
		String sql = "SELECT *\r\n"
				+ "FROM log_in\r\n"
				+ "WHERE root_id = ? \r\n"
				+ "AND root_pw = ?";
		
		try {
			psmt =conn.prepareStatement(sql);
			psmt.setString(1, root.rootId);
			psmt.setString(2, root.rootPw); // 이 값이 != null 로그인 성공
			rs = psmt.executeQuery();

			if(rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean checkBookNo(int BookNo) {
		conn = getConnect();
		String sql =  "SELECT *\r\n"
				+ "FROM book_tbl\r\n"
				+ "WHERE book_no = ? \r\n";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, BookNo);
			rs = psmt.executeQuery();
			if(rs.next()) {
				return false;   // 중복
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return true;
	}
	
	
	
	

}
