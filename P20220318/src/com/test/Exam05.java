package com.test;

import java.util.Scanner;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Exam05 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		
		String title = scn.next();
		String author = scn.next(); 
		String company = scn.next();
		int price = scn.nextInt(); 
		
		Book b1 = new Book (title, author, company, price);
		
		System.out.println("==============" + "\r\n" 
		                 + "제목 : " + b1.getTitle() + "\r\n" 
				         + "저자 : " + b1.getAuthor() + "\r\n" 
		                 + "출판사 : " + b1.getCompany() + "\r\n" 
				         + "가격 : " + b1.getPrice() + "\r\n" 
						 + "==============");	


	
	
	
	}
}


