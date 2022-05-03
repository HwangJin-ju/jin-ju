<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원정보수정화면</h3>
	<form action="../memberUpdate.do" method="post">
		아이디: <input type="text" name="id"><br> <!-- name 속성은 파라미터의 이름 -->
		비밀번호: <input type="password" name="passwd"><br>
		이름: <input type="text" name="name"><br>
		메일: <input type="email" name="email"><br>
		<input type="submit" value="수정"> 
		
	</form>
</body>
</html>