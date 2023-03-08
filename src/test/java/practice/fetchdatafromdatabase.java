package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class fetchdatafromdatabase {

	public static void main(String[] args) throws SQLException 
	{
	  Driver dbdriver = new Driver();          //driver belongs to java.cj method
	  DriverManager.registerDriver(dbdriver);  //register driver to jdbc
	  Connection connection=null;
	  try {
		  //*************************connection is established with datbase**********************************
		  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet46", "root", "root");  //database-sdet46,localhost-localmachine,jdbc:mysql-protocol   
		  
		  //*********************************create statement ***************************
	  Statement statement = connection.createStatement();  //platform for executing the script
	  //***********************************execute the query*******************************
	 ResultSet result = statement.executeQuery("select * from student2;");     //we can write only dql for executequery 
	  
	  while(result.next())  //we have set of data it'll not follow order of insertion so we use while loop //to fetch data
		  
	  {
		  String empname = result.getString("firstName");
		  String lastname = result.getString("lastname");
		  
		  System.out.println(empname+" "+lastname);
	  }
	  }
	  finally
	  {
		  connection.close();
		  System.out.println("connection closed");
	  }
}}