<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<script>
  $( function() {
    $( "#accordion" ).accordion({
    	collapsible: true
    });
  } );
  </script>
</head>
<body>
<div id="accordion">
<c:forEach items="${jobs }" var="j">
	<h3>${j.job_title} </h3>
	<div>
		<c:forEach items="${j.employees }" var="e">
			<div>${e.first_name }</div>
		</c:forEach>
	</div>
</c:forEach> 
</div>
</body>
</html>