<%@ include file="connect.jsp"%>

<%
String dname=(String)session.getAttribute("name");
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("update appointment set status=?,doctor_name=? where aid=?");
ps.setString(1, "accepted");
ps.setString(2, dname);
ps.setInt(3,id);
int a=ps.executeUpdate();
if(a!=0)
response.sendRedirect("view_appointment.jsp?msg=accepted");
%>