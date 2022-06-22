<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardModify</title>
</head>
<body>
<div align="center">
	<div><h1>게시글 목록</h1></div>
	<div>
	<form id="frm" action="boardModify.do" method="post">
	<input type="hidden" name="boardId" id="boardId" value="${board.boardId }" >
		<div>
		<table id="table" border="1">
			<tr>
				<th width="100">작성자</th>
				<td width="150">
				${board.boardName }</td>
			</tr>
			<tr>
				<th width="100">제목</th>
				<td colspan="3">
				<input size="58" type="text" id="boardTitle" name="boardName"value=${board.boardTitle }></td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${board.boardDate }</td>
			</tr>
			<tr>
				<th width="100">내용</th>
				<td colspan="3">
				<textarea rows="10" cols="60" name="boardContents" id="boardContents">
				${board.boardContents }
				</textarea></td>
			</tr>			
		</table>
		</div><br/>
	<div>
		<input type="submit" value="수정">&nbsp;&nbsp;
		<input type="button" value="목록" onclick="location.href='boardList.do'">
	</div>
		
	</form>
	</div>
	</div>
</body>
</html>