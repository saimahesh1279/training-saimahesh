package com.college;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Feedback;

public class TakeFeedback extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] teacherid=request.getParameterValues("tid");
		String[] rating=request.getParameterValues("rating");
		String[] remark=request.getParameterValues("remark");
		HttpSession hs=request.getSession();
		String stdid=(String)hs.getAttribute("id");
		boolean status=false;
		for (int i = 0; i < teacherid.length && i < rating.length && i<remark.length; i++) {
			if (Integer.parseInt(teacherid[i]) != 0) {
				Feedback fe=new Feedback();
				fe.setTeacherid(Integer.parseInt(teacherid[i]));
				fe.setStdid(stdid);
				fe.setRemarks(remark[i]);
				fe.setRating(Integer.parseInt(rating[i]));
				status=FeedbackBean.saveFeedback(fe);
			}
		}
		if(status)
		{
			response.sendRedirect("./fouthyrStudent.html?msg=feedback sucessfully");
		}
		else
		{
			response.sendRedirect("./feedback.jsp?msg=feedback unsucessfully");
		}
	}

}
