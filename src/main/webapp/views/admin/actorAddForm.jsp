<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="admin_sessionChk.jsp" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/project_semi/css/admin/admin.css">

</head>
<body>
	<button onclick="location.href='/project_semi/views/admin/admin_main.do'">메인으로</button>
	<form action="/project_semi/views/admin/actorAddAction.do">
		<input type="hidden" name="movieno" value=${movieno }>
		<table><caption>${movieno }번 영화</caption>
			<tr>
				<th>추가할 배우</th>
				<td><input type="text" name="actorname"></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit"></th>
			</tr>
		</table>
	</form>

</body>
</html>