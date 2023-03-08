package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;
import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class rmgtestingserver_SQL_UI1 {
	public static void main(String[] args) throws SQLException
	{
		long random = new Faker().number().randomNumber(3,true);
		String z = "selenium"+random;
		Driver dbdriver = new Driver();          //driver belongs to java.cj method
		DriverManager.registerDriver(dbdriver);  //register driver to jdbc
		Connection connection = null;
		try {
			//*******************connection is established with datbase*************************************
			connection=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");  //database-sdet46,localhost-localmachine,jdbc:mysql-protocol   


			//**********************************create statement ********************************************
			Statement statement = connection.createStatement();  //platform for executing the script


			//**********************************execute the query********************************************
			ResultSet result = statement.executeQuery("select * from project;");   //query for get column name starts from here
			int size = result.getMetaData().getColumnCount();  //to get no of columns
			for(int i=1;i<=size;i++)   //to get the column name in the data base
			{
				String col_names = result.getMetaData().getColumnName(i);
				System.out.println(col_names);
			}  //till here query is there to execute 

			//*****************************insert row in the database********************************************
			int res = statement.executeUpdate("insert into project values('"+z+"' ,'shubham','1997/02/02','selenium412','Created','2');");
			if(res==1)
			{
				System.out.println("row is created in database");
			}

		}
		finally
		{
			connection.close(); 
		}
		String Project_name="selenium422";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");	
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
		//button[text()='Sign in']
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		/*  driver.findElement(By.xpath("//span[.='Create Project']")).click();
		   driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("selenium422");
		   driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("shubham");
		   WebElement Q1 = driver.findElement(By.xpath("//input[@name='createdBy']/../following-sibling::div/select[@name='status']"));
		   Select sel=new Select(Q1);
		   sel.selectByVisibleText("Completed");
		   driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();*/
		List<WebElement> P1 = driver.findElements(By.xpath("//table[@class='table table-striped table-hover']//td[2]"));
		for(WebElement P2:P1)
		{
			String P3 = P2.getText();
			if(Project_name.equals(P3))
			{
				System.out.println("project name is created in UI");
			}
		}
		driver.close();
	}
}

