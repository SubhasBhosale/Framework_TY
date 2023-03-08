package ecomm_genericutility_webaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.mysql.cj.jdbc.Driver;
/**
 * 
 * @author Subhas bhosale
 */
public class DatabaseUtility 
{
	Connection connection;
	Statement statement;
	/**
	 * This method is used to connect with the database
	 * @param dbUrl
	 * @param dbUserName
	 * @param dbPassword
	 * @throws SQLException
	 */
	public  DatabaseUtility(String dbUrl,String dbUserName,String dbPassword) throws SQLException   
	       //return type don't mention in constructor
	//we are in database so only driverManager WebDriverManager not required it is for webapplication
	{
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		 connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		 statement = connection.createStatement();
		
	}
	/**
	 * This is the method which fetch the data from the database  
	 * @param query
	 * @param colName
	 * @return
	 * @throws SQLException
	 */

	public ArrayList getDataFromDataBase(String query,String colName) throws SQLException
	{
		ArrayList<String> list = new ArrayList<>();       //Arraylist size is dynamic in nature(change according to data)   
		ResultSet result = statement.executeQuery(query);    //resultset set of data
		while(result.next())                                 //we took loop bcz we don't know how many datas are present
		{
			list.add(result.getString(colName));              
		}
		return list;
	}
	/**
	 * This is the method used to verify the data in the database
	 * @param query
	 * @param colName
	 * @param expectedData
	 * @return
	 * @throws SQLException
	 */

	public boolean validateDataInDatabase(String query,String colName,String expectedData) throws SQLException
	{
		ArrayList<String> list1=getDataFromDataBase(query, colName);
		boolean flag=false;
		for(String actData:list1)
		{
			if(actData.equalsIgnoreCase(expectedData))
			{
				flag=true;
				break;
			}		
		}
		return flag;
	}
	/**This method is used to insert data into databse
	 * @throws SQLException 
	 * 
	 */
	public void setDataInDataBase(String query) throws SQLException
	{
            int result = statement.executeUpdate(query);
            if(result>1)
            {
            	System.out.println("Data entered/modified successfully");
            }
	}
	/**
	 * This method is used to close the database connection
	 */
	public void closeDbConnection()
	{
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("While closing the Database connection we got above exception");
		}
	}
}