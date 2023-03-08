package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class update_database {

	public static void main(String[] args) throws SQLException
	{
                Driver dbdriver = new Driver();
                DriverManager.registerDriver(dbdriver);
                Connection connection = null;
                try {
                	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet46", "root","root");
                	Statement statement = connection.createStatement();
                	statement.executeUpdate("insert into student2 values('sunil','san','tycc044','1997/02/02')");
                    }
                finally {
                	connection.close();
                }
	}

}
