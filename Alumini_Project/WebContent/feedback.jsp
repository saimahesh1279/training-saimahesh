<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOURTH YEAR STUDENT HOME</title>
</head>
<body background="KHMhkNq2.jpg">
<center>
<h1>Welcome to Employee Home Page</h1>
<a href="./student_home.html">Home</a> |
<a href="./student_profile.jsp">Profile</a> |
<a href="./feedback.jsp">feedback</a> |
<a href="./search_alumini.jsp">Searcha alumini</a> |
<a href="./index.html">logout</a>
</center><br><br>
<%@page import="com.pojo.Teacher,com.college.TeacherBean,java.util.*" %>
<form action="./feedback" method="post" align="center">
<table border="2pxl" align="center" width="800" hight="400">
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
<input type="submit" value="give feedback">
</form>
</body>
</html>