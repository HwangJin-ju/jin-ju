<%@page import="co.edu.Student"%>
<%@page import="java.util.List"%>
<%@page import="co.edu.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>학생목록</caption>
		<thead>
			<tr>
				<th>학생번호</th>
				<th>학생이름</th>
				<th>영어</th>
				<th>국어</th>
			</tr>
		</thead>
		<tbody>
			<%
			// 이거 기준으로 안은 자바 밖은 html
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList();
			for (Student student : list) { // 가지고 있는 건수만큼
				out.print("<tr><td><a href='StudentGetServlet?cmd=search&user_id="+student.getStudentNo()+"'>" + student.getStudentNo() + "</a></td><td>" + student.getStudentName()
				+ "</td><td>" + student.getEngScore()+ "</td><td>" + student.getKorScore()+ "</td></tr>");
			}
			%>
		</tbody>
	</table>
	<hr>
	<a href="form.jsp">폼화면</a>
	<script>
		
	</script>
</body>
</html>