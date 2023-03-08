package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SQL_database {                         //rmgtestingserver

	
	public static void main(String[] args) throws SQLException
	{
		Driver dbdriver=new Driver();     //specify driver
		DriverManager.registerDriver(dbdriver);   //register with data base                                                                                                   
		Connection connection = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("select * from project");
	  for(int i=1;i<=result.getMetaData().getColumnCount();i++)
	  {
		  System.out.println(result.getMetaData().getColumnName(i));
	  }
	
	}

}
