<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logout page</title>
</head>
<body>
<%
String message ="You have been successfully logout";
request.setAttribute("msg",message);
session.invalidate();
response.sendRedirect("Login.jsp");

%>

<%-- <p>You have been successfully logout</p> --%>

<%-- <form action="LogoutServlet" method="post"></form>--%>
</body>
</html>