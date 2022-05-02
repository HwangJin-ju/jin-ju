<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>
</head>
<body>
	<script>
		// Asynchronous Javascript And Xml. (처리방식이 비동기)
		let url = 'StudentGetServlet'; // json 타입
		fetch(url) //promise 타입을 리턴함 비동기방식으로 위의 페이지를 호출
			.then(result => { // 정상 실행되면 내가 정의한 콜백함수 실행
				console.log(result)
				return result.json(); // {"id":23, "name": "hong"} 스트림 타입의 데이터를 json 타입으로 (response의 body에 들어있음) 현재 펜딩상태
			})
			.then(result => {
				console.log(result);
			})
			.catch(error => { // 에러
				console.log(error);
			})
	</script>

</body>
</html>