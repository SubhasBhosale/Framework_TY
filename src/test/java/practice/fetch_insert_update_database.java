package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class fetch_insert_update_database
{

	public static void main(String[] args) throws SQLException
	{
		Driver dbdriver = new Driver();
		DriverManager.registerDriver(dbdriver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet46", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from student2;");
		int size = result.getMetaData().getColumnCount();
		for(int i=1;i<=size;i++)
		{
			System.out.println(result.getMetaData().getColumnName(i));
		}
		int result2 = statement.executeUpdate("insert into student2 values('suraj','sandy','rj044','1997/02/02');");
		if(result2==1)
		{
			System.out.println("query is inserted");
		}
		int result3 = statement.executeUpdate("update student2 set firstName='Iron Man' where lastname='sandy';");
            while(result.next())
            {
            	String fn = result.getString("firstName");
            	String ln = result.getString("lastname");
            	String rn = result.getString("Rollno");
            	String dob = result.getString("DOB");

    			System.out.println(fn+" "+ln+" "+rn+" "+dob);
            }
           
	}

}
