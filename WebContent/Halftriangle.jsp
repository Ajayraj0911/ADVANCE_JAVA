<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

//<%! int rows = 5;%>
<%
for (int i = 1; i <= 5; ++i) {
  for (int j = 1; j <= i; ++j) {
    System.out.print("* ");
  }
  System.out.println();
}
%>

</body>
</html>