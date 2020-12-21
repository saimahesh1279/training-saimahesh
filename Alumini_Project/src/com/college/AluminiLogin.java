package com.college;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.AluminiData;


public class AluminiLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		AluminiData status;
		status=AluminiLoginBean.aluminiLogin(id, password);
		if(status!=null)
		{
			response.sendRedirect("./alumini_home.html?msg=user "+id+" sucessfully logined");
		}
		else
		{
			response.sendRedirect("./index.html?msg=user login unsucessfully");
		}
	
	}

}
