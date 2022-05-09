package co.edu.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.edu.full.FullVO;


@WebServlet("/ToDoListServlet")
public class ToDoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ToDoListServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전체 조회
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		ToDoDAO dao = new ToDoDAO();
		List<ToDoVO> list = dao.getList();
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 입력, 삭제
		request.setCharacterEncoding("utf-8");
		String job = request.getParameter("job");
		
		ToDoDAO dao = new ToDoDAO();
		
		if(job.equals("insert")) {
			String toDo = request.getParameter("toDo");
			String checked = request.getParameter("checked");
			
			ToDoVO vo = new ToDoVO(toDo, checked);
			dao.insertList(vo);
			
		} else if(job.equals("delete")) {
			String title = request.getParameter("title");
			
		}
				
	}

}
