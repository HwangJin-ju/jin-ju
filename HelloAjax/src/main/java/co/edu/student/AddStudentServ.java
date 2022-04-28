package co.edu.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.SetCharacterEncodingFilter;

@WebServlet("/ajax/addStudentServlet")
//post.html의 <form action="addStudentServlet">과 경로상 같은 위치가 되기 위해 /ajax/ 추가
public class AddStudentServ extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); // 요청정보에 한글 있을 때
		resp.setCharacterEncoding("UTF-8"); // 응답정보에 한글 있을 때
		resp.setContentType("text/html;charset=UTF-8");
		
		
		String studentNo = req.getParameter("sno"); // sno에 담긴 value 읽어오기
		String studentName = req.getParameter("sname"); // sname에 담긴 value 읽어오기
		String engScore = req.getParameter("eScore"); // eScore에 담긴 value 읽어오기
		String korScore = req.getParameter("kScore"); // kScore에 담긴 value 읽어오기

		// 파라미터 4개 너무 많으니까 하나의 인스턴스에 담아서 이 stud를 매개값으로 쓸 것
		Student stud = new Student();
		stud.setStudentNo(Integer.parseInt(studentNo)); // getParameter는 무조건 스트링 타입을 반환하기 때문에 정수형으로 바꾸는 작업이 필요
		stud.setStudentName(studentName);
		stud.setEngScore(Integer.parseInt(engScore));
		stud.setKorScore(Integer.parseInt(korScore));
		// 위의 파라미터를 받아서 db에 insert 하는 작업

		StudentDAO dao = new StudentDAO();
		boolean success = dao.addStudent(stud);
		if (success) {
			// {"retCode":"Success", "studNo":studentNo, "studName":"studentName", "engScore":engScore, "korScore":korScore} : 오브젝트 타입 
			resp.getWriter().println("{\"retCode\":\"Success\", \"studentNo\":"+studentNo+", \"studName\":\""+studentName+"\", \"engScore\":"+engScore+", \"korScore\":"+korScore+"}");
		} else {
			// {"retCode":"Fail"}
			resp.getWriter().println("{\"retCode\":\"Fail\"}");

		}

	}
}
