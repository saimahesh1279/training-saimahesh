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
<br><br>
<%@page import="com.pojo.Feedback,com.pojo.Teacher,com.college.TeacherBean,java.util.*" %>
<form action="./search_view_feedback.jsp" align="center">
<input type="text" name="stdid" placeholder="Enter student id">
<input type="submit" value="search">
</form><br><br>
<table border="2pxl" align="center" width="800" hight="400">
		<tr>
			<th>FEEDBACKID</th>
			<th>TEACHER ID</th>
			<th>TEACHER NAME</th>
			<th>TEACHER SUBJECT</th>
			<th>STUDENT ID</th>
			<th>FEEDBACK</th>
			<th>REMARKS</th>
		</tr>
<%
String stdid=request.getParameter("stdid");
Session se=Configure1.configure();
Transaction ts=se.beginTransaction();
Query qe=null;
if(stdid.length()==0){
	qe=se.createQuery("from Feedback f");	
}
else {
	qe=se.createQuery("from Feedback f where f.stdid=:x");
	qe.setParameter("x",stdid);
}
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

</body>
</html>