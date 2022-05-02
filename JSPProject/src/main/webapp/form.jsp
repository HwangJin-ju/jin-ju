<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
	<form action="index.jsp" method="post"> <!--폼 태그가 페이지에서 페이지로 정보를 넘기는 유일한 방식-->  
		ID: <input type="text" name="user_id" value="hong"> <br>
		Name: <input type="text" name="user_name" value="홍길동"> <br>
		<input type="submit" value="전송"> 
	</form>
</body>
</html>