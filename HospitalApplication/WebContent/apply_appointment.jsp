<%@ include file="connect.jsp"%>
<%
int pid=(Integer)session.getAttribute("id");
String patient_name=request.getParameter("name");
long phone =Long.parseLong(request.getParameter("phone"));
String email=request.getParameter("email");
String gender=request.getParameter("gender");
String bloodGroup=request.getParameter("blood_group");
String specialist=request.getParameter("specialist");
String date=request.getParameter("date_of_appointment");
String time=request.getParameter("time_of_appointment");
String sql="insert into appointment(pname,phone,email,gender,Blood_group,specialist,date_of_appointment,time_of_appointment,pid) values(?,?,?,?,?,?,?,?,?)";
ps=con.prepareStatement(sql);
ps.setString(1, patient_name);
ps.setLong(2, phone);
ps.setString(3, email);
ps.setString(4, gender);
ps.setString(5, bloodGroup);
ps.setString(6, specialist);
ps.setString(7, date);
ps.setString(8, time);
ps.setInt(9,pid);
int x=ps.executeUpdate();
if( x!=0)
{
	response.sendRedirect("appointment.jsp?msg=applied_sucessfully");
}
%>

