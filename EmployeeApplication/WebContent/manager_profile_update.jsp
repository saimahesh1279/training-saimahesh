<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String mname=request.getParameter("mname");
String email=request.getParameter("email");
String number=request.getParameter("phone");
long phone=Long.parseLong(number);
String gender=request.getParameter("gender");
String address=request.getParameter("address");
int experience=Integer.parseInt(request.getParameter("experience"));
String sql="update manager set mname=?,email=?,phone=?,gender=?,address=?,experience=? where mid=?";
ps=con.prepareStatement(sql);
ps.setString(1,mname);
ps.setString(2,email);
ps.setLong(3, phone);
ps.setString(4,gender);
ps.setString(5,address);
ps.setInt(6, experience);
ps.setInt(7, id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./manager_profile.jsp?msg=updated sucessfully");
else
	response.sendRedirect("./update_manager_profile.jsp?id="+id+"msg=update failed");
%>