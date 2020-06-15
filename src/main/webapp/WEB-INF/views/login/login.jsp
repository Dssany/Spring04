<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function popup(){
		console.log("cookie => ","${cook}")
		if("${cook}" == ""){
			window.open("popup","",
				"width=300,height=200,top=500,left=500");
		}else{
			return;
		}
	}
</script>

</head>
<body onload="popup()">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
	<c:when test="${loginUser ne null}">
		
		${loginUser }님 로그인 상태입니다
		<a href="main">main 이동</a>
	</c:when>
	<c:otherwise>

		<form action="Chkuser" method="post">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="text" name="pw"><br>
		<input type="submit" value="전송">
<%-- 		<jsp:include page="/WEB-INF/views/pop.jsp"/> --%>

	</form>
	</c:otherwise>

</c:choose>
	
</body>
</html>