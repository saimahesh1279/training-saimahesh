<!DOCTYPE html>
<html>

<body bgcolor="Wheat">
<br><br>

<br>
<a href="doctor_home.html">Home</a><br><br><br>
<a href="doctor_profile.jsp">Doctor Profile</a><br><br><br>
<a href="index.html">Logout</a>
<br>
<br>
<br>
<%@ page import="java.sql.*" %>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Did</td><td>dname</td><td>Email</td><td>Phone</td><td>gender</td><td>Specialization</td><td>experiance</td><td>address</td><td>additional</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String user="root";
String password="root";
String url="jdbc:mysql://localhost:3306/hospital";
con=DriverManager.getConnection(url,user,password);
ps=con.prepareStatement("select * from doctor where email=?");
String email=(String)session.getAttribute("demail");
ps.setString(1, email);
ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt("Did")%></td>
<td><%=rs.getString("dname")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getLong("phone")%></td>
<td><%=rs.getString("gender")%></td>
<td><%=rs.getString("specialization")%></td>
<td><%=rs.getInt("experiance")%></td>
<td><%=rs.getString("address")%></td>
<td><a href="update_doctor_profile.jsp?id=<%=rs.getInt(1)%>">update</a></td>
</tr>
<%} %>

</table>
</body>
</html>