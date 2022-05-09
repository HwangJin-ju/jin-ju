package co.edu;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@WebServlet("/EmployeePerDept") // 이 주소를 치면 제이슨 데이터를 넘겨주도록 만들 것
public class EmployeePerDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public EmployeePerDept() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 접속 주소:유저 아이디:비밀번호 이 3의 정보가 맞으면 커넥션 타입의 객체를 리턴해준다
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "select e.department_id, d.department_name, count(1) as cnt from employees e, departments d\r\n"
				+ "where e.department_id = d.department_id\r\n"
				+ "group by e.department_id, d.department_name";
		
		try {
			 psmt = conn.prepareStatement(sql);
			 rs = psmt.executeQuery(); // 쿼리 실행한 결과를 resultset에 담기
			 Map<String, Integer> map = new HashMap<String, Integer>();
			 while(rs.next()) {
				 // department_name, cnt
				 map.put(rs.getString("department_name"), rs.getInt("cnt"));
			 }
			 Gson gson = new GsonBuilder().create();
			 response.getWriter().print(gson.toJson(map)); // map에 있는 값을 json 타입으로 만들어주기 이렇게만 두면 출력이 안되므로 response~
			 return;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		// {"err": "에러 발생"}
		response.getWriter().print("{\"err\": \"에러 발생\"}"); // 응답정보에 한글 포함 -> 출력 스트림에 한글처리
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
