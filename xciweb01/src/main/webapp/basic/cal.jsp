<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%-- page directive --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <style>
 	table{
 		width: 500px;
 	}
    th, td {
      border:1px solid #ccc;
      border-collapse: collapse;
    }
    th {
    	padding: 2px 0px;
    }
    td {
    	text-align: left;
    	vertical-align: top;
    	padding: 5px 0px 50px 5px; 
    }
    .sun {
      color: red;
    }
    .sat{
      color: blue;
    }
    .lastMonth, .nextMonth{
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
	
    // Last month
    Calendar lastMonth = (Calendar) c.clone();
    lastMonth.add(Calendar.MONTH, -1);
    int lastMonthDays = lastMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
    int lastMonthStartDay = lastMonthDays - week + 2;

    // Next month
    int nextMonthDay = 1;
%>
<table border="1">
	<caption><h1><%=year%>년  <%=month%>월</h1></caption><%-- expression --%>
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
        <% 
            //last month
           for(int i = 1; i < week; i++) { %>
                <td class="lastMonth"><%=lastMonthDays - week + i + 1%></td>
        <% }

            //this month
            for (int d = 1, w = week; d <= endday; d++, w++) {
            	if((d % 7 + (week - 1)) % 7 == 1) {%>
                <td class="sun"><%=d%></td>
              <%} else if(d % 7 + (week - 1) == 7) {%>
              	<td class="sat"><%=d%></td>
              <%} else {%>
                <td><%=d%></td>
                <%}%>
                <% if (w % 7 == 0) { %>
                    </tr><tr>
                <% }
            }

            //next month
            for (int w = ((week - 1) + endday) % 7; w < 7; w++) { %>
                <td class="nextMonth"><%=nextMonthDay%></td>
                <% nextMonthDay++; 
            }
        %>
	</tr>
</table>

</body>
</html>