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
<h1>Welcome to Employee Home Page</h1>
<a href="./fouthyrStudent.html">Home</a> |
<a href="./student_profile.jsp">Profile</a> |
<a href="./feedback.jsp">feedback</a> |
<a href="./search_alumini.jsp">Search alumni</a> |
<a href="./index.html">logout</a>
</center><br><br>
<%@page import="com.pojo.Teacher,com.college.TeacherBean,java.util.*" %>
<form action="./feedback" method="post" align="center">
<div class="container">
		
		<table class="table table-bordered table-light">
			<tr class="table-danger">
<tr>
<th>Teacher Name</th>
<th>Subject</th>
<th>Rating</th>
<th>Remarks</th>
</tr>
<%
List<Teacher> li=TeacherBean.getTeacher();
Iterator i=li.iterator();
while(i.hasNext()){
	Teacher t=(Teacher)i.next();
%> 
<tr>
<input type="hidden" name="tid" value="<%=t.getTeacherid() %>">
<td><%=t.getTname()%></td>
<td><%=t.getSubject() %></td>
<td><input type="number" name="rating" min="1" max="5" value="1"></td>
<td><input type="text" name="remark"></td>
</tr>
<%}%>
</table><br><br>
</div>
<input type="submit" value="give feedback">
</form>
</body>
</html>