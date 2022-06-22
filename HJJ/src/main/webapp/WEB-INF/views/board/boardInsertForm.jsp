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
		<div><h1>글쓰기</h1>
		</div>
		<div>
			<form id="frm" action="boardInsert.do" method="post">
				<div>
					<table id="table" border="1">
						<tr>
							<th>작성자</th>
							<td width="200">
							<input size="20" type="text" id="boardName" name="boardName">
							</td>
							<th width="100">작성일자</th>
							<td>
								<input type="date" id="boardDate" name="boardDate">
							</td>
						</tr>
						<tr>
							<th width="90">제목</th>
							<td colspan="3">
							<input type="text" id="boardTitle" name="boardTitle">
							</td>
						</tr>
						<tr>
							<th width="90">내용</th>
							<td colspan="3">
								<textarea rows="10" cols="60" id="boardContents" name="boardContents"></textarea>
						</tr>
					</table>
				</div><br>
				<div>
					<input type="submit" value="저장">&nbsp;&nbsp;
					<input type="button" value="목록" onclick="location.href='boardList.do'">
				</div>
			</form>
		</div>
	</div>
</body>
</html>