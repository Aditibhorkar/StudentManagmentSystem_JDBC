package StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//student_management_system.student_info;
public class CreateStudent {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system","root","root");
		Statement statement=connection.createStatement();
		int result=statement.executeUpdate("INSERT INTO STUDENT_INFO VALUES (4,'Aditii',6527456388,'Nagour','Mech')");
		if (result!=0) {
			System.out.println("data inserted successfully");
		}
		else
		{
			System.out.println("data is not inserted");
		}
	}

}
