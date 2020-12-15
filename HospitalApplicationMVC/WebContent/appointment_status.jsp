<!DOCTYPE html>
<%@page import="com.MVC.AppointmentBean"%>
<html>
<body bgcolor="wheat">
<br><br>
<center><h1>Welcome to Appointment Stauts  Page</h1>
<br><br>
<a href="./patient_home.html">HOME</a> <br><br><br> 
<a href="./patient_profile.jsp">PROFILE</a> <br><br><br> 
<a href="./appointment.jsp">APPOINTMENT</a> <br><br><br> 
<a href="appointment_status.jsp">APPOINTMENT STATUS</a> <br><br><br> 
<a href="./index.html">LOGOUT</a>
</center>
<br><br>
<%@page import="com.MVC.AppointmentBean,java.util.*" %>
<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>PATIENT NAME</td>
			<td>MOBILE NUMBER</td>
			<td>EMAIL</td>
			<td>GENDER</td>
			<td>BLOOD GROUP</td>
			<td>SPECIALIST</td>
			<td>DATE OF APPOINTMENT</td>
			<td>TIME OF APPOINTMENT</td>
			<td>DOCTOR NAME</td>
			<td>STATUS</td>
		</tr>
<%
int id=(Integer)session.getAttribute("id");
List<AppointmentBean> l=new AppointmentBean().status(id);
Iterator i=l.iterator();
while(i.hasNext()){
AppointmentBean ab=(AppointmentBean)i.next();
%>
<tr>
			<td><%=ab.getPname() %></td>
			<td><%=ab.getPhone() %></td>
			<td><%=ab.getEmail() %></td>
			<td><%=ab.getGender() %></td>
			<td><%=ab.getBlood_group() %></td>
			<td><%=ab.getSpecialist() %></td>
			<td><%=ab.getDate_of_appointment() %></td>
			<td><%=ab.getTime_of_appointment() %></td>
			<td><%=ab.getDname() %></td>
			<td><%=ab.getStatus() %></td>
		</tr>
<%} %>
</table>
</body>
</html>