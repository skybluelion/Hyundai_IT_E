<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String field = request.getParameter("field");
	String[] hobby = request.getParameterValues("hobby");
	int gender = Integer.parseInt(request.getParameter("gender"));
	String motive = request.getParameter("motive");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
name: <%=name %><br/>
phone: <%=phone %><br/>
field: <%=field %><br/>
hobby: 

<% 
if(hobby != null){
	for(int i = 0; i < hobby.length; i++) {%>
	<%=hobby[i]%>
	<%if(i == hobby.length - 1) break;%>, 
<%}} %><br/>
gender: <%=gender %><br/>
motive: <%=motive %><br/>





</body>
</html>