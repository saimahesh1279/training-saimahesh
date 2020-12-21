<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body background="KHMhkNq2.jpg">
<center>
<h1>Welcome to ADD  STUDENT Page</h1>
<a href="./admin_home.html">Home</a> |
<a href="./add_student.jsp">ADD Student</a> |
<a href="./add_alumini.html">ADD Alumini</a> |
<a href="./view_student.jsp">View Student</a> |
<a href="./alumini_request.jsp">ALUMINI REQUESTS</a> |
<a href="./view_alumini_list.jsp">VIEW ALUMINI LIST</a> |
<a href="./view_feedback.jsp">VIEW FEEDBACK</a> |
<a href="./index.html">logout</a>
<br><br>
<form action="./add_student" method="post" align="center"><br><br><br>
STUDENT ID :<input type="text" name="stdid" placeholder="Enter id"><br><br><br>
STUDENT NAME :<input type="text" name="stdname" placeholder="Enter name"><br><br><br>
STUDENT EMAIL :<input type="email" name="semail" placeholder="Enter email"><br><br><br>
PASSWORD :<input type="password" name="spassword" placeholder="Enter password"><br><br><br>
PRESENT YEAR :<input type="number" name="presentyr" placeholder="Enter present year"><br><br><br>
DEPARTMENT :<input type="text" name="department" placeholder="Enter department"><br><br><br>
MOBILE NUMBER :<input type="number" name="mobile" placeholder="Enter mobile number"><br><br><br>
ADDRESS : <textarea name="address"></textarea>
<br><br><br>
<input type="submit" value="submit">
</center>
</body>
</html>