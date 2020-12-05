<!DOCTYPE html>
<html>

<body bgcolor="Wheat">
<br><br>

<br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Doctor Profile</a>
<a href="view_appointment.jsp">Appointment</a>
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
<td>\date</td>
<td>time</td>
<td>Action</td>
</tr>
<% 
String specialist=(String)session.getAttribute("specialization");
ps=con.prepareStatement("select * from appointment where specialist=?");
ps.setString(1, specialist);
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
<%if(rs.getString(11).equalsIgnoreCase("Accepted")){ %>
			<td>Accepted</td>
			<%}else{ %>
			<td><a href="accpet_appointment.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
			<%} %>
			</tr>
			<%} %>
</table>

</body>
</html>