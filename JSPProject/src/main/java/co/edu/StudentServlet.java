package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// IOC :Introversion of control (제어의 역전) 서블릿의 생명주기에 따라서 처리됨
public class StudentServlet extends HttpServlet { 
	@Override
	public void init() throws ServletException { // 서버가 스타트하고 난 다음에 최초 한 번만 실행
		System.out.println("init() 호출.");
	}
	
	@Override // 호출할 때마다 실행 (get, post 상관없음)
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		String method = req.getMethod(); // 요청방식을 가져옴
		PrintWriter out = resp.getWriter(); // 출력스트림 생성
		out.print("<h3>Student Sample page.</h3>");
		
		if(method.equals("GET")) {
			out.print("<h3>Get방식 호출</h3>");
			doGet(req, resp);
		} else if (method.equals("POST")) {
			out.print("<h3>Post방식 호출</h3>");
		}
		out.print("<a href='./index.jsp?user_name=kildong&user_id=hong'>index page</a>");
				
	}
	
	//서비스 메소드가 있어서 실행안됨
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
	
	@Override // 서버 stop하면 실행
	public void destroy() {
		System.out.println("destroy() 호출.");
	}
}
