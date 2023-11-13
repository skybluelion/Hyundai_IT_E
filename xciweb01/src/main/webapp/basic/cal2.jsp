<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%-- page directive --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //scriptlet
	Calendar c = Calendar.getInstance(); // 실행하는 순간의 시간을 담음
	
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH) + 1; // 0부터 시작
	c.set(year, month - 1, 1); // 이번 달의 1일로 설정
	int week = c.get(Calendar.DAY_OF_WEEK); //일요일이 1        
	int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
%>

<table border="1">
	<caption><h1><%=year%>/ <%=month%></h1></caption><%-- expression --%>
	<tr>
		<th>일</th>
		<th>월</th>
		<th>화</th>
		<th>수</th>
		<th>목</th>
		<th>금</th>
		<th>토</th>
	</tr>
        <tr>
            <% 
            for (int w = 1; w < week; w++) {
                out.print("<td></td>");
            }

        	for (int d = 1, w = week; d <= endday; d++, w++) {
             	out.print("<td>" + d + "</td>");
            		if (w % 7 == 0) out.println("</tr><tr>");
            }
        	for(int rest = 0; rest <= 35-endday-week; rest++){
        		out.print("<td></td>");
        	}
        	
            %>

		</tr>
</table>
</body>
</html>