<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.college.Configure1"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="KHMhkNq2.jpg">
<center>
<h1>Welcome to View Alumini Request page</h1>
<a href="./admin_home.html">Home</a> |
<a href="./add_student.jsp">ADD Student</a> |
<a href="./add_alumini.html">ADD ALUMINI</a> |
<a href="./view_student.jsp">View Student</a> |
<a href="./alumini_request.jsp">ALUMINI REQUESTS</a> |
<a href="./view_alumini_list.jsp">VIEW ALUMINI LIST</a> |
<a href="./view_feedback.jsp">VIEW FEEDBACK</a><br><br>
<a href="./index.html">logout</a>
<%@page import="com.pojo.AluminiUpdate,java.util.*" %>
<table border="2pxl" align="center" width="500" hight="300">
		<tr>
			<th>AluminiID</th>
			<th>Working Company</th>
			<th>designation</th>
			<th>update</th>
			
		</tr>
<%
Session se=Configure1.configure();
Transaction ts=se.beginTransaction();
Query qe=se.createQuery("from AluminiUpdate a");
List<AluminiUpdate> li=qe.list();
Iterator<AluminiUpdate> i=li.iterator();
AluminiUpdate au=null;
while (i.hasNext()) {
  au=i.next();
%>
<tr>
<td><%=au.getAid()%></td>
<td><%=au.getWorking_company()%></td>
<td><%=au.getDesignation()%></td>
<td><a href="./alumini_request?id=<%=au.getAid()%>">Accept</a></td>

<%} %>
</tr>
</table>
</body>
</html>