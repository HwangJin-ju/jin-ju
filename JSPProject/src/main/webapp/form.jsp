<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
	<!-- action : /같은 거 없음 -> webapp, form 둘 다 상위에 있어서 경로가 맞음 -->
	<form name="frm" action="StudentGetServlet" method="get">
		<!--폼 태그가 페이지에서 페이지로 정보를 넘기는 유일한 방식-->
		<input type="hidden" name="cmd" value="search"> 
		ID: <input type="number" name="user_id" value="111"> <br> 
		Name: <input type="text" name="user_name" value="홍길동"> <br> 
		Eng: <input type="number" name="eng_score"> <br>
		Kor: <input type="number" name="kor_score"> <br>
		<input type="submit" value="조회">
		<input id = "addBtn" type="button" value="입력">
		<input id = "modBtn" type="button" value="수정">
		<input id = "delBtn" type="button" value="삭제">
	
	</form>
	<hr>
	<a href="studentList.jsp">학생목록</a>
	<script>
	

		let modBtn = document.getElementById('modBtn');
		modBtn.addEventListener('click', function() {
			let frm= document.forms.frm;
			frm.method = "post";
			frm.cmd.value = "mod"; // cmd에다 mod를 파라미터로 넘김
			
			frm.submit();
		})
	
		let delBtn = document.getElementById('delBtn');
		delBtn.addEventListener('click', function() {
			let frm = document.forms.frm;
			frm.method = "post";
			frm.cmd.value = "del";
			
			frm.submit(); // submit 버튼 클릭
			
		})
	
		let btn = document.querySelector('#addBtn');
		btn.addEventListener('click', function() {
			let frm = document.forms.frm;

			frm.action = "StudentGetServlet";
			frm.method = "post";
			frm.cmd.value = "add";
			
			frm.submit() // form의 submit 버튼을 누르는 것과 같다
		});
	</script>
</body>
</html>