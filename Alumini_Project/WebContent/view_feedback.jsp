<%@page import="com.college.TeacherBean"%>
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
<center>
<h1>Welcome to STUDENT  FEEDBACK PAGE Page</h1>
<a href="./admin_home.html">Home</a> |
<a href="./add_student.jsp">ADD Student</a> |
<a href="./add_alumini.html">ADD ALUMINI</a> |
<a href="./view_student.jsp">View Student</a> |
<a href="./alumini_request.jsp">ALUMINI REQUESTS</a> |
<a href="./view_alumini_list.jsp">VIEW ALUMINI LIST</a> |
<a href="./view_feedback.jsp">VIEW FEEDBACK</a><br><br>
<a href="./index.html">logout</a>
</center>
<br><br>
<%@page import="com.pojo.Feedback,com.pojo.Teacher,com.college.TeacherBean,java.util.*" %>
<form action="./search_view_feedback.jsp" align="center">
<input type="text" name="stdid" placeholder="Enter student id">
<input type="submit" value="search">
</form><br><br>
<div class="container">
		
		<table class="table table-bordered table-light">
			<tr class="table-danger">
			<th>FEEDBACKID</th>
			<th>TEACHER ID</th>
			<th>TEACHER NAME</th>
			<th>TEACHER SUBJECT</th>
			<th>STUDENT ID</th>
			<th>FEEDBACK</th>
			<th>REMARKS</th>
		</tr>
<%
Session se=Configure1.configure();
Transaction ts=se.beginTransaction();
Query qe=se.createQuery("from Feedback f");
List<Feedback> li=qe.list();
Iterator<Feedback> i=li.iterator();
Feedback f=null;
while (i.hasNext()) {
  f=(Feedback)i.next();
  Teacher t=TeacherBean.getTeacherById(f.getTeacherid());
%>
<tr>
<td><%=f.getFid()%></td>
<td><%=f.getTeacherid()%></td>
<td><%=t.getTname() %></td>
<td><%=t.getSubject() %></td>
<td><%=f.getStdid()%></td>
<td><%=f.getRating()%></td>
<td><%=f.getRemarks()%></td>

<%} %>
</tr>
</table>
</div>
</body>
</html>