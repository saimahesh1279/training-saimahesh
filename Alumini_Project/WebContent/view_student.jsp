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

<h1>Welcome to STUDENT VIEW Page</h1>
<a href="./admin_home.html">Home</a> |
<a href="./add_student.jsp">ADD Student</a> |
<a href="./add_alumini.html">ADD ALUMINI</a> |
<a href="./view_student.jsp">View Student</a> |
<a href="./alumini_request.jsp">ALUMINI REQUESTS</a> |
<a href="./view_alumini_list.jsp">VIEW ALUMINI LIST</a> |
<a href="./view_feedback.jsp">VIEW FEEDBACK</a><br><br>
<a href="./index.html">logout</a>
<%@page import="com.pojo.Student,java.util.*" %>
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
Session se=Configure1.configure();
Transaction ts=se.beginTransaction();
Query qe=se.createQuery("from Student s");
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