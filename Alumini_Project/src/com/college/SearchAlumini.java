package com.college;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.AluminiData;


public class SearchAlumini extends HttpServlet {
	
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("search");
		AluminiData status=null;
		status=SearchAluminiBean.searchAlumini(id);
		System.out.println(status);
		HttpSession ha=request.getSession();
		if(status!=null)
		{
			ha.setAttribute("details", status);
			response.sendRedirect("./viewstudent_alumini.jsp?msg=search sucessfull");
		}
		else
		{
			response.sendRedirect("./search_alumini.jsp?msg=search sucessfull");
		}
	}

}
