<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>education page</title>
</head>
<body>
<p><%=request.getAttribute("status") %></p>

<form  align ="center" action="EducationServlet" method="post">
Highest Qualification:				<input type="text" name="qualification"><br/>
Passout Year:						<input type="text" name="passout year"><br/>
Percentage in Highest Qualification:<input type="text" name="percentage"><br/>
<input type="submit" name="submit">






</form>
</body>
</html>