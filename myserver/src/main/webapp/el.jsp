<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>el</h4>
<fmt:parseDate value="2020-07-10 10:25" pattern="yyyy-MM-dd hh:mm" var="dt" />
<fmt:formatDate value="${dt}"  pattern="MM-dd" /><br>
<c:set var="arr" value="<%=Arrays.asList(\"바나나\",\"사과\")%>" />
배열크기: ${fn:length(arr) }<br>
포함여부: ${fn:contains(arr,"바나나") }<br>
포함여부: ${fn:contains(arr,"포도") }<br>
<ul>
<li><%=request.getParameter("id") %>
<li>${param.id }
<li><%=request.getHeader("user-agent") %>
<li>${header["user-agent"] }
<li><%=request.getHeader("referer") %>
<li>${header["referer"] }
<li><%=session.getAttribute("userid")%>
<li>${sessionScope.userid }
<li><%=request.getRequestURI() %>
<li>${pageContext.request.requestURI }
<li>${pageContext.request.getRequestURI() }
</ul>
</body>
</html>