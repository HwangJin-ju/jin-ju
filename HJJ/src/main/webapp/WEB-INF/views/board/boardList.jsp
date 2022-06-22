<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<div><h1>글목록</h1></div>
		<div>
			<form id="frm">
				<select name="state" id="state">
					<option value="1">전체</option>
					<option value="2">작성자</option>
					<option value="3">제 목</option>
					<option value="4">내 용</option>
				</select>
				<input type="text" id="key" name="key">&nbsp;
				<button type="button" onclick="searchlist()">검색</button>
			</form>
		</div><br/>
		<div>
			<table id="tb" border="1">
				<thead>
					<tr>
						<th width="70">글번호</th>
						<th width="150">작성자</th>
						<th width="300">제목</th>
						<th width="150">작성일자</th>
						<th width="70">조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${!empty boards }">
						<c:forEach items="${boards }" var="b">
							<tr onclick="boardinfo(${b.boardId })">
								<td>${b.boardId }</td>
								<td>${b.boardName }</td>
								<td>${b.boardTitle }</td>
								<td>${b.boardDate }</td>
								<td>${b.boardHit }</td>
							</tr>
						</c:forEach>
					</c:if>
					<c:if test="${empty boards }">
						<tr>
							<td colspan="5" align="center">게시글이 존재하지 않습니다.</td>
						</tr>
					</c:if>
				</tbody>
			</table>
			<form id="frm2" action="" method="post">
				<input type="hidden" id="boardId" name="boardId">
			</form>
			<br>
			<div>
				<button type="button" onclick="location.href='boardInsertForm.do'">글
					등록</button>
			</div>
		</div>

	</div>
</body>

<script>

	function boardinfo(data){
	frm2.boardId.value = data;
	frm2.action="boardContent.do"
	frm2.submit();		
			}

</script>
</html>