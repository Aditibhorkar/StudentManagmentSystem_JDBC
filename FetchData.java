package StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system","root","root");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT * FROM STUDENT_INFO ");
		while(resultSet.next())
		{
			System.out.println("student_id :"+resultSet.getInt("student_id"));
			System.out.println("student_name :"+resultSet.getString("student_name"));
			System.out.println("student_phone :"+resultSet.getLong("student_phone"));
			System.out.println("student_address :"+resultSet.getString("student_address"));
			System.out.println("student_branch :"+resultSet.getString("student_branch"));
			System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*..*.*.*.*.*.*.*");
		}
	}
}
