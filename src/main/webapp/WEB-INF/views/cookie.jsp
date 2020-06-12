<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function popup(){
		console.log("cookie => ","${cook}")
		if("${cook}" == ""){
			window.open("pop","",
				"width=300,height=200,top=500,left=500");
		}
	}
</script>
</head>
<body onload="popup()">
	cookie 페이지 입니다
</body>
</html>

