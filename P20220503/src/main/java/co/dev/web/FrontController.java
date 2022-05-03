package co.dev.web;

import java.io.IOException;
import java.util.HashMap;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.SetCharacterEncodingFilter;

public class FrontController extends HttpServlet {
	HashMap<String, Control> list = null;
	String charset = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		charset = config.getInitParameter("charset");
		list = new HashMap<String, Control>();
		list.put("/memberInsert.do", new MemberInsertControl()); // (호출페이지, 구현하는 클래스)
		list.put("/memberUpdate.do", new MemberUpdateControl());
		list.put("/memberList.do", new MemberListControl());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding(charset);
		
		
		String url =  req.getRequestURI(); // /P20220503/memberInsert.do 
		String context = req.getContextPath(); // 프로젝트이름
		String path = url.substring(context.length()); // memberInsert.do의 제일 마지막 부분을 담아오겠다는 의미 패키지 이후의 값을 잘라냄
		
		Control exeCon = list.get(path);
		exeCon.execute(req, resp);
	}
}
