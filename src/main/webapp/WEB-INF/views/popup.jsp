<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠키를 위한 팝업창입니다</h3>
	<input type="checkbox" onclick="clo()" id="ck" name="id" >하루도안 열지않음
	<script type="text/javascript">
			function clo(){
					location.href="cookiechk"
					window.close()
			}
	
	
	</script>
</body>
</html>