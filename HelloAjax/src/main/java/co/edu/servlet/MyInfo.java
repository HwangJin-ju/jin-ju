package co.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edu/default.do")
public class MyInfo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain; charset=UTF-8"); // /plain으로 하면 이 페이지를 텍스트 형식으로 쓰겠다는 거라 h3 인식을 못함
		// content type => default
		PrintWriter out = resp.getWriter(); // 응답정보가 가지고 있는 출력스트림을 가지고 옴
		out.print("<h3>컨텐트 타입이 기본</h3>");
	}
}
