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
<h1>Welcome to student Home Page</h1>
<a href="./fouthyrStudent.html">Home</a> |
<a href="./student_profile.jsp">Profile</a> |
<a href="./feedback.jsp">feedback</a> |
<a href="./search_alumini.jsp">Search alumni</a> |
<a href="./index.html">logout</a>
</center>
<%@page import="com.pojo.Student,com.college.StudentLogin,java.util.*" %>
<div class="container">
		
		<table class="table table-bordered table-light">
			<tr class="table-danger">
		
			<th>STUDENTID</th>
			<th>STUDENT NAME</th>
			<th>STUDENT EMAIL</th>
			<th>PASSWORD</th> 
			<th>PRESENT YEAR</th>
			<th>DEPARTMENT</th>
			<th>MOBILE NUMBER</th>
			<th>ADDRESS</th>
		</tr>
<%
String id=(String)session.getAttribute("id");
System.out.print(id);
Session se=Configure1.configure();
Transaction ts=se.beginTransaction();
Query qe=se.createQuery("from Student s where s.sid=:x");
qe.setParameter("x",id);
List<Student> li=qe.list();
Iterator<Student> i=li.iterator();
Student s=null;
while (i.hasNext()) {
  s=i.next();
%>
<tr>
<td><%=s.getSid()%></td>
<td><%=s.getSname()%></td>
<td><%=s.getSemail()%></td>
<td><%=s.getSpassword()%></td>
<td><%=s.getPresentyr()%></td>
<td><%=s.getDepartment()%></td>
<td><%=s.getMobileno()%></td>
<td><%=s.getAddress()%></td>

<%} %>
</tr>








</table>
</div>
</body>
</html>