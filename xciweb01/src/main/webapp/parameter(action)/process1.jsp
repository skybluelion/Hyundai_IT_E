<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="reserv" class="beans.Reservation" scope="page"/>
<jsp:setProperty property="*" name="reserv"/>
<%--
	setProperty를 풀어쓰면 아래와 같다.
	beans.Reservation reserv = new beans.Reservation();
	reserv.setName(request.getParameter("name"));
	reserv.setPhone(request.getParameter("phone"));
	reserv.setEmail(request.getParameter("email"));
	
 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
name: <jsp:setProperty property="name" name="reserv"/><br/>
phone: <%=reserv.getPhone() %><br/>
email: <%=reserv.getEmail() %><br/>
</body>
</html>