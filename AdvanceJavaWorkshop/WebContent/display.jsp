<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String id=request.getParameter("id");
String name=request.getParameter("name");
String price=request.getParameter("price");
out.println(id);
out.println(name);
out.println(price);
%>
</body>
</html>