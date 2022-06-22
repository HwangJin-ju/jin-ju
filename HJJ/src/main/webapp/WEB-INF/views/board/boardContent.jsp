<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div><h1>게시글</h1></div>
	<div>
		<table id="table" border="1">
			<tr>
				<th>제목</th>
				<td colspan="5">${content.boardTitle }</td>
			</tr>
			<tr>
				<th width="100">작성자</th>
				<td width="100">${content.boardName }</td>
				<th width="100">작성일</th>
				<td width="200">${content.boardDate }</td>
				<th width="100">조회수</th>
				<td width="100">${content.boardHit }</td>
			</tr>
			<tr>
				<th height="200">작성글</th>
				<td colspan="5">${content.boardContents }</td>
			</tr>			
		</table>
	</div><br>
	<div>
		<button type="button" onclick="location.href='boardModifyForm.do?boardId=${content.boardId }'">수정</button>&nbsp;&nbsp;
		<button type="button" onclick="location.href='boardDelete.do?boardId=${content.boardId}'">삭제</button>&nbsp;&nbsp;
		<button type="button" onclick="location.href='boardList.do'">목록</button>
	</div>
</div>
</body>
	
</html>