<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Manager Profile Update Page</h1>
		<a href="./manager_home.html">Home</a> | <a
			href="./manager_profile.jsp">Profile</a> | <a href="./index.html">logout</a>
	</center>
	<br>
	<br>
	<%@include file="connect.jsp"%>
	<%
	   int id=Integer.parseInt(request.getParameter("id"));
	ps = con.prepareStatement("select * from manager where mid=?");
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<form action="./manager_profile_update.jsp" align="center">
	<input type="hidden" name="id" value="<%=rs.getInt("mid")%>">
<input type="text" name="mname" value="<%=rs.getString("mname")%>"><br><br>
<input type="email" name="email" value="<%=rs.getString("email")%>"><br><br>
<input type="number" name="phone" value="<%=rs.getInt("phone")%>"><br><br>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female<br><br>
<input type="number" name="experience" value="<%=rs.getInt("experience")%>"><br><br>
<textarea rows="15" cols="15" name="address"><%=rs.getString("address")%></textarea><br><br>
<input type="submit" value="update">
	<%
		}
	%>
</body>
</html>