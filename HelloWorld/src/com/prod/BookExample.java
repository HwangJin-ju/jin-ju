package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책(책제목, 저자, 출판서, 가격)
		
		Book book1 = new Book();
		book1.bookName = "혼공자";
		book1.author = "신용권";
		book1.company = "한빛미디어";
		book1.price = 24000;
		
		Book book2 = new Book();
		book2.bookName = "powerJava";
		book2.author = "천인국";
		book2.company = "인피니티";
		book2.price = 35000;
		
		Book book3 = new Book();
		book3.bookName = "재밌는 Java";
		book3.author = "이호준";
		book3.company = "인피니티";
		book3.price = 20000;
		
	    Book[] books = { book1, book2, book3 };
	    // 제목, 저자, 가격 
	    
	    for(int i=0; i < books.length; i++) {
	    	if(books[i].author == "신용권") {
	    	System.out.println("제목 : " + books[i].bookName);
	    	System.out.println("==================");
	    }
	    }
	    
//	    for(int i=0; i < books.length; i++) {
//	    	if(books[i].company == "인피니티") {
//	    	System.out.println("제목 : " + books[i].bookName);
//	    	System.out.println("저자 : " + books[i].author);
//	    	System.out.println("가격 : " + books[i].price);
//	    	System.out.println("==================");
//	    }
//	    }
	    
				
				
				
				
				
				
	}

}
