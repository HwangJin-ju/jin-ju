package co.dev.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberListJson implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 전체조회해와서 json형태의 데이터를 넘겨주는 작업이 이루어지는 클래스
		response.setContentType("text/json;charset=utf-8");
		
		MemberService service = new MemberService();
		List<MemberVO> list = service.memberList();
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));

	}

}
