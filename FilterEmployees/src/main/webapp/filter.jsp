<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="insert.jsp"> add user</a>

<form action="FilterServlet" method="post">
Gender:<input type="radio" name="r" value="Male">Male
	<input type="radio" name="r" value="FeMale">Female<br/>
	Employee Department:<select name="dept">
<option >null<option>HR<option>Development<option>Testing</option></select><br/>

Employee Exp:<select name="exp">
<option>0<option>1<option>2<option>4<option>5<option>10</option></select><br/>

<input type="submit" value="search">
<table border ="1">
<thead>
<tr>
<td>ID</td>
<td>EmpName</td>
<td>email</td>
<td>gender</td>
<td>Department</td>
<td>Experience</td>
</tr>
</thead>
<tbody>
<c:forEach items="${empdata}" var ="user">
<tr>
<td>${user.id} </td>
<td>${user.name} </td>
<td>${user.email} </td>
<td>${user.gender} </td>
<td>${user.dept} </td>
<td>${user.empExperience} </td>
</tr>
</c:forEach>


</tbody>

</table>
</form>
</body>
</html>