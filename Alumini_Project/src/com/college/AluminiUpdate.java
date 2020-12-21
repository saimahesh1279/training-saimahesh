package com.college;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AluminiUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id =request.getParameter("stdid");
	String working_company=request.getParameter("company");
	String designation=request.getParameter("designation");
	boolean status=false;
	try {
		status = AluminiUpdateBean.aluminiUpdate(id,working_company,designation);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	if(status)
		{
		response.sendRedirect("./alumini.html?msg=updated sucessfully");
	}
	else
	{
		response.sendRedirect("./alumini.html?msg=updated Unsucessfully");
	}
	}

}
