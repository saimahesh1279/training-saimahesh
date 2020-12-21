package com.college;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddAlumini extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id=request.getParameter("aid");
	String name=request.getParameter("stdname");
	String password=request.getParameter("password");
	String department=request.getParameter("department");
	int passedoutyr=Integer.parseInt(request.getParameter("passedoutyr"));
	long mobile=Long.parseLong(request.getParameter("mobile"));
	String address=request.getParameter("address");
	int percentage=Integer.parseInt(request.getParameter("percentage"));
	String workingcompany=request.getParameter("workingcompany");
	String designation=request.getParameter("designation");
	boolean status;
	status=AddAluminiBean.addAlumini(id,name,password,department,passedoutyr,mobile,address,percentage,workingcompany,designation);
	if(status)
	{
		response.sendRedirect("./add_alumini.html?msg=sucessfully added "+id+"  alumini details ");
	}
	else {
		response.sendRedirect("./add_alumini.html?msg=Unsucessfully added "+id+"  alumini details ");
	}
	}

}
