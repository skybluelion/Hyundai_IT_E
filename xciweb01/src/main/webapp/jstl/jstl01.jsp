<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="i" value="10" scope="page"/>
${i}
<hr>
\${10 + 5}=${10 + 5}<br/>
\${10 - 5}=${10 - 5}<br/>
\${10 * 5}=${10 * 5}<br/>
\${10 / 5}=${10 / 5}<br/>
\${10 % 5}=${10 % 5}<br/> 
\${10 mod 5}=${10 mod 5}<br/>
<%--
10
${10 + 5}=15
${10 - 5}=5
${10 * 5}=50
${10 / 5}=2.0
${10 % 5}=0
${10 mod 5}=0
 --%>
\${10 > 5}=${10 > 5}<br/> 
\${10 < 5}=${10 < 5}<br/> 
\${10 >= 5}=${10 >= 5}<br/> 
\${10 <= 5}=${10 <= 5}<br/> 
\${10 == 5}=${10 == 5}<br/> 
\${10 != 5}=${10 != 5}<br/> 
<%--
${10 > 5}=true
${10 < 5}=false
${10 >= 5}=true
${10 <= 5}=false
${10 == 5}=false
${10 != 5}=true
 --%>
 
</body>
</html>