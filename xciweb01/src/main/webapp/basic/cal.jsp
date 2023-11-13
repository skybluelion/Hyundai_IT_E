<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%-- page directive --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <style>
    th, td {
      border:1px solid #ccc;
      border-collapse: collapse;
    }
    th { padding:10px 10px; }
    td { padding:20px 30px; }
    .sun {
      color: red;
    }
    .sat{
      color: blue;
    }
    .nextMonth{
    	color: #BDBDBD;
    }
  </style>
</head>
<body>
<% //scriptlet
	Calendar c = Calendar.getInstance(); // 실행하는 순간의 시간을 담음
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH) + 1; // 0부터 시작
	c.set(year, month - 1, 1); // 이번 달의 1일로 설정
	int week = c.get(Calendar.DAY_OF_WEEK); //일요일이 1        
	int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
	
	Calendar c1 = Calendar.getInstance(); // 전 달
	int year1 = c1.get(Calendar.YEAR);
	int month1 = c1.get(Calendar.MONTH) + 1; 
	c1.set(year1, month1 - 1, 1);
	int week1 = c1.get(Calendar.DAY_OF_WEEK);      
	int endday1 = c1.getActualMaximum(Calendar.DAY_OF_MONTH);
	
	Calendar c2 = Calendar.getInstance(); // 다음 달
	int year2 = c2.get(Calendar.YEAR);
	int month2 = c2.get(Calendar.MONTH) + 1;
	c2.set(year2, month2 - 1, 1);
	int week2 = c2.get(Calendar.DAY_OF_WEEK);     
	int endday2 = c2.getActualMaximum(Calendar.DAY_OF_MONTH);
%>
<table border="1">
	<caption><h1><%=year%>/ <%=month%></h1></caption><%-- expression --%>
	<tr>
		<th class="sun">일</th>
		<th>월</th>
		<th>화</th>
		<th>수</th>
		<th>목</th>
		<th>금</th>
		<th class="sat">토</th>
	</tr>
        <tr>
            <% for (int rest = week; rest > week - 1; rest--)  {%>
            	<td class="lastMonth"><%= endday2 - rest %></td>
       		<%} %>
            <% for (int w = 1; w < week; w++) { %>
                <td></td>
            <% } %>

        	<% for (int d = 1, w = week; d <= endday; d++, w++) { %>
            <td><%=d%></td>
            <% 		if (w % 7 == 0) { %>
                    	</tr><tr>
            <%	}
            }
            %>
            <% for (int rest = 0; rest <= 35-endday-week; rest++)  {%>
            	<td class="nextMonth"><%= rest + 1 %></td>
       		<%} %>
		</tr>
</table>

</body>
</html>