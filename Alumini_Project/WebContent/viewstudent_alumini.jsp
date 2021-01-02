<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.college.Configure1"%>
<%@page import="org.hibernate.Session"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOURTH YEAR STUDENT HOME</title>
</head>
<body background="KHMhkNq2.jpg">
<center>
<h1>Welcome to Alumni Details page</h1>
<a href="./student_home.html">Home</a> |
<a href="./student_profile.jsp">Profile</a> |
<a href="./search_alumini.jsp">Searcha alumini</a> |
<a href="./index.html">logout</a>
<h1>your search result</h1>
<br><br>
</center>
<%@page import="com.pojo.AluminiData,java.util.*" %>
<table border="2pxl" align="center" width="500" hight="300">
		<tr>
			<th>ALUMINI STUDENT ID</th>
			<th>STUDENT NAME</th>
			<th>DEPARTMENT</th>
			<th>PASSEDOUT YEAR</th>
			<th>MOBILE NUMBER</th>
			<th>ADDRESS</th>
			<th>PERCENTAGE</th>
			<th>WORKING COMPANY</th>
			<th>DESIGNAION</th>
		</tr>
		
<%
AluminiData s=(AluminiData)session.getAttribute("details");
%>
<tr>
<td><%=s.getAid() %></td>
<td><%=s.getStdname() %></td>
<td><%=s.getDepartment() %></td>
<td><%=s.getPassedoutyr() %></td>
<td><%=s.getMobile() %></td>
<td><%=s.getAddress() %></td>
<td><%=s.getPercentage() %></td>
<td><%=s.getWorkingcompany() %></td>
<td><%=s.getDesignation() %></td>
</tr>
</table>


</body>
</html>