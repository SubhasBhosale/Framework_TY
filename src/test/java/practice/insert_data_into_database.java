package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.github.dockerjava.api.model.Driver;

public class insert_data_into_database {

	public static void main(String[] args) throws SQLException
	{
	com.mysql.cj.jdbc.Driver dbdriver = new	com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(dbdriver);
	Connection connection = null;
	try {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet46", "root","root");
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into student2 values('siraj','sundar','ty044','1997/04/04')");
	        if(result==1)
	        {
	        	System.out.println("row is added");
	        }
	
	}
	finally {
		connection.close();
		System.out.println("database closed");
	}
	}

}
