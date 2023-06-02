<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="InsertServlet" method ="post">



<h1> Employee details Form</h1>

 Name:<input type="text" name="Name"><br/>
 Email:<input type="text" name="email"><br/>
 Dept:<input type="text" name="Dept"><br/>
 Gender:<input type="text" name="Gender"><br/>
 Experience:<input type="text" name="Experience"><br/>



<input type="submit" value="submit">
<a href="filter.jsp" >Employees data</a>

</body>
</html>