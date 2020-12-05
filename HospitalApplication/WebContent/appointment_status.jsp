<!DOCTYPE html>
<html>

<body bgcolor="Wheat">
<br><br>

<br>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">patient Profile</a>
<a href="appointment.jsp">Appointment</a>
<a href="appointment_status.jsp"> Appointment status</a>
<a href="index.html">Logout</a>
<br>
<br>
<br>
<%@ include file="connect.jsp" %>
<table border="2" width="600" height="200" cellpadding="20" align="center">
<tr><td>patient name</td>
<td>phone</td>
<td>email</td>
<td>gender</td>
<td>Blood Group</td>
<td>Specialist</td>
<td>Date of appointment</td>
<td>Time of appointment</td>
<td>Doctor Name</td>
<td>Status</td></tr>
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