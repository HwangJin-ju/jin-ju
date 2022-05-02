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
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// GET 방식의 요청일 경우 cmd 값에 search 만약 cmd=null이면 JSON형태로 반환
		response.setCharacterEncoding("utf-8");

		response.setContentType("text/json;charset=utf-8");

		String cmd = request.getParameter("cmd"); // cmd로 읽어 온 값이 뭔지

		if (cmd != null && cmd.equals("search")) { // 파라미터가 서치로 넘어오면 실행함
			String id = request.getParameter("user_id"); // user_id가 가진 파라미터를 읽음
			StudentDAO dao = new StudentDAO();
			Student student = dao.searchStudent(id);

			response.setContentType("text/html;charset=utf-8");

			if (student != null) {
				response.getWriter().println("<form action='StudentGetServlet' method='post'>");
				response.getWriter().println("<h3>학생번호: " + student.getStudentNo() + "</h3>");
				response.getWriter().println("<h3>이름: " + student.getStudentName() + "</h3>");
				response.getWriter().println("<h3>영어: " + "<input id=eng name='eng_score' type=number value=" + student.getEngScore()+ "></h3>");
				response.getWriter().println("<h3>국어: " + "<input id=kor name='kor_score' type=number value=" + student.getKorScore()+ "></h3>");
				response.getWriter().println("<input type='hidden' name='cmd' value='mod'>");
				response.getWriter().println("<input type='hidden' name='user_id' value=" + student.getStudentNo() +">");
				response.getWriter().println("<input type='hidden' name='user_name' value=" + student.getStudentName() + ">");
				response.getWriter().println("<input type='submit' value='수정'>");
				response.getWriter().println("</form>");
				
				
			} else {
				response.getWriter().println("<h3>조회된 데이터가 없습니다.</h3>");
			}

		} else if (cmd != null && cmd.equals("list")) {
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();

			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			System.out.println("id: " + id + "name: " + name);
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);

			dao.addStudent(stud);

			response.getWriter().print("입력성공");

		} else {
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList();
			// [{}, {}, {}]
			Gson gson = new GsonBuilder().create(); // GSON 라이브러리. (lib에 jar파일 다운받은 거 복붙) gson 객체 만들기
			response.getWriter().print(gson.toJson(list)); // 전처럼 루프 돌 필요 없이 편하게 json 형식 데이터 만들 수 있음
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String cmd = request.getParameter("cmd");
		if (cmd != null && cmd.equals("add")) { // 입력

			StudentDAO dao = new StudentDAO();
			Student stud = new Student();

			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");

			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));

			dao.addStudent(stud);

			response.getWriter().print("입력성공");

		} else if (cmd != null && cmd.equals("del")) {
			String id = request.getParameter("user_id");

			StudentDAO dao = new StudentDAO();
			if (dao.removeStudent(id)) {
				response.getWriter().print("<script>alert('삭제성공')</script>");
			} else {
				response.getWriter().print("<script>alert('삭제실패')</script>");
			}
			
		} else if (cmd != null && cmd.equals("mod")) {
			// 사용자가 입력한 파라미터를 getParameter를 통해 읽어들임
			Student stud = new Student();

			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");
			
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));
			
			StudentDAO dao = new StudentDAO();
			dao.modifyStudent(stud);
		} 
		response.sendRedirect("studentList.jsp"); // 입력이나 삭제하고 이 jsp 페이지로 위치 재지정
	} // end of doPost()

}
