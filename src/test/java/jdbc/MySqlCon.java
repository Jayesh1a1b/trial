package jdbc;

import java.sql.*;

public class MySqlCon {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/study";
		String username="root";
		String password="Jayesh@1a1b";
		
		
		//create connection
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("connected to database");
			
			//create statement
		
			Statement stmt=connection.createStatement();
			
			//execute statement and store result into result set
			ResultSet rs = stmt.executeQuery("select * from testing");
			while(rs.next())
			{
				String name = rs.getString("Name");
				int id = rs.getInt("Id");
				System.out.println("empid:"+id);
				System.out.println("emp name:"+name);
			}
			
			//close connection
			connection.close();
			
			
		} catch (SQLException e) {
			
			System.out.println("connection failed: " +e.getMessage());
		}
		
		
		  
	}

}
