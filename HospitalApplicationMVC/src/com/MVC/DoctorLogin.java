package com.MVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DoctorLogin extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		HttpSession hs=request.getSession();
		DoctorRegisterBean rb=null;
		try {
			rb = new DoctorLoginBean().login(email,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rb!=null) {
			    hs.setAttribute("doctorDetails", rb);
				hs.setAttribute("id",  rb.getId());
				hs.setAttribute("name", rb.getDname());
				hs.setAttribute("specialist",rb.getSpecialization());
				response.sendRedirect("./doctor_home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./doctor_login.html?msg=login failed");

	}

}