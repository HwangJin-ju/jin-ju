package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/StudentGetServlet") // web.xml에다가 이걸 url로,
public class StudentGetServlet extends HttpServlet { // 이걸 class로 추가해도 되고 아니면 간단하게 10라인처럼 어노테이션을 사용
	private static final long serialVersionUID = 1L;

	public StudentGetServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8"); 

		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.studentList();
		// [{}, {}, {}]
		Gson gson = new GsonBuilder().create(); // GSON 라이브러리. (lib에 jar파일 다운받은 거 복붙) gson 객체 만들기
		response.getWriter().print(gson.toJson(list)); // 전처럼 루프 돌 필요 없이 편하게 json 형식 데이터 만들 수 있음
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
