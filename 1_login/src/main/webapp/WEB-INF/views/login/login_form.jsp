<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/header/header.jsp" %>
	<h3 align="center">로그인</h3>
	<form action="login_check" method="post">
		<table align="center">
			<tr>
				<td>아이디 </td><td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호 </td><td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인"></td>
			</tr>
		</table>
	
	</form>
</body>
</html>