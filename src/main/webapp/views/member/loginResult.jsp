<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${result>0 }">
		<script>
			alert("π¬λΉμ μ ott νμΈλπ¬\n\n       μ  Finderπ")
			location.href="/project_semi/views/main.do";
		</script>
	</c:if>
	
	<c:if test="${result==0 }">
		<script>
			alert("λΉλ°λ²νΈκ° μΌμΉνμ§ μμ΅λλ€.\nλ€μ μλν΄μ£ΌμΈμ.")
			history.back();
		</script>	
	</c:if>
	
	<c:if test="${result<0 }">
		<script>
			alert("μΌμΉνλ μμ΄λκ° μμ΅λλ€.")
			history.back();
		</script>
	</c:if>

</body>
</html>