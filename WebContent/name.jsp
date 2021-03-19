<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>NAME PAGE</h1>
	<%   
		String name = (String)request.getAttribute("name");
		out.println(name);
	%>
	<h3>USING EXPRESSION</h3>
	<%=request.getAttribute("name")%>
</body>
</html>