
<%@page import="java.util.ArrayList"%>
<%@page import="com.filter.dto.FilterDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>select page</title>
</head>
<body>

	<form action="FilterServlet" method="post" >
		
			
				
				Department:	<select name="Dept">
						<option>---select---</option>
						<option>HR</option>
						<option>Development</option>
						<option>Testing</option>
						<option>
				</select>
				Gender:	<select name="Gender">

						<option value="">---select---</option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Other">Other</option>
						
				</select>
			
			
				

			
				e:<select name="Exp">
						<option>--select--</option>
						<option>5.0</option>
						<option>2.0</option>
						<option>10.0</option>
						<option>4.5</option>
				</select> 
				<input type="submit" value="search"/> 
	


	<h1>Employee details</h1>

	<table border="1" >


		<tr>

			<th bgcolor="yellow">id</th>
			<th bgcolor="yellow">Name</th>
			<th bgcolor="yellow">Email</th>
			<th bgcolor="yellow">d</th>
			<th bgcolor="yellow">Gender</th>
			<th bgcolor="yellow">Experience</th>

		</tr>
   <tbody>

		 
		<!--   <%
		
		 ArrayList <FilterDto>  list =(ArrayList<FilterDto>)request.getAttribute("empdata");
		 for(FilterDto e : list){
		 
		 
		 %>
		-->
		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getName()%></td>
			<td><%=e.getEmail()%></td>
			<td><%=e.getDept()%></td>
			<td><%=e.getGender()%></td>
			<td><%=e.getEmpExperience()%></td>
		</tr>
		<%
		 }
			%>
    </tbody>
	</table>
	<a href="Insert.jsp">Go to insert page</a>
	
	
	
	








</form>
</body>
</html>