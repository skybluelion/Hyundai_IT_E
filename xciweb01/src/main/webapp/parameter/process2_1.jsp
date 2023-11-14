<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
   java.util.Map<String, String[]> paramMap = request.getParameterMap();
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
   h1, td {
      text-align: center;
   }
   table{
       width: 300px;
       height: 300px;
       margin: auto;
     }
     
</style>

<body>
<%
	for(String key : paramMap.keySet()){
		String[] values = paramMap.get(key);
		if(values.length > 1){
			for(int i = 0; i < values.length; i++){
				out.println(key + "[" + i + "]:" + values[i] + "<br/>" );
			}
		} else {
			out.println(key + ":" + values[0] + "<br/>" );	
		}
	}
%>

</body>
</html>