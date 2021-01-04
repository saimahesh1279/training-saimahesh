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
<body background="KHMhkNq2.jpg">
<h1>Welcome to Alumni view page</h1>
<a href="./admin_home.html">Home</a> |
<a href="./add_student.jsp">ADD Student</a> |
<a href="./add_alumini.html">ADD ALUMINI</a> |
<a href="./view_student.jsp">View Student</a> |
<a href="./alumini_request.jsp">ALUMINI REQUESTS</a> |
<a href="./view_alumini_list.jsp">VIEW ALUMINI LIST</a> |
<a href="./view_feedback.jsp">VIEW FEEDBACK</a><br><br>
<a href="./index.html">logout</a>

<%@page import="com.pojo.AluminiData,java.util.*" %>
<div class="container">
		
		<table class="table table-bordered table-light">
			<tr class="table-danger">
	
			<th>ALUMINIID</th>
			<th>STUDENT NAME</th>
			<th>DEPARTMENT</th>
			<th>PASSEDOUT YEAR</th>
			<th>MOBILE NUMBER</th>
			<th>ADDRESS</th>
			<th>PERCENTAGE</th>
			<th>WORKING COMPANY</th>
			<th>DESIGNATION</th>
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
<td><%=s.getDepartment()%></td>
<td><%=s.getPassedoutyr()%></td>
<td><%=s.getMobile()%></td>
<td><%=s.getAddress()%></td>
<td><%=s.getPercentage()%></td>
<td><%=s.getWorkingcompany()%></td>
<td><%=s.getDepartment()%></td>

<%} %>
</tr>








</table>
</body>
</body>
</html>