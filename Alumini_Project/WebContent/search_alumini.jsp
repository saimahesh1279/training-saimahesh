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
<h1>Welcome to alumni search Page</h1>
<a href="./fouthyrStudent.html">Home</a> |
<a href="./student_profile.jsp">Profile</a> |
<a href="./search_alumini.jsp">Searcha alumini</a> |
<a href="./index.html">logout</a>

<br><br><br><br>
<br>
<form action="./search_alumini" method="post">
<input type="text" name="search" placeholder="Enter alumini ID">
<input type="submit" name="submit"><br><br><br><br><br>
<br><br><br><br>
<br>
</form>
</center>




<%@page import="com.pojo.AluminiData,java.util.*" %>
<div class="container">
		
		<table class="table table-bordered table-light">
			<tr class="table-danger">
		<tr>
			<th>ALUMINI STUDENT ID</th>
			<th>STUDENT NAME</th>
			
		</tr>
<%
Session se=Configure1.configure();
Transaction ts=se.beginTransaction();
Query qe=se.createQuery("from AluminiData a");

List<AluminiData> li=qe.list();
Iterator<AluminiData> i=li.iterator();
AluminiData s=null;
while (i.hasNext()) {
  s=i.next();
%>
<tr>
<td><%=s.getAid()%></td>
<td><%=s.getStdname()%></td>

<%} %>
</tr>
</table>
</div>


</body>
</html>