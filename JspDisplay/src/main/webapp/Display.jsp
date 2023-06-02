<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DisplayServlet" method ="post">



<h1> Employee details Form</h1>

 Name:<input type="text" name="name"><br/>
 Email<input type="text" name="email"><br/>
 Phone<input type="text" name="phone"><br/>



<input type="submit" value="submit">
<a href="FetchDetailsServlet" >Details</a>


</form>
</body>
</html>