package com.college;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("stdid");
		String name=request.getParameter("stdname");
		String email=request.getParameter("semail");
		String password=request.getParameter("spassword");
		int presentyr=Integer.parseInt(request.getParameter("presentyr"));
		String department=request.getParameter("department");
		Long mobile=Long.parseLong(request.getParameter("mobile"));
		String address=request.getParameter("address");
		boolean status=false;
		try {
			status = AddStudentBean.addStudent(id,name,email,password,presentyr,department,mobile,address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			response.sendRedirect("./add_student.jsp?msg=sucessfully added student");
		}
		else {
			response.sendRedirect("./add_student.jsp?msg=sucessfully student not added");
		}
		
				}

}
