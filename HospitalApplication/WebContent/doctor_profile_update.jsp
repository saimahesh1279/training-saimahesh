<%@ page import="java.sql.*" %>
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String user="root";
String password="root";
String url="jdbc:mysql://localhost:3306/hospital";
con=DriverManager.getConnection(url,user,password);
int id=Integer.parseInt(request.getParameter("Did"));
String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
long mobile=Long.parseLong(phone);
String gender=request.getParameter("gender");
String specialization=request.getParameter("specialization");
String exp=request.getParameter("experiance");
int experiance=Integer.parseInt(exp);
String address=request.getParameter("address");

%>