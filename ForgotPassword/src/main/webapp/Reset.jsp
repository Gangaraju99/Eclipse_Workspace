
<%@page import="com.forget.dto.ForgetDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>reset page</title>
</head>
<body>
<% String mail = (String)session.getAttribute("usermail");
  session.setAttribute("mailid",mail);

%>
<form action="ResetServlet" method="post">
user email:<input type="text"  name="mail" value="<%= session.getAttribute("usermail") %>"> 
New Password:<input type="text" name="pwd"><br/>
Confirm Password:<input type="text" name="confirmPwd"><br/>
<input type="submit" name="submit">
</form>
<a href="Login.jsp"> Login</a>
 
        







</body>
</html>