<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>도서수정조회</h3>
    <form action="../searchBook.do" method="get">
        <input type="text" name="bookCode" id=""><br>
        <input type="hidden" name="job" value="modify">
        <input type="submit" value="조회">
    </form>
    
    <!-- 도서수정을 위한 화면 작성코드를 입력하세요. -->
    
    <c:choose>
    	<c:when test="${!empty result }"><h3>${result }</h3></c:when>
		<c:otherwise>
			<h3>도서 수정</h3>
			<form action="${pageContext.servletContext.contextPath }/modifyBook.do" method="post">
				도서코드: <input type="text" name="bookCode" readonly value="${vo.bookCode }"><br>
				제목: <input type="text" name="title" value="${vo.bookTitle}"><br>
				작가: <input type="text" name="author" value="${vo.bookAuthor }"><br>
				출판사: <input type="text" name="press" value="${vo.bookPress }"><br>
				가격: <input type="text" name="price" value="${vo.bookPrice }"><br>
				<input type="submit" value="수정">
			</form>
			
		</c:otherwise>
	</c:choose>
    	

    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>