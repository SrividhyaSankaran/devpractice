package devpractice.Others;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection {
	
	public static void main(String[] arg) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/vidhdb","root","Admin@123");
		
		Statement st = con.createStatement();
		String query = "Select * from users";
		ResultSet rs = st.executeQuery(query);
	}
}
