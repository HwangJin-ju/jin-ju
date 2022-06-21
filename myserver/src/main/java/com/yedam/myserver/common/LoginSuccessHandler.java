package com.yedam.myserver.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.yedam.myserver.users.vo.UserVO;

//로그인 처리 끝나면 이 핸들러로 넘어옴 이 핸들러에서 세션을 추가한다거나 하는 필요한 작업을 하면 됨 그후 페이지포워드
@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
	
	private static final  Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		String name = authentication.getName(); // 사용자 아이디
		UserVO vo= (UserVO)authentication.getPrincipal();
		logger.info("handler====" + name);
		request.getSession().setAttribute("suser", vo);
		// 일시까지 같이 찍어줌 로그레벨 올리면 로그 안 찍힘
		response.sendRedirect("top.jsp");
	}

}
