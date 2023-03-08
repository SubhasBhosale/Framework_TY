package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.collections4.map.HashedMap;

import com.mysql.cj.jdbc.Driver;

public class practice12 {
	
	Statement stat;
	Connection connection;
	public void practice12(String url,String usn,String pwd) throws SQLException 
	{
		// TODO Auto-generated method stub
            Driver d=new Driver();
            DriverManager.registerDriver(d);
            Connection connection = DriverManager.getConnection(url, usn, pwd);
            Statement stat = connection.createStatement();
            
     }
	public ArrayList<String> getDataFromDB(String query,String colName) throws SQLException
	{
	ArrayList<String> list = new ArrayList<>();
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString(colName));
		}
		return list;
	}

}
///////////////////////////public//////////////////////////