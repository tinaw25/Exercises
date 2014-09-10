package Database;

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
	String name;
	
	public void dataBaseRead(String name) throws SQLException
	{
		
		try 
		{
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/zalando?user=root&password=");
			prepareStatement = conn.prepareStatement("SELECT * FROM products WHERE brand LIKE '%"+ name + "%'");
			result = prepareStatement.executeQuery();
			
			while(result.next())
			{
				
				listFromDb.add(result.getString("product_name"));
				listFromDb.add(result.getString("brand"));
				listFromDb.add(result.getString("price"));
				listFromDb.add(result.getString("size"));
				listFromDb.add(result.getString("picture"));
				listFromDb.add(result.getString("description"));
				listFromDb.add(result.getString("delevery_time"));
				listFromDb.add(result.getString("goods_number"));
				listFromDb.add(result.getString("category"));
				
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
		dataBaseRead(name);
				
		String listString = listFromDb.toString();
		
		
		return listString;
		
		
		
	}
	
}
