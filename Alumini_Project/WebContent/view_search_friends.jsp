<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.college.Configure1"%>
<%@page import="org.hibernate.Session"%>

<!DOCTYPE html>
<html>
<head>
<style>
body, html {
  height: 100%;
  margin: 0;
}
.bg {
  /* The image used */
  background-image: url("KHMhkNq2.jpg");
  /* Full height */
  height: 100%; 
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: repeat;
  background-size: cover;
}
</style>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="#E6E6FA" class="bg">

<center>
<h1>Welcome to alumni Friends search Page</h1>
<a href="./alumini_home.html">HOME</a> <br><br><br>
<a href="./alumini_update.html">ALUMNI UPDATE</a> <br><br><br>
<a href="./alumini_profile.jsp">ALUMNI PROFILE</a> <br><br><br>
<a href="./search_friends.jsp">SEARCH ALUMNI PROFILE</a> <br><br><br>
<a href="./index.html">logout</a>

<h1>your search result</h1>
<br><br>
</center>
<%@page import="com.pojo.AluminiData,java.util.*" %>
<div class="container">
		
		<table class="table table-bordered table-light">
			<tr class="table-danger">
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
</div>

</body>
</html>