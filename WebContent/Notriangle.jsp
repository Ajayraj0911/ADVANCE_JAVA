<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int i,j; %>
<%
for (i = 1; i <= 5; ++i) {
  for (j = 1; j <= i; ++j) {
    System.out.print(j+" ");
  }
  System.out.println();
}

%>

</body>
</html>