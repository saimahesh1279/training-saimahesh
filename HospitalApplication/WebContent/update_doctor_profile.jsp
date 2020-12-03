<!DOCTYPE html>
<html>

<body bgcolor="Wheat">
<br><br>

<br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Doctor Profile</a>
<a href="index.html">Logout</a>
<br> <br><br>
<%@ page import="java.sql.*" %>
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String user="root";
String password="root";
String url="jdbc:mysql://localhost:3306/hospital";
con=DriverManager.getConnection(url,user,password);
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from doctor where Did=?");
ps.setInt(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>
<form action="./doctor_profile_update.jsp" align="center">

<center><h1>Welcome to doctor update page</h1></center>
<br><br><br>
<center>
<input type="text" name="name" value="<%=rs.getString("dname")%>"><br><br><br>
<input type="email" name="email" value="<%=rs.getString("email")%>"><br><br>
<input type="number" name="phone" value="<%=rs.getInt("phone")%>"><br>
<input type="radio" name="gender" value="<%=rs.getString("gender")%>"> Male
<input type="radio" name="gender" value="<%=rs.getString("gender")%>">Female<br>
<select name="specialization">
<option value="<%=rs.getString("specialization")%>"><%=rs.getString("specialization")%></option>
<option value="Dentist" >DENTIST</option>
<option value="Cardio" >CARDIO</option>
<option value="ENT" >ENT</option>
</select><br><br>
<input type="number" name="experiance" value="<%=rs.getString("experiance")%>"><br><br>
<textarea rows="7" cols="7" name="address"><%=rs.getString("address")%></textarea><br><br>
<input type="submit" name="register">
</center>
</form>
<%}%>
</body>
</html>