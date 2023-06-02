<%@page import="com.jsp.dto.DisplayDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee data</title>
</head>
<body>
	<h1>Employee details</h1>

	<table border="1" bgcolor="white">


		<tr>
			<th bgcolor="yellow">name</th>
			<th bgcolor="yellow">Email</th>
			<th bgcolor="yellow">phone</th>
			<th bgcolor="yellow">Action</th>
		</tr>

		<%
		try {

			ArrayList<DisplayDto> details = (ArrayList<DisplayDto>) request.getAttribute("list");

			for (DisplayDto e : details) {
		%>
		<tr>
			<td><%=e.getName()%></td>
			<td><%=e.getEmail()%></td>
			<td><%=e.getPhone()%></td>
			<td><a href="Display.jsp">Edit</a>
				<form action="DeleteUserServlet" method="post"
					onsubmit="return confirm('Are you sure you want to delete this record?');">
					<input type="hidden" name="email" value="<%=e.getEmail()%>">
					<input type="submit" value="Delete">
				</form> <%
 }
 } catch (Exception ex) {
 ex.printStackTrace();
 }
 %>
	</table>

</body>
</html>