package com.college;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class AdminLogin extends HttpServlet {

       
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		boolean status = false;
		try {
			status = AdminLoginBean.login(id, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status) {
			response.sendRedirect("./admin_home.html?msg=Login Sucessfull");
		}else {
			response.sendRedirect("./admin_login.html?msg=Login UnSucessfull");
		}
	
	}

}
