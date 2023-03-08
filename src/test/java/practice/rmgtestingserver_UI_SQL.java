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

public class rmgtestingserver_UI_SQL {

	public static void main(String[] args) throws SQLException
	{
		String Project_name="selenium422";
		 long random = new Faker().number().randomNumber(3,true);
		 String exp_proj_name = "selenium"+random;
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
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		   driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(exp_proj_name);
		   driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("shubham");
		   WebElement Q1 = driver.findElement(By.xpath("//input[@name='createdBy']/../following-sibling::div/select[@name='status']"));
		   Select sel=new Select(Q1);
		   sel.selectByVisibleText("Completed");
		   driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
			List<WebElement> P1 = driver.findElements(By.xpath("//table[@class='table table-striped table-hover']//td[2]"));
			for(WebElement P2:P1)
			{
				String P3 = P2.getText();
				if(Project_name.equals(P3))
				{
					System.out.println("project name is created in UI");
				}
			}
			Driver dbdriver = new Driver();
			DriverManager.registerDriver(dbdriver);
			Connection connection = null;
			try
			{
				connection=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
				System.out.println("connection established");
				Statement statement = connection.createStatement();
				System.out.println("plateform created");
				ResultSet result = statement.executeQuery("select Project_name from project;");
				System.out.println("query executed");
				int size = result.getMetaData().getColumnCount();
				System.out.println("got the no count");
				for(int i=1;i<=size;i++)
				{
				boolean Z = result.getMetaData().getColumnName(i).equals(exp_proj_name);
		                   if(Z=true)
		                   {
		                	   System.out.println("data is saved in the backend");
		                   }
		                   else
		                   {
		                	   System.out.println("data is not present in backend");
		                   }
				}
			}
		finally
		{
			
		}
	}

}
