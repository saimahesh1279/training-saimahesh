package com.college;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.AluminiUpdate;

public class AcceptUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		AluminiUpdate a=AluminiUpdateBean.getById(id);
		boolean status=false;
		status=AcceptUpdateBean.acceptUpdate(a.getAid(), a.getWorking_company(), a.getDesignation());
		if(status)
		{
			response.sendRedirect("./alumini_request.jsp?msg=sucessfully updated");
		}
		else {
			response.sendRedirect("./alumini_request.jsp?msg=unsucessfully updated");
		}
		

	}

}
