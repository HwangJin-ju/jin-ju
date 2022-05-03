package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberUpdateControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("수정처리하는 컨트롤입니다.");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("passwd");
		String nm = request.getParameter("name");
		String em = request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPasswd(pw);
		vo.setName(nm);
		vo.setEmail(em);
		
		MemberService service = new MemberService();
		service.memberModify(vo);
		
		request.setAttribute("id", id);
		request.setAttribute("name", nm);
		
		
		request.getRequestDispatcher("memberResult/memberUpdateOutput.jsp").forward(request, response);
		
	}

}
