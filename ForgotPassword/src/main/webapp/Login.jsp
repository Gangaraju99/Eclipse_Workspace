<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>

<body>
<% String message =(String) request.getAttribute("msg");
out.println(message);%>





<form action="LoginServlet" method ="post">
<b>Email</b><input type="text" name="email"><br>
<b>Password</b><input type="text" name="pwd"><br>
&nbsp;&nbsp;&nbsp;&nbsp;</b><input type="submit"  name="login"></b>
<br>
<br>
</form>
<a href="Forgetpwd.jsp" style "color:red">Forget Password</a>&nbsp;&nbsp;&nbsp;<a href="Register.jsp" style "color:green">Sign Up</a>






</body>
</html>