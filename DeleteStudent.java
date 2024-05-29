package StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system","root","root");
		Statement statement=connection.createStatement();
		int i=statement.executeUpdate("DELETE STUDENT_INFO WHERE STUDENT_ID=1");
		if (i!=0) {
			System.out.println("Data deleted successfully");
		}
		else
		{
			System.out.println("Data is not deleted");
		}
	}


}
