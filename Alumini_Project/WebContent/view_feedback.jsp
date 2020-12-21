<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.college.Configure1"%>
<%@page import="org.hibernate.Session"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENTS LIST</title>
</head>
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
<%@page import="com.pojo.Feedback,java.util.*" %>
<table border="2pxl" align="center" width="500" hight="300">
		<tr>
			<th>FEEDBACKID</th>
			<th>TEACHER ID</th>
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
  f=i.next();
%>
<tr>
<td><%=f.getFid()%></td>
<td><%=f.getTeacherid()%></td>
<td><%=f.getStdid()%></td>
<td><%=f.getFeedback()%></td>
<td><%=f.getRemarks()%></td>

<%} %>
</tr>








</table>

</body>
</html>