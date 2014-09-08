package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class readDB 
{
	Connection conn = null;
	PreparedStatement prepareStatement = null;
	ResultSet result = null;
	ArrayList<String> listFromDb = new ArrayList<String>();
	ArrayList<String> list = new ArrayList<String>();
	int id;
	String name;
	String lastName;
	int phone;
	String mail;
	
	
	
	public void dataBaseRead() throws SQLException
	{
		
		
		
		
		try 
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");
			prepareStatement = conn.prepareStatement("SELECT * FROM customers ORDER BY id DESC LIMIT 1 ");
			result = prepareStatement.executeQuery();
			
			while(result.next())
			{
				
				listFromDb.add(result.getString("name"));
				listFromDb.add(result.getString("last_name"));
				listFromDb.add(result.getString("phone"));
				listFromDb.add(result.getString("email"));
				
			}
			
			
			
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
	
	public String arrayToString() throws SQLException 
	{
		dataBaseRead();
				
		String s = listFromDb.toString();
		
		return s;
		
		
		
	}
	
}
