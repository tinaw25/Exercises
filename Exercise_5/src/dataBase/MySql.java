package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySql 
{
	
	
	public void insertDB(String name, String lastName, int phone, String mail) throws SQLException
	{
		
		Connection conn = null;
		PreparedStatement prepareStatement = null;
	
		try 
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");
			prepareStatement = conn.prepareStatement("INSERT INTO customers VALUES(default, ?, ?, ?, ?)");
			prepareStatement.setString(1,name);
			prepareStatement.setString(2,lastName);
			prepareStatement.setInt(3, phone);
			prepareStatement.setString(4,mail);
			
			
			
			prepareStatement.executeUpdate();
			
			
			
		} 
		catch (SQLException e) 
		{
			System.err.println(e);
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
			}
			
		}
	}
}
