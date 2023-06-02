<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>family page</title>
</head>
<body>
<p><%=request.getAttribute("status") %></p>
<form  align ="center" action="FamilyServlet" method="post">
Father Name: <input type="text" name="FatherName"><br/>
Mother Name: <input type="text" name="MotherName"><br/>
No.Of.Siblings:<input type="text" name="Siblings"><br/>
<input type="submit" name="submit">

</body>
</html>