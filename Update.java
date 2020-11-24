import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
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
		
		System.out.println("where u want to update \n1)name \n2)marks \n3)section");
		int choise=s.nextInt();
		if(choise==1)
		{
		Statement st=con.createStatement();
		String query="update student set sname='midhun' where sid=101";
		int i=st.executeUpdate(query);
		if(i!=0)
		{
			System.out.println("executed");
		}
		}
		else if(choise==2)
		{
			Statement st=con.createStatement();
			int num=s.nextInt();
			String query="update student set marks=marks+10 where sid="+num;
			int i=st.executeUpdate(query);
			if(i!=0)
			{
				System.out.println("executed");
			}
			}
		else if(choise==3)
		{
			Statement st=con.createStatement();
			int num=s.nextInt();
			String query="update student set section=B where sname="+num;
			int i=st.executeUpdate(query);
			if(i!=0)
			{
				System.out.println("executed");
			}
			}
		}
		}
