package com.MVC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEX {
public static Connection connectivity() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/hospital";
	String username = "root";
	String password = "root";
	return DriverManager.getConnection(url, username, password);
	
}
}
