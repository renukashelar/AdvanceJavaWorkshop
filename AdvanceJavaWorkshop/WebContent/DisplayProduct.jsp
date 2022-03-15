<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>product details</h1>

<table>
<tr>
<th>id</th>
<th>name</th>
<th>price</th>
</tr>
  <c:forEach items="${list}" var="Product">
<tr>
<td>${Product.id}</td>
<td>${Product.name}</td>
<td>${Product.price}</td>
</tr>


</c:forEach>

</table>
</div>
</body>
</html>