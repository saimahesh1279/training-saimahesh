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
<br><br>
<center>
<h1>Welcome ALUMNI PROFILE Page</h1>
<a href="./alumini_home.html">HOME</a> <br><br><br>
<a href="./alumini_update.html">ALUMINI UPDATE</a> <br><br><br>
<a href="./alumini_update.jsp">ALUMINI PROFILE</a> <br><br><br>
</center>
<br><br>


<form action="./alumini_profile.jsp" method="post"></form>
<%@page import="com.pojo.AluminiData,com.college.AluminiLogin,java.util.*" %>
<div class="container">
		
		<table class="table table-bordered table-light">
			<tr class="table-danger">
			<th>ALUMNIID</th>
			<th>ALUMNI NAME</th>
			<th>PASSWORD</th>
			<th>DEPARTMENT</th>
			<th>PASSED OUT YEAR</th>
			<th>MOBILE NUMBER</th>
			<th>ADDRESS</th>
			<th>PERCENTAGE</th>
			<th>WORKING COMPANY</th>
			<th>DESIGNATION</th>
			
		</tr>
<%
String id=(String)session.getAttribute("alumniid");
System.out.print(id);
Session se=Configure1.configure();
Transaction ts=se.beginTransaction();
Query qe=se.createQuery("from AluminiData a where a.aid=:x");
qe.setParameter("x",id);
List<AluminiData> li=qe.list();
Iterator<AluminiData> i=li.iterator();
AluminiData s=null;
while (i.hasNext()) {
  s=i.next();
%>
<tr>
<td><%=s.getAid()%></td>
<td><%=s.getStdname()%></td>
<td><%=s.getPassword()%></td>
<td><%=s.getDepartment()%></td>
<td><%=s.getPassedoutyr()%></td>
<td><%=s.getMobile()%></td>
<td><%=s.getAddress()%></td>
<td><%=s.getPercentage()%></td>
<td><%=s.getWorkingcompany()%></td>
<td><%=s.getDesignation()%></td>
<%} %>
</tr>








</table>
</div>
</body>
</html>