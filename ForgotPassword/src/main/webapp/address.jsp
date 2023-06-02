<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>address page</title>
</head>
<body>
<p><%=request.getAttribute("status") %></p>
<form action="AddressServlet" method="post">
City:<input type="text" name="city"><br/>
State:<input type="text" name="state"><br/>
Country:<input type="text" name="country"><br/>
<input type="submit"  name="submit"/>
</form>

</body>
</html>