<!DOCTYPE html>
<html>

<body bgcolor="Wheat">
<br><br>

<br>
<a href="patient_home.html">Home</a><br><br><br>
<a href="patient_profile.jsp">patient Profile</a><br><br><br>
<a href="appointment.jsp">Appointment</a><br><br><br>
<a href="appointment_status.jsp"> Appointment status</a><br><br><br>
<a href="index.html">Logout</a>
<br>
<br>
<br>
<%@ include file="connect.jsp" %>
<table border="2" width="600" height="200" cellpadding="20" align="center">
<tr><td>PATIENT NAME</td>
<td>PHONE</td>
<td>EMAIL</td>
<td>GENDER</td>
<td>BLOOD GROUP</td>
<td>SPECIALIST</td>
<td>DATE OF APPOINTMENT</td>
<td>TIME OF APPINTMENT</td>
<td>DOCTOR NAME</td>
<td>STATUS</td></tr>
<% 
int pid=(Integer)session.getAttribute("id");
ps=con.prepareStatement("select * from appointment where pid=?");
ps.setInt(1, pid);
ResultSet rs=ps.executeQuery();
while(rs.next())
{

%>
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getInt(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(9) %></td>
<td><%=rs.getString(10) %></td>
<td><%=rs.getString(11) %></td>
</tr>
<%}%>
</table>
</body>
</html>