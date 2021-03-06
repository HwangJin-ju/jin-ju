package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bookCode = request.getParameter("bookCode");
		String bookTitle = request.getParameter("title");
		String bookAuthor = request.getParameter("author");
		String bookPress = request.getParameter("press");
		int bookPrice = Integer.parseInt(request.getParameter("price"));
		
		BookVO vo = new BookVO();
		
		vo.setBookCode(bookCode);
		vo.setBookTitle(bookTitle);
		vo.setBookAuthor(bookAuthor);
		vo.setBookPress(bookPress);
		vo.setBookPrice(bookPrice);
		
		BookService service = new BookService();
		service.modifyBook(vo);
		
		request.setAttribute("vo", vo);
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
	}

}
