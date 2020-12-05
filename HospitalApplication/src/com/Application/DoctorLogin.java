package com.Application;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class DoctorLogin extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	String user="root";
	String password="root";
	String url="jdbc:mysql://localhost:3306/hospital";
	try {
		 con=DriverManager.getConnection(url,user,password);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		PrintWriter pw=response.getWriter();
		String query="select * from doctor where email=? and password=?";
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			
		

			ResultSet rs=ps.executeQuery();
			HttpSession hs=request.getSession();
			if(rs.next())
			{
				hs.setAttribute("id",  rs.getInt(1));
				hs.setAttribute("name", rs.getString(2));
				hs.setAttribute("demail", email);
				hs.setAttribute("specialization", rs.getString("specialization"));
				response.sendRedirect("./doctor_home.html?msg=loggedin");
			}else
			{
				pw.println("<html> <body bgcolor='wheat'><center><h1>");
				pw.println("doctor login failed");
				pw.println("</h1> </center> </html>");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
