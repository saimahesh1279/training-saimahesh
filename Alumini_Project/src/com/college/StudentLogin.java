package com.college;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Student;


public class StudentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		Student status=null;
		try {
			status = StudentLoginBean.login(id, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession hs=request.getSession();
		if(status.getPresentyr()==4) {
			hs.setAttribute("id", id);
			response.sendRedirect("./fouthyrStudent.html?msg=Login Sucessfull");
		}else if(status.getPresentyr()<4) {
			hs.setAttribute("id", id);
			response.sendRedirect("./student_home.html?msg=Login Sucessfull");
		}
		else {
			response.sendRedirect("./student_login.html?msg=Login UnSucessfull");
		}
	}

}
