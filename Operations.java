import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Operations {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Scanner  s=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/mysql";
	String user="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, user, password);
	if(con!=null)
	{
		System.out.println("connection established");
	}
	Statement st=con.createStatement();
	String operations="select sum(marks),avg(marks),min(marks),max(marks),count(*) from student";
	ResultSet rs=st.executeQuery(operations);
	System.out.println("total || average || minimum || maximum || count ");
	while(rs.next())
	{
		 System.out.println(rs.getInt(1)+" || "+rs.getInt(2)+" || "+rs.getInt(3)+" || "+rs.getInt(4)+" || "+rs.getInt(5));
	}
	}
}