<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h3>반갑습니다.</h3>
	<% 
		// 자바 코드가 들어가는 자바 영역
		String name = "홍길동";
		out.println("<h3>" + name + "</h3>"); // out : 선언 안 해도 쓸 수 있는 내장객체 톰캣이 jsp를 서블릿 형태로 바꿔줄 때 선언됨 
		
		//form.jsp에서 받은 정보 처리하기 (파라미터의 값 읽어오기) input 태그의 name 속성에 있는 게 파라미터의 값
		//get과 post 방식의 차이점 기억할 것 넘겨받은 정보가 주소표시줄에 그대로 보이는 get과 안보이는 post
		String id = request.getParameter("user_id"); // user_id(파라미터) 라는 input 태그의 값을 읽어옴
		String name2 = request.getParameter("user_name");
		out.println("<h4>입력값: " +id + ", name: " + name2 + "</h4>");
		
	%>
	<a href="./student.do">Student Servlet</a>
</body>
</html>