package com.test;



public class Book {
//도서관고유등록번호 (ex.220331+1,2,3,4,~ ) int, 책 이름 String , 저자 String , 출판사 String , 출간년도 int, 
//    가격 int, 대여 가능 여부 (도서관에 각 도서당 재고는 한 권뿐)
	
	int bookNo;
	String bookTitle;
	String bookWriter;
	String bookCompany;
	int bookYear;
	int bookPrice;
	String bookRent;
	String bookDate;
	
	
	

	
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookCompany() {
		return bookCompany;
	}
	public void setBookCompany(String bookCompany) {
		this.bookCompany = bookCompany;
	}
	public int getBookYear() {
		return bookYear;
	}
	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}
	
	public String getBookRent() {
		return bookRent;
	}
	public void setBookRent(String bookRent) {
		this.bookRent = bookRent;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	@Override
	public String toString() {
		return "==================================================================================================================================\r\n"+"<등록번호> " + bookNo + "  <제목> " + bookTitle + "  <작가> " + bookWriter + "  <출판사> "
				+ bookCompany + "  <출판년도> " + bookYear + "  <가격> " + bookPrice + "  <대여가능여부> " + bookRent + "  <반납예정일> " + bookDate +" \r\n";
	}
	
	
}
