package co.edu.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToDoDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	//리스트
	public List<ToDoVO> getList() {
		String sql = "select * from to_do_list";
		getConnect();
		List<ToDoVO> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				ToDoVO vo = new ToDoVO(rs.getString("to_do")
						, rs.getString("checked")
						);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}
	
	// 한건 입력
	
	public void insertList(ToDoVO vo) {
		getConnect();
		String sql = "insert into to_do_list (to_do, checked) values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getToDo());
			int r = psmt.executeUpdate();
			System.out.println(r+"건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}
	
	// 한건 삭제
	
	// 한건 수정
	
	public void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 접속 주소:유저 아이디:비밀번호 이 3의 정보가 맞으면 커넥션 타입의 객체를 리턴해준다
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void disConnect() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(psmt!=null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

}
