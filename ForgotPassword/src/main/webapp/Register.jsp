+<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register page</title>
</head>
<body>
<form action="RegisterServlet" method="post">

First Name:<input type="text" name="Fname"><br/>
Last Name:<input type="text" name="Lname"><br/>
Email:<input type="text" name="email"><br/>
Password:<input type="text" name="pwd"><br/>
Gender:<input type="radio" name="Gender" value="Male">Male
<input type="radio" name="Gender" value="Female">Female
<input type="radio" name="Gender" value="Others">Others<br/>
<input type="submit" name="submit"> &nbsp;&nbsp;&nbsp;

<a href="Login.jsp"  style="color:red"> Login</a>



</form>
</body>
</html>