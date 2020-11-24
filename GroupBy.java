import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GroupBy {
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
		String groupBy="select max(marks),section from student group by section";
		ResultSet rs= st.executeQuery(groupBy);
		System.out.println("munimum  ||  section");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+ rs.getString(2));
		}
}

}
