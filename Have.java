
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Have {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/motivity";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection established");
		Statement st = con.createStatement();
		String have="select max(marks) ,section from student group by section having section = 'A'";
		ResultSet rs=st.executeQuery(have);
		System.out.println("maximum     ||   section");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"     ||     "+rs.getString(2));
		}
	}

}