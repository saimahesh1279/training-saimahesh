import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Like {
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
		String query1="select name from student where name like'_a%'";
		ResultSet rs=st.executeQuery(query1);
		System.out.println("Customer name using _xyz");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		String query2="select name from student where name like'a%'";
		rs=st.executeQuery(query1);
		System.out.println("Customer name using xyz%");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		String query3="select name from student where name like'_a_%'";
		rs=st.executeQuery(query1);
		System.out.println("Customer name using _xyz_");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
}
}
