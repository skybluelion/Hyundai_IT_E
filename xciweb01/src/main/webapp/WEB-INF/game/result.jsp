<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h1>결과</h1>
<table border = "1">
	<tr>
		<td>나</td>
		<td>vs</td>
		<td>Com</td>
	</tr>
	<tr>
		<td>${you}</td>
		<td> </td>
		<td>${com}</td>
	</tr>
	<tr>
		<td colspan = "3">${winner}</td>
	</tr>
</table>
</body>
</html>