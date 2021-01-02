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
<h1>Welcome to alumni search Page</h1>
<a href="./student_home.html">Home</a> |
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
<table border="2pxl" align="center" width="500" hight="300">
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



</body>
</html>