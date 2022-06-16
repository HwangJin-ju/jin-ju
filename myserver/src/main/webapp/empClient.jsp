<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

<title>empClient.jsp</title>
</head>
<body>
	<div id="divList"></div>
	<script type="text/javascript">
		$.ajax({
			url : "req",
			method : "post",
			async : false,
			data : JSON.stringify({first_name : "gildong", last_name :"kim"}) ,
			contentType : "json", // 보내는 파라미터가 json형태의 스트링이라는 걸 알려줌
			// 쿼리 스트링("first_name=gildong&last_name=kim") 만들면 커맨드 객체(Employee vo) 안에 넘겨준 파라미터가 자동으로 들어감 
			//-> 제이쿼리는 제이슨 객체만들어서 넣으면 됨
			dataType : "json", // text, xml 등 내가 받고 싶은 타입
			success : function(result){
				console.log("결과는")
				console.log(result)
			}
		})
		console.log("요청")
	</script>

</body>
</html>