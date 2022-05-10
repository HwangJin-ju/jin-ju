package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class RemoveBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bookCode = request.getParameter("bookCode");
		
		BookVO vo = new BookVO();
		vo.setBookCode(bookCode);
		
		BookService service = new BookService();
		service.removeBook(bookCode);
		

		request.getRequestDispatcher("result/removeOutput.jsp").forward(request, response);
	}

}
