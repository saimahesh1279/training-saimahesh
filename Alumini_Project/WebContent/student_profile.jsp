<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.college.Configure1"%>
<%@page import="org.hibernate.Session"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT HOME</title>
</head>
<body background="KHMhkNq2.jpg">
<center>
<h1>Welcome to student Home Page</h1>
<a href="./student_home.html">Home</a> |
<a href="./student_profile.jsp">Profile</a> |
<a href="./index.html">logout</a>
</center>
<%@page import="com.pojo.Student,com.college.StudentLogin,java.util.*" %>
<table border="2pxl" align="center" width="500" hight="300">
		<tr>
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

</body>
</html>