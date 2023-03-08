package practice;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class new1 {

	public static void main(String[] args) throws SQLException 
	{
         Driver dbdriver = new Driver();
         DriverManager.registerDriver(dbdriver);
         int Q=123;    String Z="abc";
         System.out.println(Q+""+Z);
	}

}
