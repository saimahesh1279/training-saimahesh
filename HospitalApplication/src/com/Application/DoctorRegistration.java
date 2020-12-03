package com.Application;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DoctorRegistration extends HttpServlet {
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
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String gender=request.getParameter("gender");
		String specialization=request.getParameter("specialization");
		System.out.println(specialization);
		String exp=request.getParameter("experiance");
		int experiance=Integer.parseInt(exp);
		String address=request.getParameter("address");
		
		PrintWriter pw=response.getWriter();
		String sql="insert into doctor(dname,password,email,phone,gender,specialization,experiance,address) values(?,?,?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setLong(4, mobile);
			ps.setString(5, gender);
			ps.setString(6, specialization);
			ps.setInt(7, experiance);
			ps.setString(8, address);
			
			int x=ps.executeUpdate();
			if(x!=0)
			{
				pw.println("<html> <body bgcolor='wheat'><center><h1>");
				pw.println("Doctor registered  sucessfully");
				pw.println("</h1> </center> </html>");
			}
			else
			{
				pw.println("<html> <body bgcolor='wheat'><center><h1>");
				pw.println("doctor registration failed");
				pw.println("</h1> </center> </html>");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
