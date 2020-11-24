
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertQuery {
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
	System.out.println("enter number of students : ");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println("enter student "+i+" details");
		System.out.println("enter student id : ");
		int id=s.nextInt();
		System.out.println("enter student firstname : ");
		String name=s.next();
		System.out.println("enter last name : " );
		name+=" "+s.next();
		System.out.println("enter student marks : ");
		int marks=s.nextInt();
		System.out.println("enter student section : ");
		String section=s.next();
		String query="insert into student values(" +id+",'"+name+"',"+marks+",'"+section+"')";
		System.out.println(query);
		int j=st.executeUpdate(query);
		if(j!=0)
		{
			System.out.println("query executed ");
		}
	}
	
	
	
}
}